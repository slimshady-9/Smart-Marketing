/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package product_recom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Innovatus
 */
public class ResultInserter {
    
     public boolean isResultInserted(String res)
    {
        boolean flag=true;
        
        deletedata();
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartrecom","root","root");
            Statement st=conn.createStatement();
            
            String query="Insert into results values('"+res+"')";
            
//            
            
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
            
            st.close();
            
        }
        
        catch(Exception e)
        {
            System.out.println("Exception in results Class is: "+e);
            flag=false;
        }
        
        
        
        
        return flag;
    }
    
     public boolean isResultInfoInserted(String user,String res,String dt)
    {
        boolean flag=true;
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartrecom","root","root");
            Statement st=conn.createStatement();
            
            String query="Insert into resultinfo values('"+user+"','"+res+"','"+dt+"')";
            
//            
            
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
            
            st.close();
            
        }
        
        catch(Exception e)
        {
            System.out.println("Exception in results Class is: "+e);
            flag=false;
        }
        
        
        
        
        return flag;
    }
     
     public boolean deletedata()
    {
        
        boolean flag=false;
	try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartrecom","root","root");
            Statement st=con.createStatement();

            String query="delete from  results  ";
            int x=st.executeUpdate(query);
            if(x>0)
               flag=true;
            else
                flag=false;
        }
        catch(Exception e)
        {
           System.out.println(e);
           flag=false;
        }
        
        return flag;
    }
    
    
}
