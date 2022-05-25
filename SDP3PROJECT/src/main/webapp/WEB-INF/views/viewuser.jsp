<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>E-CYCLE</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon"
	href="${pageContext.request.contextPath}/images/icons/favicon.ico?ver=1.2.1" />
<!--===============================================================================================-->
		<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css?ver=1.2.1" />
<!--===============================================================================================-->
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/fonts/font-awesome-4.7.0/css/font-awesome.min.css?ver=1.2.1" />
<!--===============================================================================================-->
	
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/animate/animate.css?ver=1.2.1" />
<!--===============================================================================================-->
	
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/perfect-scrollbar/perfect-scrollbar.css?ver=1.2.1" />
<!--===============================================================================================-->
	
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendor/select2/select2.min.css?ver=1.2.1" />
<!--===============================================================================================-->
	
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/tableutil.css?ver=1.2.1" />
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/tablemain.css?ver=1.2.1" />
<!--===============================================================================================-->





</head>
<body>
	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table>
							<thead>
								<tr class="row100 head">
									<th class="cell100 column1">SR.NO</th>
									<th class="cell100 column2">USER</th>
									<th class="cell100 column3">EMAIL</th>
								</tr>
							</thead>
						</table>
					</div>

					<div class="table100-body js-pscroll">
						<table>
							<tbody>
								
						<c:set var="count" value="0" scope="page"></c:set>
						        <c:forEach var="users" items="${users}">
						        <c:set var="count" value="${count + 1}" scope="page"></c:set>
						            <tr>
						                <td class="cell100 column1">${count}</td>
						                <td class="cell100 column2">${users.name}</td>
						                <td class="cell100 column3">${users.email }</td>
               
            </tr>
         </c:forEach>

							</tbody>
						</table>
					</div>
				</div>
				
				

				

				
				</div>
			</div>
		</div>
	</div>



	<script>
		$('.js-pscroll').each(function(){
			var ps = new PerfectScrollbar(this);

			$(window).on('resize', function(){
				ps.update();
			})
		});
		<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
		<!--===============================================================================================-->
		 <script src="vendor/bootstrap/js/popper.js"></script>
		 <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
		<!--===============================================================================================-->
		 <script src="vendor/select2/select2.min.js"></script>
		<!--===============================================================================================-->
		 <script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
		
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>