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
public class Desorter {
        public ArrayList getSortedList(ArrayList sorter)
    {
        
       // ArrayList sorter=DataKeeper.gainl;
        
             
        
           for(int i=0;i<sorter.size()-1;i++)
           {
               
               for(int j=i+1;j<sorter.size();j++)
               {
                   
                   ArrayList temp1=(ArrayList) sorter.get(i);
                
                   int  x1=(int) temp1.get(temp1.size()-1);
                   
                   
                   ArrayList temp2=(ArrayList) sorter.get(j);
                      int  x2=(int) temp2.get(temp2.size()-1);
                   
                   
                   if(x1<x2)
                   {
                       sorter.set(i, temp2);
                       sorter.set(j, temp1);
                   }
               }
               
           }
           
     
           return sorter;

    }
    
    
}
