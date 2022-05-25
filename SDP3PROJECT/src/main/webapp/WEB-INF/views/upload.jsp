<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-CYCLE</title>
</head>
<head>
	<title>Contact V1</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	
	<link rel="icon"
	href="${pageContext.request.contextPath}/images/icons/favicon.ico?ver=1.2.1" />
<!--===============================================================================================-->
		<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/sellbootstrap/css/bootstrap.min.css?ver=1.2.1" />
<!--===============================================================================================-->
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/fonts/font-awesome-4.7.0/css/font-awesome.min.css?ver=1.2.1" />
<!--===============================================================================================-->
	
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/animate/animate.css?ver=1.2.1" />
<!--===============================================================================================-->
	
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/css-hamburgers/hamburgers.min.css?ver=1.2.1" />
<!--===============================================================================================-->
	
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/select2/select2.min.css?ver=1.2.1" />
<!--===============================================================================================-->
	
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/util.css?ver=1.2.1" />
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/main.css?ver=1.2.1" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/aos/aos.css?ver=1.2.1" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css?ver=1.2.1" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/bootstrap-icons/bootstrap-icons.css?ver=1.2.1" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/boxicons/css/boxicons.min.css?ver=1.2.1" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/glightbox/css/glightbox.min.css?ver=1.2.1" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/swiper/swiper-bundle.min.css?ver=1.2.1" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css?ver=1.2.1" />
</head>
<body>
<header id="header" class="fixed-top header-transparent">
    <div class="container d-flex align-items-center justify-content-between">

      <div class="logo">
        <h1 class="text-light"><a href="index.html"><span>E-Cycle</span></a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="index.html"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
      </div>

      <nav id="navbar" class="navbar">
        <ul>
        <li><a class="nav-link scrollto" href="admin">Back</a></li>
          <li><a class="nav-link scrollto active" href="admin">Home</a></li>
          
          <li><a class="nav-link scrollto" href="logout">Sign Out</a></li>
        </ul>
        
      </nav><!-- .navbar -->

    </div>
  </header><!-- End Header -->
	<div class="contact1">
		<div class="container-contact1">
			<div class="contact1-pic js-tilt" data-tilt>
				<img src="images/video1.png" alt="IMG">
			</div>

			<form class="contact1-form validate-form" action="uploadvideo" method="post" enctype="multipart/form-data" >
				<span class="contact1-form-title">
					Upload
				</span>

				<div class="wrap-input1 validate-input" data-validate = "Product Name is required">
					<input class="input1" type="text" name="name" placeholder="Product Name">
					<span class="shadow-input1"></span>
				</div>
				<div class="wrap-input1 validate-input" data-validate = "Subject is required">
					<select class="input1" id="input_7" name="category"  data-component="dropdown">
            <option value="">Select Category</option>
            <option value="Plastic"> Plastic </option>
            <option value="Tin"> Tin </option>
            <option value="E-Waste"> E-Waste </option>
            <option value="Cermaic"> Cermaic </option>
            <option value="Glass"> Glass </option>
            <option value="Other"> Other </option>
          </select>
					<span class="shadow-input1"></span>
				</div>
<div class="wrap-input1 validate-input" data-validate = "Video Url">
					<input class="input1" type="text" name="video" placeholder="Video Url">
					<span class="shadow-input1"></span>
				</div>
						
      <br>
				<div class="container-contact1-form-btn">
					<button class="contact1-form-btn">
						<span>
							Upload
							<i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						</span>
					</button>
				</div>
			</form>
		</div>
	</div>




<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/tilt/tilt.jquery.min.js"></script>
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>

<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>

<!--===============================================================================================-->
	<script src="js/main.js"></script>
<script src="/vendor/purecounter/purecounter.js"></script>
	<script src="/vendor/aos/aos.js"></script>
	<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="/vendor/glightbox/js/glightbox.min.js"></script>
	<script src="/vendor/isotope-layout/isotope.pkgd.min.js"></script>
	<script src="/vendor/swiper/swiper-bundle.min.js"></script>
	<script src="/vendor/php-email-form/validate.js"></script>
</body>
</html>
