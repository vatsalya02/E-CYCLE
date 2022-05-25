<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>E-CYCLE</title>
<link href="https://cdn01.jotfor.ms/static/formCss.css?3.3.29861" rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet" href="https://cdn02.jotfor.ms/css/styles/nova.css?3.3.29861" />
<style type="text/css">@media print{.form-section{display:inline!important}.form-pagebreak{display:none!important}.form-section-closed{height:auto!important}.page-section{position:initial!important}}</style>
<link type="text/css" rel="stylesheet" href="https://cdn03.jotfor.ms/css/styles/payment/payment_feature.css?3.3.29861" />
<link href="/img/favicon.png" rel="icon">
<link href="" rel="apple-touch-icon">
<link type="text/css" rel="stylesheet"
	href="https://cdn01.jotfor.ms/themes/CSS/5e6b428acc8c4e222d1beb91.css?themeRevisionID=5f7ed99c2c2c7240ba580251" />
<link type="text/css" rel="stylesheet"
	href="https://cdn02.jotfor.ms/css/styles/payment/payment_styles.css?3.3.29819" />
<link type="text/css" rel="stylesheet"
	href="https://cdn03.jotfor.ms/css/styles/payment/payment_feature.css?3.3.29819" />
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
/* Float four columns side by side */
.column {
  float: left;
  width: 25%;
  padding: 0 10px;
}

/* Remove extra left and right margins, due to padding */
.row {margin: 0 -5px;}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive columns */
@media screen and (max-width: 600px) {
  .column {
    width: 100%;
    display: block;
    margin-bottom: 20px;
  }
}

/* Style the counter cards */
.card {
  display: inline-block;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width:500px;
  margin-top:5%;
  margin-left:50px;
  text-align: center;
  font-family: arial;
  background-color:white;
  border-radius:10px;
  width:25%;
  
}

</style>
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
          <li><a class="nav-link scrollto active" href="admin">Home</a></li>
          <li><a class="nav-link scrollto" href="logout">Sign Out</a></li>
          <li><a class="nav-link scrollto" href="admin">Back</a></li>
        </ul>
        
      </nav><!-- .navbar -->

    </div>
  </header><!-- End Header -->
<c:forEach var="video" items="${videos}">
<div class="card" >
<br>
  <iframe src="https://www.youtube.com/embed/Bjom5gib2no?controls=1" width="360" height="190" >
</iframe>
<br><br>
</div>
</c:forEach>
 <script src="/vendor/purecounter/purecounter.js"></script>
<script src="/vendor/aos/aos.js"></script>
<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="/vendor/glightbox/js/glightbox.min.js"></script>
<script src="/vendor/isotope-layout/isotope.pkgd.min.js"></script>
<script src="/vendor/swiper/swiper-bundle.min.js"></script>
<script src="/vendor/php-email-form/validate.js"></script>
<script type="text/javascript">
  <!-- Template Main JS File -->
  <script src="/js/main.js"></script>
</body>
</html>