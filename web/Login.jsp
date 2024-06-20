<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}
#Layer1 {
	position:absolute;
	width:359px;
	height:264px;
	z-index:2;
	left: 521px;
	top: 100px;
	border:transparent;
	visibility: visible;
	overflow: visible;
}
#Layer2 {
	position:absolute;
	width:1034px;
	height:60px;
	z-index:3;
	left: 216px;
	top: 17px;
	left: 15%;
	margin-left: -50px;
}
.style7 {font-size:xx-large}
img.avatar {
  width: 40%;
  border-radius: 50%;
}
.style7 {color: #f44336; font-size: 16px; font-size:xx-large}
.style6 {color: #FFFFFF; font-size: 16px; }
#Layer2 {
	position:absolute;
	width:1034px;
	height:42px;
	z-index:3;
	left: 216px;
	top: 12px;
	left: 15%;
	margin-left: -50px;
}
.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
h2 {text-align: center;}

		html { 
  background: url(images/accommodation.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
</style>
</head>
<body>
    <div id="Layer2">
            <div align="center" class="style7"><b>SMART PRODUCT RECOMMENDATION SYSTEM</b></div>
        </div>

<div id="Layer1">
    <h2>Login Form</h2>
 <form name="form1" method="post" action="MainController?action=login">
  <div class="imgcontainer">
    <img src="images/image2.jpg" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
        
        <button type="submit"><span class="style6">Login</span></button>
   
  </div>

    <div class="container" style="background-color:transparent">
   New user? <a href="Signup.jsp" class="style3">Sign up
   
   
    
   </a></div>
</form>
</div>>
</body>
</html>