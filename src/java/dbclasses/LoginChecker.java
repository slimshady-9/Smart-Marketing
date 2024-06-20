/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dbclasses;
import java.sql.*;

/**
 *
 * @author Innovatus
 */
public class LoginChecker {


    public boolean checkLogin(String uid, String pass)
    {
        boolean flag=true;

        try
        {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartrecom","root","root");
            Statement st=conn.createStatement();

            String query="Select * from registerinfo where userid='"+uid+"'and password='"+pass+"'";

            ResultSet rs=st.executeQuery(query);
            
            if(rs.next())
            {
             flag=true;   
            }
            
            else
            {
                flag=false;
            }
          

        }

        catch(Exception e)
        {
            System.out.println("Exception in LoginChecker Class is: "+e);
            flag=false;
        }




        return flag;
    }

}
