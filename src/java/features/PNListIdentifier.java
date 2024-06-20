/*
 * 
 * To change this template file, choose Tools | Templates To change this license header, choose License Headers in Project Properties.
 * and open the template in the editor.
 */

package features;

import java.util.ArrayList;
import product_recom.DuplicateEliminator;


/**
 *
 * @author 1450
 */
public class PNListIdentifier 
{
    public ArrayList  getPNList(String str)
    {
        ArrayList pn=new ArrayList();
        
        ArrayList pos=new ArrayList();
        ArrayList neg=new ArrayList();
        
        
        String st[]=str.split(" ");
        
     //good change not good header, choose License Headers in Project Properties.   
     //0   1      2      3   
        for(int i=0;i<st.length;i++)
        {
            String wrd=st[i];
            wrd=wrd.trim();
           if(isPositive(wrd))
           {
             //  System.out.println("PPP "+wrd);
               if(i>0)
               {
                   if(st[i-1].equals("not") )
                   {
                       String addword="not "+wrd;
                      neg.add(addword);
                   }
                   else  if(st[i-1].equals("no") )
                   {
                        String addword="no "+wrd;
                      neg.add(addword);
                   }
                   
                   else
                   {
                       pos.add(wrd);
                   }
                       
               }
               else
               {
                 pos.add(wrd);  
               }
               
           }
           
           if(isNegative(wrd))
           {
               if(i>0)
               {
                   if(st[i-1].equals("not")  )
                   {
                       String addword="not "+wrd;
                      pos.add(addword);
                   }
                   else  if(st[i-1].equals("no") )
                   {
                        String addword="no "+wrd;
                        
                        System.out.println("in negative post word "+addword);
                      pos.add(addword);
                   }
                   else
                   {
                       neg.add(wrd);
                   }
                       
               }
               else
               {
                 neg.add(wrd);  
               }
               
           }
            
            
            
        }
        
        
     //   System.out.println("Positive "+pos);
       // System.out.println("Negative  "+neg);
        
       pos=new DuplicateEliminator().getUnique(pos);
       neg=new DuplicateEliminator().getUnique(neg);
       pn.add(pos);
       pn.add(neg);
       
       
        
        return pn;
    }
    
    
    public boolean isPositive(String word)
{
    boolean flag=false;
    ArrayList positive=new ArrayList();
    positive.add("good");
    positive.add("great");
    positive.add("love");
    positive.add("nice");
    positive.add("happy");
    positive.add("work");
    positive.add("like");
    positive.add("excellent");
 
    
    
    
    if(positive.contains(word))
        flag=true;
    else
        flag=false;
        
    return flag;
}
    
       
public boolean isNegative(String word)
{
    boolean flag=false;
    ArrayList negative=new ArrayList();
    negative.add("cheap");
    negative.add("refund");
    negative.add("complaints");
    negative.add("bad");
    
    if(negative.contains(word))
        flag=true;
    else
        flag=false;
        
    return flag;
    
}
    
}
