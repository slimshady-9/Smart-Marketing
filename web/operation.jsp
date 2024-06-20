<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html { 
  background: url(images/image3.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
		
		img {
                max-width:100%;
                height:100%;
            }
			
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
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
</style>
</head>
<body>

<div class="navbar">
  <div class="subnav">
    <button class="subnavbtn"><span class="style1">Manage Profile </span> </button>
    <div class="subnav-content">
      <a href="editprofile.jsp">EditProfile</a>
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
  

</body>
</html>
