/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product_recom;

import java.util.ArrayList;

/**
 *
 * @author welcome
 */
public class Product_recom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 String path="C://Review Dataset.xls";

        String product="keyboard";
        ArrayList data=new ExcelReader().getExcelData(path);

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList row=(ArrayList) data.get(i);
            System.out.println(row);

        }

        new ProcessInit().processinitater(data,product);
    }
    
}
