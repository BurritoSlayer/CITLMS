<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<head>
<title>Milton School District Login Page</title>
<link href="bootstrap.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="Login.css">
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
				</div>
			</nav> 

  <div class='logbox'>
   <p id="login">Login:</p>
   <br>
   <form method='post' action="indexController">
    <input type='text' id='loginbox' name='username'></input>
    <input type='password' id='passwordbox' name='password'></input>
    <button type='submit' id='submit' name='submit'>Submit</button>
   </form>
  </div>
</div>

</body>


</html>
