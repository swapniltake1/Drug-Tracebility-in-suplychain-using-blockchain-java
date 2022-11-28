<!DOCTYPE html>
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
<style>
body {font-family: Arial, Helvetica, sans-serif;
}

/* /* Full-width input fields */
 input[type=text], input[type=password],input[type=date],input[type=file]{
  width: 80%;
  padding: 3px 5px;
  margin: 5px 0;
  display: inline-block;
  border: 1px solid #ccc;
/*   box-sizing: border-box; */
  border-radius:10px;
} 
 input[type=button], input[type=submit], input[type=reset] {
 
	position:relative;
    padding: 5px 22px;
	border-radius:15px;
	background-color:#008800;
	align:center;	
	color: white;
	font-type:Bold;
	text-decoration: none; 
    font-size: 20px;
    margin: 8px 4px;
    cursor: pointer;
} 
 
</style>
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
          <li><a href="SupplierLogin.jsp">Supplier</a></li>
          <li><a href="ManufaturerLogin.jsp">Manufacturer</a></li>
          <li><a href="DistributorLogin.jsp">Distributor</a></li>
          <li><a href="PharmacyLogin.jsp">Pharmacy</a></li>
          <li><a href="Admin.jsp">Admin</a>
         <!--  <li><a href="contact.html">Contact</a></li> -->
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
<br><br>
  <!-- ======= Supplier Registration Section ======= -->
   <section id="userreg" class="userreg">
      <div class="container" data-aos="fade-up">
        <div class="row justify-content-center">
          <div class="col-lg-6">
           <div class="icon-box" align="center">
        <div class="section-title"><br>    
          <p>Patient Registration</p>
                  </div>  
            <form action="PatientLCon" method="post">
                    
              
              <div class="form-group mt-1">
              <input type="text" name="email" class="form-control custom-labels" title="" required="required" placeholder="Enter Email" />
              </div>
             
              <div class="form-group mt-1">
              <input type="password" name="password" class="form-control custom-labels" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Password must contain at least 6 characters, including UPPER/lowercase and numbers." required="required"  placeholder="Password" />
              </div>
                          
              <div class="text-center">                     
         <input type="submit" value="Login"><br>
          <a href="PatientRegistration.jsp" style="color:gold" >Not Register? Register here!!</a><br><br>
        
              </div>              
            </form>
          </div>
        </div>
        </div>
      </div>
    </section>

 <!-- =======End Supplier Registration Section ======= -->
 
  <div id="preloader"></div>
  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

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