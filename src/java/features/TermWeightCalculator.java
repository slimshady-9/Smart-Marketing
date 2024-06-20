/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package features;

import java.util.ArrayList;
import product_recom.DuplicateEliminator;


/**
 *
 * @author 1450
 */
public class TermWeightCalculator 
{
    public ArrayList termWeightEstimator(String str)
    {
        ArrayList freq=new ArrayList();
        String st[]=str.split(" ");
        ArrayList words=new ArrayList();
         ArrayList org=new ArrayList();
        for(int i=0;i<st.length;i++)
        {
            words.add(st[i]);
            org.add(st[i]);
        }
      words= new DuplicateEliminator().getUnique(words);
//        System.out.println("org is  "+org);
//        System.out.println("words is  "+words);
//        
        for(int i=0;i<words.size();i++)
        {
            String wrd=(String)words.get(i);
            
            int count=0;
             for(int j=0;j<org.size();j++)
             {
                  String og=(String)org.get(j);
                 if(wrd.equals(og))
                     count++;
                 
             }
             ArrayList temp=new ArrayList();
             temp.add(wrd);
             temp.add(Integer.toString(count));
             freq.add(temp);
            
        }
        
        
        
        return freq;
    }
}
