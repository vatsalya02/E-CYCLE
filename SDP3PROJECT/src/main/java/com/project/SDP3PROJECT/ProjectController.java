package com.project.SDP3PROJECT;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ProjectController {
	@Autowired
	private UserService userService;
	@Autowired
	private ImageService imageservice;
	@Autowired
	private UserVideoService uservideoservice;
	@Autowired
	private VideoService videoservice;
	@Autowired
	private ProductService productservice;
    @RequestMapping("")
    public String test() {
        return "index";
    }
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
	@RequestMapping("/login")
	public String login() {
	    return "login";
	}
	@RequestMapping("/userdetails")
	public String userdetails(UserDetails model,Model m){
		//UserDetails user=userService.findByEmailAndPassword(model.getEmail(), model.getPassword());
		if(userService.findByEmailAndPassword(model.getEmail(), model.getPassword())!=null) {
			UserDetails user=userService.findByEmailAndPassword(model.getEmail(), model.getPassword());
			if(user.getEmail().equals(model.getEmail())){
				m.addAttribute("msg","Already having an account.Please do Login.....");
				return "login";
			}
		}
		else {
		int i=userService.saveMyUser(model);
		if(i==1) {
			m.addAttribute("msg","Registered Sucessful !!");
			return "login";
		}
		}
		return "register unsucessful";
	}
	@RequestMapping("/updateuserdetails")
	public String updateuserdetails(@RequestParam String email,@RequestParam String password) {
		System.out.println(email);
		int i=userService.updateUser(email,password);
		if(i==1) {
			return "login";
		}
	    return "forgotpwd";
	}
	@RequestMapping("/main")
	public String main() {
	    return "main";
	}
	@RequestMapping("/image")
	public String image() {
	    return "image";
	}
	@RequestMapping("/register")
	public String register() {
	    return "register";
	}
	@RequestMapping("/status")
	public String status() {
	    return "status";
	}
	@RequestMapping("/forgotpwd")
	public String forgotpwd() {
	    return "forgotpwd";
	}
	@RequestMapping("/showitems")
	public String showitems() {
	    return "showitems";
	}
	@RequestMapping("/items")
	public String items() {
	    return "items";
	}
	@RequestMapping("/viewimage")
	public String viewimage() {
	    return "viewimage";
	}
	@RequestMapping("/admin")
	public String admin(HttpSession session,HttpServletRequest request,Model Map) {
		session=request.getSession();
	 	 String n=(String)session.getAttribute("email");
	 	 List<UserDetails> userdetails=userService.getAllUsers();
	 	int usercount=userdetails.size();
	 	 Map.addAttribute("usercount",usercount);
	 	 List<Imagedetails> image=imageservice.getAll();
	 	 int count=image.size();
	 	 Map.addAttribute("count",count);
	 	 List<Video> v=videoservice.getAll();
	 	 int vcount=v.size();
	 	Map.addAttribute("vcount",vcount);
	    return "admin";
	}
	@RequestMapping("/upload")
	public String upload() {
	    return "upload";
	}
	@RequestMapping("/userupload")
	public String userupload() {
	    return "userupload";
	}
	@RequestMapping("/sellproduct")
	public String sellproduct() {
	    return "sellproduct";
	}
	@RequestMapping("/profile")
	public String profile(HttpSession session,HttpServletRequest request,Model Map) {
		session=request.getSession();
	 	 String n=(String)session.getAttribute("email");
	 	 UserDetails userdetails=userService.findByEmail(n);
	 	 Map.addAttribute("users",userdetails);
	 	 List<Imagedetails> image=imageservice.getAllItems(n);
	 	 int count=image.size();
	 	 Map.addAttribute("count",count);
	 	 List<UserVideo> v=uservideoservice.getAllVideos(n);
	 	 int vcount=v.size();
	 	 
	 	Map.addAttribute("vcount",vcount);
	     return "profile";
	}
	@RequestMapping("/single6")
	public String single6() {
	    return "single6";
	}
	
	@RequestMapping("/single1")
	public String single1() {
	    return "single1";
	}
	@RequestMapping("/single2")
	public String single2() {
	    return "single2";
	}
	@RequestMapping("/single3")
	public String single3() {
	    return "single3";
	}
	@RequestMapping("/single4")
	public String single4() {
	    return "single4";
	}
	@RequestMapping("/single5")
	public String single5() {
	    return "single5";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session,HttpServletRequest request) {
		session=request.getSession();  
	    session.invalidate(); 
	    return "login";
	}
	@RequestMapping("/details")
	public String details() {
	    return "details";
	}
	@RequestMapping("/details1")
	public String details1() {
	    return "details1";
	}
	@RequestMapping("/details2")
	public String details2() {
	    return "details2";
	}
	@RequestMapping("/feedback")
	public String feedback() {
	    return "feedback";
	}
	/*
	 * @RequestMapping("/savefeedback") public String savefeedback(feedbackdetails
	 * model,Model m) { return "savefeedback";
	 * 
	 * }
	 */
	@RequestMapping("/vendor")
	public String vendor() {
	    return "vendorhome";
	}
	@RequestMapping("/shop")
	public String shop() {
	    return "shop";
	}
	@RequestMapping("/shop2")
	public String shop2() {
	    return "shop2";
	}
	@RequestMapping("/shop3")
	public String shop3() {
	    return "shop3";
	}
	@RequestMapping("/shop4")
	public String shop4() {
	    return "shop4";
	}
	@RequestMapping("/shop5")
	public String shop5() {
	    return "shop5";
	}
	@RequestMapping("/shop6")
	public String shop6() {
	    return "shop6";
	}
	@RequestMapping("/cart")
	public String cart() {
	    return "cart";
	}
	@RequestMapping("/checkout")
	public String checkout() {
	    return "checkout";
	}
	@RequestMapping("/end")
	public String end() {
	    return "end";
	}
	@RequestMapping("/sample")
	public String sample() {
	    return "sample";
	}
	
	
	
	 
	
}
