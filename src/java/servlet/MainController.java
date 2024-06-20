package servlet;

import dbclasses.DataKeeper;
import dbclasses.LoginChecker;
import dbclasses.RegisterMaker;
import dbclasses.UpdateMaker;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.util.*;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.sql.*;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import product_recom.RecommendationInit;

public class MainController extends HttpServlet
{

	 public void init(ServletConfig config) throws ServletException
	 {
		super.init( config );
	 }

 	// if method=GET call doPost
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	{
	  System.out.println("Inside doGet ");

	  invokeActionClass(request, response);
	}

	// if method=POST call doPost
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	{
	  System.out.println("Inside doPost");

	  invokeActionClass(request, response);
	}


	//this method transfers control to specific classes
	private void invokeActionClass(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException
	 {
    	response.setContentType("text/html");
    	System.out.println ("=i am in invoke method==============");
		PrintWriter out = response.getWriter();

		try
			{
		String action = request.getParameter("action");
		System.out.println("action is : --- > "+action);

//------------------------------------------------------------------USER LOGIN------------------------------------------------
	if(action.equals("login"))
	{


            String userid = request.getParameter("uname");
            String pass = request.getParameter("psw");
           

            System.out.println("Username is  " + userid);
            System.out.println("Password is  " + pass);
                   LoginChecker lc=new LoginChecker();
              
              if(lc.checkLogin(userid, pass))
              {
                 request.getSession().setAttribute("uname",userid);
                 response.sendRedirect("/smartmarketing/operation.jsp");
                 DataKeeper.userid=userid;
              }
              else
              {
                  out.println("<script type=\"text/javascript\">");
                  out.println("alert('Password is not correct');");
                  out.println("location='Login.jsp';");
                  out.println("</script>");
                  
              }
//              

	

      }
        
        //------------------------------------------------------------------USER REGISTRATION------------------------------------------------
        if(action.equals("register"))
	{

            System.out.println("Action in if  ="+action);

            String uname = request.getParameter("name");
            String gender = request.getParameter("gender");
            String dob = request.getParameter("birthday");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String mob = request.getParameter("phone");
            String uid = request.getParameter("userid");
            String pass = request.getParameter("psw-repeat");

            System.out.println("Username is  " + uname);
            System.out.println("Gender is  " + gender);
            System.out.println("DOB is  " + dob);
            System.out.println("Address is  " + address);
            System.out.println("Email is  " + email);
            System.out.println("Mobile is  " + mob);
            System.out.println("User ID: is  " + uid);
          
            System.out.println("Password is  " + pass);
            
              RegisterMaker ri=new RegisterMaker();
            if(ri.insertRegistrationinfo(uname, gender,dob, address, email, mob, uid, pass))
            {
               // response.sendRedirect("/login/Login.jsp");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Data Submitted Successfully');");
                out.println("location='Login.jsp';");
                out.println("</script>");
            }
             else
              {
                  out.println("<script type=\"text/javascript\">");
                  out.println("alert('Oops there is some error');");
                  out.println("location='signup.jsp';");
                  out.println("</script>");
                  
              }
           
                          

	

      }

   //------------------------------------------------------------------USER UPDATE------------------------------------------------
        if(action.equals("updateuser"))
	{

            System.out.println("Action in if  ="+action);

          System.out.println("Action in if  ="+action);
          
            String uname = request.getParameter("name");
            String gender = request.getParameter("gender");
            String dob = request.getParameter("birthday");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String mob = request.getParameter("phone");
            String uid = request.getParameter("userid");
            String pass = request.getParameter("psw-repeat");

            System.out.println("Username is  " + uname);
            System.out.println("Gender is  " + gender);
            System.out.println("DOB is  " + dob);
            System.out.println("Address is  " + address);
            System.out.println("Email is  " + email);
            System.out.println("Mobile is  " + mob);
            System.out.println("User ID: is  " + uid);
            System.out.println("Password is  " + pass);
            
            //name, gen, doob, address, emailid, mobile, userid, password
           UpdateMaker ri=new UpdateMaker();
            if(ri.updateData(uname, gender, dob, address,email, mob, uid, pass))
            {
                
               // response.sendRedirect("/smart_mobile_recomm/editprofile.jsp");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Data Updated Successfully');");
                out.println("location='editprofile.jsp';");
                out.println("</script>");
            }
             else
              {
                  out.println("<script type=\"text/javascript\">");
                  out.println("alert('Oops there is some error');");
                  out.println("location='editprofile.jsp';");
                  out.println("</script>");
                  
              }
           
//              

      }
        
          //-------------------------------------------------------------------Search-------------------------------------      
     if(action.equals("search"))
	{
              String product = request.getParameter("prod");
              product=product.toLowerCase();
              System.out.println("product "+product);
              String uname=DataKeeper.userid;
              
              boolean flag=new RecommendationInit().isRecommended(product, uname);
              System.out.println("flag "+flag);
              if(flag==true)
              {
                   //request.getSession().setAttribute("uname",userid);
                 response.sendRedirect("/smartmarketing/viewresults.jsp");
                  // out.println("location='editprofile.jsp';");
             
              }
              else
              {
                  out.println("<script type=\"text/javascript\">");
                  out.println("alert('No Recommendations');");
                  out.println("location='editprofile.jsp';");
                  out.println("</script>");
              }
              
              
//           UpdateMaker ri=new UpdateMaker();
//            if(ri.updateData(uname, gender, dob, address,email, mob, uid, pass))
//            {
//                
//               // response.sendRedirect("/smart_mobile_recomm/editprofile.jsp");
//                out.println("<script type=\"text/javascript\">");
//                out.println("alert('Data Updated Successfully');");
//                out.println("location='editprofile.jsp';");
//                out.println("</script>");
//            }
//             else
//              {
//                  out.println("<script type=\"text/javascript\">");
//                  out.println("alert('Oops there is some error');");
//                  out.println("location='editprofile.jsp';");
//                  out.println("</script>");
//                  
//              }
           
//              

      }

}
	catch(Exception e)
		{
			System.out.println ("Error at MainController "+e);
		}
}


}
