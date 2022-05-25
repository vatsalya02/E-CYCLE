package com.project.SDP3PROJECT;

import javax.servlet.ServletException;

import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
/*import org.springframework.util.StringUtils;*/
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import org.springframework.ui.Model;
import java.util.List;
import java.util.Optional;
@Controller
public class ApplicationController
{
	@Value("${upoadDir}")
	private String uploadFolder;
	@Autowired
	UserService userService;
	@Autowired
	UserRepository ur;
	@Autowired
	 ImageService imageService ;
	@Autowired
	 VideoService videoservice ;
	@Autowired
	 UserVideoService uservideoservice ;
	@Autowired
	 ProductService productservice ;
	@Autowired
	 ContactService cs;
	@Autowired
	 CheckOutService chs;
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@RequestMapping ("/login-user")
	public String loginUser(@RequestParam String email,Model model,@RequestParam String password, HttpSession session,HttpServletRequest request,Model Map) {
		if(email.equals("admin@gmail.com")&&password.equals("System@klu")) {
			 session=request.getSession();
		 	 String n=(String)session.getAttribute("email");
		 	 List<UserDetails> userdetails=userService.getAllUsers();
		 	int usercount=userdetails.size();
		 	 Map.addAttribute("usercount",usercount);
		 	 List<Imagedetails> image=imageService.getAll();
		 	 int count=image.size();
		 	 Map.addAttribute("count",count);
		 	 List<Video> v=videoservice.getAll();
		 	 int vcount=v.size();
		 	Map.addAttribute("vcount",vcount);
		    return "admin";
			
		}
		if(email.equals("vendor@gmail.com")&&password.equals("Vendor@klu")) {
			return "vendorhome";
		}
		/*
		 * System.out.println(email); System.out.println(password);
		 */
		if(userService.findByEmailAndPassword(email,password)!=null) {
			session=request.getSession();  
			session.setAttribute("email",email); 
			model.addAttribute("msg", "Login Sucessfully!!!");
			return "main";
		}
		else{
			model.addAttribute("msg", "InVaild Credentials!!!");
			return "login";
		}
		
		
	}
	@RequestMapping("/save_image")
	   public String  saveimage(@RequestParam String itemname,@RequestParam String description,@RequestParam String category,@RequestParam("image") MultipartFile multipartFile,HttpSession session,HttpServletRequest request,Model model) throws IOException 
	 {
			 	session=request.getSession();
			 	 String n=(String)session.getAttribute("email");  
			 	model.addAttribute("email",n);
			 	String uploadDirectory = request.getServletContext().getRealPath(uploadFolder);
				log.info("uploadDirectory:: " + uploadDirectory);
				String fileName = multipartFile.getOriginalFilename();
				String filePath = Paths.get(uploadDirectory, fileName).toString();
				log.info("FileName: " + multipartFile.getOriginalFilename());
				if (fileName == null || fileName.contains("..")) {
					model.addAttribute("invalid", "Sorry! Filename contains invalid path sequence \" + fileName");
					/*
					 * return new ResponseEntity<>("Sorry! Filename contains invalid path sequence "
					 * + fileName, HttpStatus.BAD_REQUEST);
					 */
				}
				Date createDate = new Date();
				try 
				{
					File dir = new File(uploadDirectory);
					if (!dir.exists()) {
						log.info("Folder Created");
						dir.mkdirs();
					}
					// Save the file locally
					BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filePath)));
					stream.write(multipartFile.getBytes());
					stream.close();
				} 
				catch (Exception e) {
					log.info("in catch");
					e.printStackTrace();
				}
				byte[] imageData = multipartFile.getBytes();
				Imagedetails image = new Imagedetails();
				image.setName(fileName);
				image.setData(imageData);
				image.setEmail(n);
				image.setDescription(description);
				image.setCreateDate(createDate);
				image.setCategory(category);
				imageService.store(image);
				log.info("HttpStatus===" + new ResponseEntity<>(HttpStatus.OK));
				model.addAttribute("message","Image Uploaded Sucessfully!!!!");
				if(category.equals("Plastic")) {
					return "single2";
				}
				else if(category.equals("Tin")) {
					return "single1";
				}
				else if(category.equals("E-Waste")) {
					return "single3";
				}
				else if(category.equals("Cermaic")) {
					return "single4";
				}
				else if(category.equals("Glass")){
					return "single5";
				}
				else if(category.equals("Other")) {
					return "single6";
				}
				
				return "error";
		
	}
	@RequestMapping("/displayitems")
	public String displayitems(Model map,HttpSession session,HttpServletRequest request) {
		
		session=request.getSession();
	 	 String n=(String)session.getAttribute("email");  
	 	
			List<Imagedetails> items = imageService.getAllItems(n);
			map.addAttribute("items", items);
			return "items";
	 	
	}
	
	@GetMapping("/image/display/{Name}")
	@ResponseBody
	void showImage(@PathVariable("name") String name, HttpServletResponse response, Optional<Imagedetails> product)
			throws ServletException, IOException {
		log.info("Name :: " + name);
		product = imageService.findByName(name);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		response.getOutputStream().write(product.get().getData());
		response.getOutputStream().close();
	}

	/*
	 * @RequestMapping(value="/cart/add",method = RequestMethod.POST) void cart_add(
	 * String request)throws ServletException, IOException {
	 * log.info(request.toString()); }
	 */
	@RequestMapping("/viewusers")
	public String viewusers(Model map,HttpSession session,HttpServletRequest request) {
		List<UserDetails> users = userService.getAllUsers();
		map.addAttribute("users", users);
		return "viewuser";
	 	
	}
	@RequestMapping("/uploadvideo")
	public String uploadvideo(@RequestParam String name,@RequestParam String category,@RequestParam String video,Model m,HttpSession session,HttpServletRequest request){
		
		Video v=new Video();
		v.setName(name);
		v.setCategory(category);
		v.setUrl(video);
		int i=videoservice.uploadvideo(v);
		if(i==1) {
			m.addAttribute("msg","Video Uploaded Sucessfully!!");
			return "upload";
		}
		return "error";
		
	}
	@RequestMapping("/saveuservideo")
	public String saveuservideo(@RequestParam String videotitle,@RequestParam String category,@RequestParam String videourl,Model m,HttpSession session,HttpServletRequest request){
		
		session=request.getSession();
	 	 String n=(String)session.getAttribute("email");
	 	 UserVideo v=new UserVideo();
		v.setName(videotitle);
		v.setCategory(category);
		v.setUrl(videourl);
		v.setEmail(n);
		int i=uservideoservice.uploadvideo(v);
		if(i==1) {
			m.addAttribute("msg","Video Uploaded Sucessfully!!");
			return "userupload";
		}
		return "error";
		
	}
	@RequestMapping("/displayimages")
	public String displayimages(Model map,HttpSession session,HttpServletRequest request) {
			List<Imagedetails> items = imageService.getAll();
			map.addAttribute("items", items);
			return "viewimage";
	}
	@RequestMapping("/viewvideo")
	public String viewvideo(Model map,HttpSession session,HttpServletRequest request) {
		List<UserVideo> videos =uservideoservice.getAll();
		map.addAttribute("videos", videos);
		return "viewvideo";
}
	@RequestMapping("/viewuservideos")
	public String viewuservideos(Model map,HttpSession session,HttpServletRequest request) {
		List<UserVideo> videos =uservideoservice.getAll();
		map.addAttribute("videos", videos);
		return "viewuservideos";
}
	@RequestMapping("/uploadproduct")
	   public String  uploadproduct(@RequestParam String name,@RequestParam String category,@RequestParam String price,@RequestParam("image") MultipartFile multipartFile,HttpSession session,HttpServletRequest request,Model model) throws IOException 
	 {
			 	session=request.getSession();
			 	 String n=(String)session.getAttribute("email");  
			 	model.addAttribute("email",n);
			 	String uploadDirectory = request.getServletContext().getRealPath(uploadFolder);
				log.info("uploadDirectory:: " + uploadDirectory);
				String fileName = multipartFile.getOriginalFilename();
				String filePath = Paths.get(uploadDirectory, fileName).toString();
				log.info("FileName: " + multipartFile.getOriginalFilename());
				if (fileName == null || fileName.contains("..")) {
					model.addAttribute("invalid", "Sorry! Filename contains invalid path sequence \" + fileName");
					/*
					 * return new ResponseEntity<>("Sorry! Filename contains invalid path sequence "
					 * + fileName, HttpStatus.BAD_REQUEST);
					 */
				}
				Date createDate = new Date();
				try 
				{
					File dir = new File(uploadDirectory);
					if (!dir.exists()) {
						log.info("Folder Created");
						dir.mkdirs();
					}
					// Save the file locally
					BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filePath)));
					stream.write(multipartFile.getBytes());
					stream.close();
				} 
				catch (Exception e) {
					log.info("in catch");
					e.printStackTrace();
				}
				byte[] imageData = multipartFile.getBytes();
				Product image = new Product();
				image.setName(fileName);
				image.setData(imageData);
				image.setEmail(n);
				image.setCreateDate(createDate);
				image.setCategory(category);
				image.setPrice(price);
				productservice.saveproduct(image);
				log.info("HttpStatus===" + new ResponseEntity<>(HttpStatus.OK));
				model.addAttribute("message","Uploaded Sucessfully!!!!");
				return "sellproduct";
		
	}
	@RequestMapping("/savecontact")
	public String savecontact(Contact model,Model m) throws IOException{
		cs.savedeatils(model);
		return "end";
		
	}
	@RequestMapping("/savepaymentdetails")
	public String savepaymentdetails(Checkout model,Model m) throws IOException{
		chs.savepayment(model);
		return "end";
		
	}
}

