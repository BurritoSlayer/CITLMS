<!DOCTYPE html>
<html>
 <head>

  <title>Wizard 1</title>
  <link href="bootstrap.css" rel="stylesheet">
  <link href="wiz.css" rel="stylesheet">
  <link href="TeacherDash.css" rel="stylesheet">
  <link rel="shortcut icon" href="lib/mario.ico" />
 </head>
 <body>
  <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid" style="background-color: #8A0000;">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
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
				    			  <a id="nopad" href="TeacherDashboard">${indexUserName}</a>
				    </li>
					<li ><a href="#"data-toggle="modal" data-target="#logoutModal">Sign Out</a>
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
			
			<div class="container">
				  <h1>Lesson Plan Wizard 1</h1>
				  <form role="form" method='post' action="wiz1Controller">
				    <div class="form-group">
				      <label for="name">Lesson Plan Name: </label>
				      <input type="text" class="form-control" name='name' placeholder="Enter name">
				    </div>
				    <div class="form-group">
				      <label for="pwd">Lesson Plan Description: </label>
				      <input type="text" class="form-control" name='description' placeholder="Enter description">
				    </div>
				    <div class="dropdown">
				    	<button class="btn btn-primary dropdown-toggle" type="button" id="redbutton" data-toggle="dropdown">Subject
    					<span class="caret"></span></button>
					    <ul class="dropdown-menu">
					      <li><a href="#">History</a></li>
					      <li><a href="#">Math</a></li>
					      <li><a href="#">Science</a></li>
					    </ul>
					</div>
					<h4> </h4>
					    <button id="cont" type="submit" name='continue' class="btn btn-default">Continue</button>
					    &nbsp; &nbsp; &nbsp; &nbsp;
					    <a href="TeacherDashboard.jsp" name='cancel' class="btn btn-default">Cancel</a>
					   </form>
			</div>
 </body>
 
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 <script src="js/script.js"></script>
</html>