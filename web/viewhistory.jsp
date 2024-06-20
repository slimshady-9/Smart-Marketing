<%-- 
    Document   : signup
    Created on : Apr 6, 2021, 1:15:51 PM
    Author     : 1450
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>  
<html>  
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<script>

function validateAll() 
{
var mobile = document.getElementById("phone");

if(mobile.length!=10)
{
 alert("Please Enter 10 Digit Mobile Number");
 return false;
}
}
function phonenumber(mobile)
{
  var phoneno = /^\d{10}$/;
  if((mobile.value.match(phoneno))
        {
      return true;
        }
      else
        {
        return false;
        }
}

</script>
 
<style>  
 		
		html { 
  background: url(images/history.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
		
		img {
                max-width:100%;
                height:100%;
            }
		
body{  
  font-family: Arial, Helvetica, sans-serif;   
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
.container {  
    top:150px;
    padding: 50px; 
   
    
}  
  
input[type=text], input[type=date], input[type=password], textarea { 
 
  width: 100%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  border-radius: 25px;
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus {  
  background-color: orange;  
  outline: none;  
}  

hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 10%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
  opacity: 1;  
} 
.fixed-size1  {
  background-color: #4CAF50;  
  color: white;
  width: 130px;
  height: 40px;
  font-size: 17px;
  
  
}
#message {
  display:none;
  background: #f1f1f1;
  color: #000;
  position: relative;
  padding: 20px;
  margin-top: 10px;
}

#message p {
  padding: 10px 35px;
  font-size: 18px;
}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 200%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: center;
  padding: 8px;
  background-color: #4CAF50;
  color: white;
}

tr:nth-child(even) {
  background-color: #4CAF50;
}
#Layer1 {
	position:absolute;
	width:619px;
	height:316px;
	z-index:1;
	left: 356px;
	top: 5px;
}
.style7 {background-color: #4CAF50; color: white; padding: 16px 20px; margin: 8px 0; border: none; cursor: pointer; width: 20%; opacity: 0.9; font-size: 16px; }
.style8 {background-color: #4CAF50; color: white; padding: 16px 20px; margin: 8px 0; border: none; cursor: pointer; width: 20%; opacity: 0.9; font-size: 16px; }
.style9 {background-color: #4CAF50; color: white; padding: 16px 20px; margin: 8px 0; border: none; cursor: pointer; width: 20%; opacity: 0.9; font-size: 16px; }
#Layer2 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:2;
}
#Layer3 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:2;
}
#Layer4 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:2;
	left: 500px;
	top: 150px;
}
#Layer5 {
	position:absolute;
	width:150px;
	height:60px;
	z-index:3;
	top: 90px;
	left: 634px;
}

-->
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
  
    
    
<div class="navbar">
     <div class="subnav">
    <button class="subnavbtn"><span class="style1">Search</span> </button>
    <div class="subnav-content">
      <a href="Search.jsp">Search </a>
       <a href="viewhistory.jsp">View History</a>
    </div>
  </div> 
  
    
 
  <a href="Login.jsp">Logout</a></div>
	
	
	
	</div>
        <div id="Layer4">
          <form name="form1" method="get" action="#">
		  <table>
  <tr>
    <th>User Name</th>
    <th>Results</th>
    <th>Date & Time</th>
  </tr>
 
       <% 
Connection con=null;
ResultSet rs=null;

try
{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartrecom","root","root");
            Statement st1=con.createStatement();
           String query="Select *from resultinfo";

            rs=st1.executeQuery(query);
            
     while(rs.next())
     {
        
%>
 <tr>
<td><%=rs.getString(1)%></td>
<td><%=rs.getString(2)%></td>
 <td><%=rs.getString(3)%></td></tr>
          
<%
     }
}catch(Exception e)
{    out.print(e);
}
%>
    
 
  
 
</table>
          </form>
        </div>
        <div id="message">
  <h3>Password must contain the following:</h3>
  <p id="letter" class="invalid">A <b>lowercase</b> letter</p>
  <p id="capital" class="invalid">A <b>capital (uppercase)</b> letter</p>
  <p id="number" class="invalid">A <b>number</b></p>
  <p id="length" class="invalid">Minimum <b>8 characters</b></p>
</div>
        <h1>&nbsp;</h1>
    </body>
</html>
