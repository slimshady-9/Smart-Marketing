<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
.navbar a:hover, .subnav:hover .subnavbtn {
  background-color:#008000;
}
.subnav-content {
  display: none;
  position: absolute;
  left: 0;
  background-color: #008000;
  width: 50%;
  z-index: 1;
}
.subnav-content a {
  float: left;
  color: white;
  text-decoration: none;
}

.subnav-content a:hover {
  background-color: #eee;
  color: black;
}

.subnav:hover .subnav-content {
  display: block;
}
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}
#Layer1 {
	position:absolute;
	width:500px;
	height:200px;
	z-index:1;
	left: 400px;
	top: 100px;

}
.style7 {font-size:xx-large}
img.avatar {
  width: 40%;
  border-radius: 50%;
}
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}
.container {
  padding: 16px;
}
img.avatar {
  width: 100%;
  border-radius: 50%;
}
.navbar {
  overflow: hidden;
  background-color: #333; 
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.subnav {
  float: left;
  overflow: hidden;
}

.subnav .subnavbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .subnav:hover .subnavbtn {
  background-color:#008000;
}

.subnav-content {
  display: none;
  position: absolute;
  left: 0;
  background-color: #008000;
  width: 50%;
  z-index: 1;
}

.subnav-content a {
  float: left;
  color: white;
  text-decoration: none;
}

.subnav-content a:hover {
  background-color: #eee;
  color: black;
}

.subnav:hover .subnav-content {
  display: block;
}
.style1 {font-family: Arial, Helvetica, sans-serif}

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

<div class="navbar">
  <div class="subnav">
    <button class="subnavbtn"><span class="style1">Manage Profile </span> </button>
    <div class="subnav-content">
      <a href="editprofile.jsp">Edit Profile</a>
    </div>
  </div> 
  
    <div class="subnav">
    <button class="subnavbtn"><span class="style1">Search</span> </button>
    <div class="subnav-content">
      <a href="Search.jsp">Search </a>
       <a href="viewhistory.jsp">View History</a>
    </div>
  </div> 
  <a href="Login.jsp">Logout</a></div>
  <div id="Layer1">

    <h2>Search</h2>
 <form name="form1" method="post" action="MainController?action=search">
  <div class="imgcontainer">
    <img src="images/image2.jpg" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="search"><b>Search</b></label>
    <input type="text" placeholder="Enter Product   " name="prod" required>

    
        
        <button type="submit"><span class="style6">Recommend</span></button>
   
  </div>

  
</form>
</div>>

</body>
</html>
