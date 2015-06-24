<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
      				  		    <FORM METHOD="LINK" class="btn btn-default" ACTION="login.jsp">
								  <INPUT TYPE="submit" VALUE="Sign Out">
								</FORM>
       				    		<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
      				  		</div>
    			   			</div>

  				 		</div>
						</div></li>
						</ul>
					</div>
				</div>
			</nav>
			
			<h2>Wizard 2</h2>
			<div class="container">
				<div class="dropdown">
				    	<button class="btn btn-primary dropdown-toggle inline span12" type="button" id="redbutton" data-toggle="dropdown">Subject
    					<span class="caret"></span></button>
					    <ul class="dropdown-menu">
					      <li><a href="#">History</a></li>
					      <li><a href="#">Math</a></li>
					      <li><a href="#">Science</a></li>
					    </ul>
					</div>
			<h4> </h4>
				 <div class="dropdown">
				    	<button class="btn btn-primary dropdown-toggle" type="button" id="redbutton" data-toggle="dropdown">Add Lesson
    					<span class="caret"></span></button>
					    <ul class="dropdown-menu">
					      <li><a href="#">History</a></li>
					      <li><a href="#">Math</a></li>
					      <li><a href="#">Science</a></li>
					    </ul>
				 </div>
			</div>
			
			<h3> </h3>
			<div class="container">
				<table class="table table-bordered">
				    <thead>
				      <tr>
				        <th>Lesson Name</th>
				        <th>Description</th>
				        <th>More info</th>
				        <th>More info</th>
				      </tr>
				    </thead>
				    <tbody>
				      <tr>
				        <td><br></td>
				        <td><br></td>
				        <td><br></td>
				        <td><br></td>
				      </tr>
				      <tr>
				        <td><br></td>
				        <td><br></td>
				        <td><br></td>
				        <td><br></td>
				      </tr>
				      <tr>
				        <td><br></td>
				        <td><br></td>
				        <td><br></td>
				        <td><br></td>
				      </tr>
				    </tbody>
				  </table>
			</div>
			
			<h3> </h3>
			<div class="container">
			<form role="form" method="post" action="toLPDash">
			 <button type="submit" name='continue' class="btn btn-default">Continue</button>
					    &nbsp; &nbsp; &nbsp; &nbsp;
					    <a href="LessonPlanDash.jsp" name='cancel' class="btn btn-default">Cancel</a>
					   </form>
			</div>
</body>
</html>