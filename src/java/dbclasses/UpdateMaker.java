/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class UpdateMaker {
    public  boolean updateData(String name,String gen,String dob,String address, String emailid,String mobile,String userid,String password)
    {
     boolean flag=false;
  
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartrecom","root","root");
            Statement st=conn.createStatement();
           //name, gen, doob, address, emailid, mobile, userid, password
            String query=" update registerinfo set name='"+name+"',gen='"+gen+"',doob='"+dob+"',address='"+address+"',emailid='"+emailid+"',mobile='"+mobile+"',password='"+password+"'  where userid='"+userid+"'";
           int x=st.executeUpdate(query);
           if(x>0)
               flag=true;
           else
               flag=false;
        }
        catch(Exception e)
        {
            System.out.println("Exception in Updater"+e);
        flag=false;
        }
       return flag;
    }
    
}
