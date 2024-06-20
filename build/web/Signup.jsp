<%-- 
    Document   : Signup
    Created on : Mar 22, 2022, 3:46:51 PM
    Author     : 1450
--%>
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
  background: url(images/download.jpg) no-repeat center center fixed; 
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
.container {  
    padding: 50px;  
  background-color: lightblue;  
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
 div {  
            padding: 10px 0;  
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
        
        <div id="Layer1">
            
           <form name="form1" method="post" action="MainController?action=register" onSubmit="validateAll()">
		  <div class="container">
		 <div class="imgcontainer">
    <img src="images/register-now_1_orig.gif" alt="Avatar" class="avatar">
  </div>  
                      
          
			
            <p>Please fill in this form to create an account.</p>
			<hr>
			
			 <label for="name"><b>Name:</b></label>   
			 <input name="name" type="text" id="name" placeholder="Enter Name" size="20" required> 
			 
		    <div>  
			 <label for="gender"><strong>Gender:</strong></label>
			 <p>
			   <input type="radio" value="Male" id="gender" name="gender"> 
			   Male
			   <input type="radio" value="Female" id="gender" name="gender"> 
			   Female
			   <input type="radio" value="Other" id="gender" name="gender"> 
			   Other			 </p>
			 </div>
			 
			 <label for="birthday"><strong>Birthday:</strong></label>
             <input name="birthday" type="date" id="birthday" placeholder="Enter Birthday" size="20" required >  
			 
			 <label for="address"><strong>Address:</strong></label>
			 <textarea cols="30" rows="5" placeholder="Current Address" name="address" required> </textarea> 
			 
			 <label for="email"><b>Email:</b></label>  
			 <input type="text" placeholder="Enter Email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="Invalid Emailid" required>  
			 
			 <label for="phone"><b>Mobile:</b></label> 
			 <input type="text" name="phone" placeholder="Enter Mobile" size="20" required>
			 
			 <label for="userid"><b>User ID:</b></label> 
			 <input type="text" name="userid" placeholder="Enter Userid" size="20" required>  
			 
			 			 
			 <label for="psw"><b>Password:</b></label>  
   			 <input type="password" placeholder="Enter Password" name="psw" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"required>  
  
   			<label for="psw-repeat"><b>Confirm Password:</b></label>  
   			<input type="password" placeholder="Enter Confirm Password" name="psw-repeat" required> 
			
			<button type="submit"  class="style7">Register</button>  
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
