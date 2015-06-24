<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Teacher Dashboard</title>
<meta name="generator" content="Bootply" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="bootstrap.css" rel="stylesheet">
<link href="TeacherDash.css" rel="stylesheet">
<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
<link href="dashstyle.css" rel="stylesheet">
<link rel="shortcut icon" href="lib/mario.ico" />
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid" style="background-color: #8A0000;">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span>
				</button>
				<img src='lib/LMSlogo.jpg'></img>
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<img src='lib/LMSbanner.jpg'></img>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
				    <li id="role">Teacher
				    			  <br>
				    			   <a href="TeacherDashboard.jsp">${UsersName}</a>
				    </li>
					<li><a href="#" data-toggle="modal" data-target="#logoutModal">Sign Out</a>
					<!-- Modal -->
				  		<div id="logoutModal" class="modal fade" role="dialog" data-backdrop="false"> 
  				 		<div class="modal-dialog">

    						<!-- Modal content-->
    						<div class="modal-content">
      				  		<div class="modal-body">
        						<p>Are you sure you want to sign out?</p>
     			      		</div>
      				  		<div class="modal-footer">
      				  		    <a type="submit" class='btn btn-default' href="login.jsp">Sign out</a>
       				    		<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
      				  		</div>
    			   			</div>

  				 		</div>
						</div></li>
						</ul>
					</div>
				</div>
			</nav>
    
    <div class="row row-offcanvas row-offcanvas-left">

			<div class="col-sm-3 col-md-2 sidebar-offcanvas" id="sidebar"
				role="navigation">
			<h7>&nbsp;</h7> <!-- creates an empty space between topbar and sidebar -->
			 <ul class="nav nav-sidebar sbars">
              <li><a href="clWiz1.jsp" class="hovercolor topbar">Create Lesson</a></li>
              <li><a href="CreateLessWiz.jsp" class="hovercolor">Read Lesson Plan</a></li>
              <li><a href="" class="hovercolor bottombar">Update Lesson Plan</a></li>
            </ul>
        
            <ul class="nav nav-sidebar sbars" style="background-color: #1A0000; border-top-right-radius: 10px; border-bottom-right-radius: 10px;">
              <li><a href="" data-toggle="modal" data-target="#myModal" class="hovercolor topbar">Deactivate Lesson Plan</a></li>
              	<!-- Modal -->
				<div id="myModal" class="modal fade" role="dialog">
  				 <div class="modal-dialog">

    				<!-- Modal content-->
    				<div class="modal-content">
      				  <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Modal Header</h4>
      				  </div>
      				  <div class="modal-body">
        				<p>Some text in the modal.</p>
     			      </div>
      				  <div class="modal-footer">
       				    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      				  </div>
    			   </div>

  				 </div>
				</div>
				
              <li><a href="" data-toggle="modal" data-target="#myModal" class="hovercolor bottombar">Deactivate Lesson</a></li>
                <!-- Modal -->
				<div id="myModal" class="modal fade" role="dialog">
  				 <div class="modal-dialog">

    				<!-- Modal content-->
    				<div class="modal-content">
      				  <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Modal Header</h4>
      				  </div>
      				  <div class="modal-body">
        				<p>Some text in the modal.</p>
     			      </div>
      				  <div class="modal-footer">
       				    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      				  </div>
    			   </div>

  				 </div>
				</div>

            </ul>

			</div>
			
			<div class="col-sm-9 col-md-10 main">
			
			  <div class="panel panel-default">
			    <div class="panel-heading panhead">Lesson Plan Title &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; # of Lessons &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Major Subjects</div>
  				<div class="panel-body">Description Here</div>
			  </div>
			  
			  <div class="panel panel-default">
  				<div class="panel-body">Lead Lesson Title<br>Lesson Title<br>Lesson Title<br>Lesson Title</div>
			  </div>
  				  
				</div>
			   </div>
			  </div>
				  	
			</div>
	</div>
	<footer>
		<p class="pull-right">@2015 Milton School District</p>
	</footer>

	<!-- script references -->
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/scripts.js"></script>
</body>
</html>