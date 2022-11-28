<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.connection.DBConnection"%>
<%@page import="java.sql.Connection"%>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Drug Traceability</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: Kelly - v4.7.0
  * Template URL: https://bootstrapmade.com/kelly-free-bootstrap-cv-resume-html-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top">
    <div class="container-fluid d-flex justify-content-between align-items-center">

      <h1 class="logo me-auto me-lg-0"><a href="index.html"><b>Drug Traceability</b></a></h1>
      <!-- Uncomment below if you prefer to use an image logo -->
      <!-- <a href="index.html" class="logo"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

      <nav id="navbar" class="navbar order-last order-lg-0">
        <ul>
          <li><a class="active" href="Home.jsp">Home</a></li>
          <!-- <li><a href="SupplierLogin.jsp">Supplier</a></li>
          <li><a href="ManufaturerLogin.jsp">Manufacturer</a></li>
          <li><a href="DistributorLogin.jsp">Distributor</a></li>
          <li><a href="PharmacyLogin.jsp">Pharmacy</a></li>
          <li><a href="AdminLogin.jsp">Admin</a> -->
          <li><a href="contact.html">Contact</a></li>
         <!--  <li><a href="about.html">About</a></li>
          <li><a href="resume.html">Resume</a></li>
          <li><a href="services.html">Services</a></li>
          <li><a href="portfolio.html">Portfolio</a></li>
          <li><a href="contact.html">Contact</a></li> -->
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->
<br>
      <!-- <div class="header-social-links">
        <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
        <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
        <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
        <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></i></a>
      </div> -->

    </div>

  </header><!-- End Header -->
<!-- <-------------------Pricing section----------------->

	<section id="pricing" class="pricing">
		<div class="container">

			<div class="row">
				<div class="col-md-12">
					<div class="col-lg-12"><br><br>
						<div class="text-center color-elements">
							
							<h3>
								<b>View Payment</b>
							</h3>
							<br>
							<br>
						</div>
					</div>
					<table class="table table-bordered">
									<%
                     Connection con=DBConnection.getConnection();
                     Statement st=con.createStatement();
                     ResultSet rs=st.executeQuery("select * from payment");
                     //while(rs.next())
                     if(rs.next() == false) {
                    	%>
									<h4 style="text-align: right; margin-right: 70px">
										<b>No Users Present</b>
									</h4>
									<%
                     }
                    else{
                    	int count=0;
                    	do{	 
                    	 if(count == 0) {	
                    	 %>
									<tr class="danger" style="color: navy;">
										<th>ID</th>										
										<th>Name</th>
										<th>Row material Name</th>										
										<th>Account No</th>
										<th>Amount</th>									
										<!-- <th>Date</th>	 -->																			
										 <th>Action</th>
										
									</tr>
									<%}%>
									<TR>
										<td style="color: black"><%=rs.getInt(1) %></td>				
										<td style="color: black"><%=rs.getString(2) %></td>
										<td style="color: black"><%=rs.getString(3) %></td>
										<td style="color: black"><%=rs.getString(4) %></td>
										<td style="color: black"><%=rs.getString(5) %></td>											                            
			                             <td><a href="DeletePaySupCon?id=<%=rs.getInt(1)%>"><b>Delete</b></a></td> 
										<%--  <td><a href="UpdateCon?id=<%=rs.getInt(1)%>&status=<%=rs.getString(8)%>"><%=rs.getString(8)%></a></td> --%>
									     
									    <%--  <td><a href="StudentRegistrationController?id=<%=rs.getInt(1)%>"><b>Edit</b></a></td>
									     <td><a href="TruncateStudentCon?id=<%=rs.getInt(1)%>"><b>Click</b></a></td> --%>
									</TR>
									<%count++; }while(rs.next());}%>

								</table>
						</form>
					</div>
				</div>
			</div>
		</div>
					


	</main>
	<!-- <a href="#"
		class="back-to-top d-flex align-items-center justify-content-center"><i
		class="bi bi-arrow-up-short"></i></a> -->

	 <!-- Vendor JS Files -->
  <script src="assets/vendor/purecounter/purecounter.js"></script>
  <script src="assets/vendor/aos/aos.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="assets/vendor/waypoints/noframework.waypoints.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>