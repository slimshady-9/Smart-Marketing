<%-- 
    Document   : editprofile
    Created on : Mar 23, 2022, 10:27:30 AM
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
  background: url(images/image2.jpg) no-repeat center center fixed; 
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
-->
        </style>
		

               	
</head>
    <body>
            <div id="Layer5">
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
	
	
	
	</div>
        <div id="Layer1">
            
 
            <%

String name="", gender="", dob="", address="", email="", mobile="", uid="", pass="",uname="";
try
	{
	 uname=(String)	request.getSession().getAttribute("uname");
	
	        Class.forName("com.mysql.jdbc.Driver").newInstance();	     
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartrecom","root","root");			
            Statement st=con.createStatement();
			
            String str="select * from registerinfo where userid ='"+uname+"'";
		
			System.out.println(str);
			
            ResultSet rs=st.executeQuery(str);
			//fname, lname, caddress, email, contact, username, password
            if(rs.next())  
            {//
                               name=rs.getString(1);
				gender=rs.getString(2);
				dob=rs.getString(3);
				address=rs.getString(4);
				email=rs.getString(5);		
				mobile=rs.getString(6);
				uid=rs.getString(7);
                                pass=rs.getString(8);
				
				
				System.out.println("name: "+name);
                                System.out.println("gender "+gender);
                                System.out.println("dob "+dob);
                                System.out.println("address "+address);
                                System.out.println("email "+email);
                                System.out.println("mobile "+mobile);
                                System.out.println("uid "+uid);
                                                              System.out.println("pass "+pass);
                                
									
				
				
				
			
						
            }
	      		   
		  }
		 catch(Exception e)
		 {
		 System.out.println("Exception in editprofile.."+e);
		 } 
%>
                        
           <form name="form1" method="post" action="MainController?action=updateuser" onSubmit="validateAll()">
		  <div class="container">
		  
            <center>  <h1> User Profile Update </h1> 
            </center>  
			
            <p>Please fill in this form to create an account.</p>
			<hr>
			
			 <label for="name"><b>Name:</b></label>   
			 <input name="name" type="text" id="name" value="<%=name%>" placeholder="Enter Name" size="20" required> 
			 
		    <div>  
                        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
                         <c:set var="gender" value="Male,Female,Other" />
			 <label for="gender"><strong>Gender:</strong></label>
                        
			 <p>
			   <input type="radio" value="Male"  id="gender" name="gender" > 
			   Male
			   <input type="radio" value="Female" id="gender" name="gender" <c:if test="${gender.contains('Female')}">checked</c:if>> 
			   Female
			   <input type="radio" value="Other" id="gender" name="gender"> 
			   Other			 </p>
			 </div>
			 
			 <label for="birthday"><strong>Birthday:</strong></label>
                         <input name="birthday" type="date" id="birthday" value="<%=dob%>" placeholder="Enter Birthday" size="20" required >  
			 
			 <label for="address"><strong>Address:</strong></label>
                              
			 <textarea cols="30" rows="5"  placeholder="Current Address" name="address"  ><%=address%></textarea> 
			 
			 <label for="email"><b>Email:</b></label>  
			 <input type="text" placeholder="Enter Email" name="email" value="<%=email%>" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="Invalid Emailid" required>  
			 
			 <label for="phone"><b>Mobile:</b></label> 
			 <input type="text" name="phone" placeholder="Enter Mobile" value="<%=mobile%>" size="20" required>
			 
			 <label for="userid"><b>User ID:</b></label> 
			 <input type="text" name="userid" value="<%=uid%>" placeholder="Enter Userid" size="20" required>  
			 
			
			 <label for="psw"><b>Password:</b></label>  
   			 <input type="password" placeholder="Enter Password" value="<%=pass%>" name="psw" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"required>  
  
   			<label for="psw-repeat"><b>Confirm Password:</b></label>  
   			<input type="password" placeholder="Enter Confirm Password" value="<%=pass%>" name="psw-repeat" required> 
			
			<button type="submit"  class="style7">Update</button>  
			<button type="reset" class="style8">Clear</button> 
			<button type="submit" onClick="document.location='Login.jsp'" class="style9">Back</button>  
        
        
    </div>
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
