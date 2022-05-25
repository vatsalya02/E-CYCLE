<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>E-CYCLE</title>
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
<c:forEach var="video" items="${videos}">
<div class="card" >
<br>
  <iframe src="${video.url }" width="360" height="190" >
</iframe>
<br><br>
</div>
</c:forEach>
</body>
</html>