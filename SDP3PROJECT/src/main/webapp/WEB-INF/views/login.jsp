<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>E-CYCLE</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css?ver=1.2.1"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css?ver=1.2.1"/>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/c67e1ccd0c.js" crossorigin="anonymous"></script>  
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;700&display=swap" rel="stylesheet">


    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    
    <script type="text/javascript">
    
    function validate()
    {
    var user=document.f.name.value;
    var pw1 = document.getElementById("password");
    var pw2 = document.getElementById("cpassword");;
    var email = document.f.email.value;
    var atposition=email.indexOf("@");
    var dotposition=email.lastIndexOf(".");
    var len = email.length;
    if(user==null||user=="")
    {
    alert("Enter the username");
    }
    if(email==""){
    	alert("Email must be filled");
    	return false;
    }
    if(pw1==null||pw2=="")
    {
    alert("Enter the password");
    return false;
    }
    if(pw2==null||pw2=="")
    {
    alert("Enter the Confirm password");
    return false;
    }
    if(pswd.length<8)
    {
    alert("password should be of 8 characters")
    return false;
    }

    if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length)
    {
      alert("Please enter a valid e-mail address");
      return false;
    }
    if(pw1 != pw2)
      {
        alert("Passwords did not match");
        return false;
      
      }
    }

    
      </script>
</head>
<body>
<div class="fixed-top" style="background-color: white;">
    <div class="container-fluid px-md-5 pt-4 pt-md-3">
        <div class="row justify-content-between">
            <div class="col-md-8 order-md-last">
                <div class="row">
                    <div class="col-md-6 text-center">
                        <a class="navbar-brand" href="#" >E -
                         <span>CYCLE</span>
                        <small class="text-dark">
                            Recycle using Ecycle
                        </small>
                    </a>
                    </div>
            <div class="col-md-6 d-md-flex justify-content-end mb-md-0 mb-3">
                <form class="searchform order-lg-last">
                    <div class="form-group d-flex">
                        <input type="text" class="form-control pl-3"placeholder="search">
                        <button type="submit"placeholder=""class="form-control search">
                            <span class="fas fa-search text-dark"></span>
                        </button>
                    </div>
                    </form>
                </div>
                </div>
            </div>
            
            <div class="col-md-4 d-flex">
                <div class="social-media">
                    <p class="mb-0 d-flex">
                        <a href="#"class="d-flex align-items-center justify-content-center">
                            <span class="fab fa-facebook">
                                <i class="sr-only">Facebook</i>
                            </span>
                        </a>
                        <a href="#"class="d-flex align-items-center justify-content-center">
                            <span class="fab fa-twitter">
                                <i class="sr-only">Twitter</i>
                            </span>
                        </a>
                        <a href="#"class="d-flex align-items-center justify-content-center">
                            <span class="fab fa-instagram">
                                <i class="sr-only">Instagram</i>
                            </span>
                        </a>
                    </p>
                </div>
            </div>
        </div>
        </div>
   
    </div>
    <br>
    <br>
<hr>
<br>
    <br>
<h1 align="center">${msg}</h1>
    <div id="login-box">
        <div class="left">
          <h3>Sign up</h3>
          
          <form name="f" action="userdetails" method="post"  onsubmit="return validate()" >
  			
            <input type="text" name="name" id="name" placeholder="Enter Username" required>
            <input type="text" name="email" id="email" placeholder="Enter Email id" required>
            <input type="password" name="password" id="password" placeholder="Enter Password" required>
            <input type="password" name="cpassword" id="cpassword" placeholder="Confirm Password" required>
            <input type="submit" value="Register">
          </form>
          
        </div>
        
        <div class="right">
            <h3>Login</h3>
            <form name=f method="post" action="login-user">
                <input type="text" name="email" placeholder="Enter Email id" required>
                <input type="password" name="password" placeholder="Enter password" required>
                <input type="submit" value="LOGIN"><br>
                <br>
                
                </form>
                <a href="forgotpwd">Forgot Password?</a>
        </div>
        <div class="or">OR</div>
      </div>
</body>
</html>