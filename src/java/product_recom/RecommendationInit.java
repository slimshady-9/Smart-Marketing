/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product_recom;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author welcome
 */
public class RecommendationInit {
    public boolean isRecommended(String product , String username)
    {
        
        boolean flag =false;
        
        String path="C://Review Dataset.xls";
        ArrayList data=new ExcelReader().getExcelData(path);

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList row=(ArrayList) data.get(i);
            System.out.println(row);

        }
       
       String res= new ProcessInit().processinitater(data,product);
       String date=new CurrentDate().getDate();
       String time=new CurrentTime().getTime();
       String dt=date+"--"+time;
        boolean flag1=new ResultInserter().isResultInserted(res);
       
       boolean flag2=new ResultInserter().isResultInfoInserted(username, res, dt);
       if(flag1==true && flag2==true)
       {
           flag=true;
       }
      
       
        return flag;
    }
}
