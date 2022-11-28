<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
   <meta name="viewport" content="width=device-width, initial-scale=1">  

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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">   
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
 input[type=text], input[type=password],input[type=date],select[id=quality] {
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

#header {
  background: #70b8b8;
  box-shadow: 0px 0px 25px 0 rgba(0, 0, 0, 0.08);
  z-index: 997;
  padding: 15px 0;
} 
</style>
</head>

<body>
<br>
  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top">
    <div class="container-fluid d-flex justify-content-between align-items-center">

      <h1 class="logo me-auto me-lg-0"><a href="index.html"><b>Drug Traceability</b></a></h1>
      <!-- Uncomment below if you prefer to use an image logo -->
      <!-- <a href="index.html" class="logo"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

      <nav id="navbar" class="navbar order-last order-lg-0">
        <ul>
          <li><a class="active" href="Home.jsp">Home</a></li>         
       
         <li class="dropdown">
           <a><b>Welcome<%response.setContentType("text/html");  
				 HttpSession sessio=request.getSession(true);  
	               if(session!=null){  
	               String name=(String)session.getAttribute("name");  
	                out.print(" "+name+""); }   %></b><i class="bi bi-chevron-down"></i></a>
         <ul> <li><a href="LogoutCon">Logout</a></li>
         <li><a href="ChangePassword.jsp">Change Password</a></li>
          </ul></li>
				</ul>
         <!--  <li><a href="LogoutCon">Logout</a></li> -->
         
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
<br>
  <!-- ======= Supplier Registration Section ======= -->
 <section id="about" class="about">
      <div class="container" data-aos="fade-up">
<br>
        <div class="section-title">
          <h2>Supplier Home</h2>
         <!--  <p></p> -->
        </div>

        <div class="row">
          <div class="col-lg-5">
            <img src="assets/img/roow.png" class="img-fluid" alt="">
          </div>
          <div class="col-lg-7 pt-4 pt-lg-0 content">
            <!-- <h3>Illustrator &amp; UI/UX Designer</h3> -->
            <!-- <p class="fst-italic">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
              magna aliqua.
            </p> -->
            <div class="row">
              <div class="col-lg-3">
                <!-- <ul>
                  <li><i class="bi bi-rounded-right"></i> <strong>Birthday:</strong> 1 May 1995</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>Website:</strong> www.example.com</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>Phone:</strong> +123 456 7890</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>City:</strong> City : New York, USA</li>
                </ul> -->
                <input type="button" style="color:white" class="about-btn" data-toggle="modal" data-target="#myModal" value="Sell Raw Material">
                <a href="ViewPayment.jsp"><input type="button" style="color:white" class="about-btn" value="View Payment"></a>
                <!--  <input type="button" style="color:white" class="abou-btn" value="Insert Data">
                 <p><b>>>><a href="">Insert</a></b></p> -->
              </div>
             <!--  <div class="col-lg-3">
               <ul>
                  <li><i class="bi bi-rounded-right"></i> <strong>Age:</strong> 30</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>Degree:</strong> Master</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>PhEmailone:</strong> email@example.com</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>Freelance:</strong> Available</li>
                </ul>
              </div> -->
            </div>
           <!--  <p>
              Officiis eligendi itaque labore et dolorum mollitia officiis optio vero. Quisquam sunt adipisci omnis et ut. Nulla accusantium dolor incidunt officia tempore. Et eius omnis.
              Cupiditate ut dicta maxime officiis quidem quia. Sed et consectetur qui quia repellendus itaque neque. Aliquid amet quidem ut quaerat cupiditate. Ab et eum qui repellendus omnis culpa magni laudantium dolores.
            </p> -->
          </div>
        </div>

      </div>
    </section><!-- End About Section -->
    
    <div class="container">  
  <h2></h2>  
  <!-- Trigger the modal with a button -->  
  <!-- <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>  
   -->
  <!-- Modal -->  
  <div class="modal fade" id="myModal" role="dialog">  
    <div class="modal-dialog">  
      
      <!-- Modal content-->  
      <div class="modal-content">
      
            <br>
          <h4 class="modal-title" align="center">Sell Row Material</h4>
          
        <!--   <button type="button" class="close" data-dismiss="modal" align="right">×</button>  --> 
       <!--  </div>   -->
        <div class="modal-body" align="center">  
          <form action="AddRawMaterialCon" method="post">
            <div class="form-group mt-1">
             <input type="text" name="suppliername" required pattern="[a-zA-Z\s]+" title="Enter suppliername" class="form-control custom-labels" required="required"  placeholder="Enter Supplier Name" />                                
                </div>
            <div class="form-group mt-1">
             <input type="text" name="materialname" required pattern="[a-zA-Z\s]+" title="Enter materialname" class="form-control custom-labels" required="required"  placeholder="Enter Material Name" />                                
                </div>             
                <div class="form-group mt-1 mt-1 mt-md-0">
                <input type="text" name="quantity" class="form-control custom-labels" title="Enter quantity" required="required" placeholder="Enter quantity" />
              </div>  
                    
              <div class="form-group mt-1">
                <input type="date" name="date" class="form-control custom-labels" pattern="(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\d\d" title="Date should be month-day-year format (ex. 03/22/1990)" required="required" placeholder="Date of Birth" />
              </div>
              <div class="form-group mt-1">
             <input type="text" name="payment" title="Enter payment" class="form-control custom-labels" required="required"  placeholder="Enter Supplier payment" />                                
                </div>
                <div class="form-group mt-1 mt-1 mt-md-0">
               <select id="quality" name="quality" class="form-control custom-labels">
 		<option>Select Material Quality</option>
 		<option value="Good">Good</option>
 		<option value="Medium">Medium</option>
 		<option value="Bad">Bad</option>
 	</select>              
               </div>                
                          
              <div class="text-center">                     
         <input type="submit" value="Submit"> 
                                   
              </div> 
              <div class="text-right">                
              <button type="button" class="close" data-dismiss="modal" align="right">×</button>
              </div>             
            </form>
        </div>  
        <!-- <div class="modal-footer">  
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>  
        </div> -->  
      </div>  
        
    </div>  
  </div>  
    
</div>  
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>  
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>  
    
    
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