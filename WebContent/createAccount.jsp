<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="Login.css">
<script src="Login.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>


<head>
<title>Milton School District Login Page</title>
</head>

<body>

 <div class='bground'>
  <div class='img'>
   <img src="http://bloximages.newyork1.vip.townnews.com/hngnews.com/content/tncms/assets/v3/editorial/1/11/111e1816-547c-11e4-b880-0017a43b2370/543e8d0ee44f8.image.jpg?resize=300%2C389" style='width:150px;height:180px'>
  </div>
  <div class='banner'>
   Milton School District
   <marquee id="upevts">Upcoming events: &nbsp;&nbsp; PTC on 5/25 @ 4:00pm @ Norvale Elementary School, &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; College Fair on 5/30 @ 7:30pm @ West High School, &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; District Science Fair on 5/31 @ 4:50pm @ Rolling Hills Middle School</marquee>
  </div>
  <div class='logbox'>
   <p id="login">Create Account:</p>
   <br>
   <form method='post' action="CreateAccountController">
    <input type='text' id='loginbox' name='username'></input>
    <input type='password' id='passwordbox' name='password'></input>
    <button type='submit' id='submit' name='submit'>Submit</button>
   </form>
  </div>
</div>

</body>

</html>