/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuzzyANN;

import java.util.ArrayList;

public class TermWeightNueron 
{
    public ArrayList EnhancedTermweight(ArrayList tw,ArrayList ft)
    {
      ArrayList enhanced=new ArrayList();
        
      if(ft.size()==0)
      {
          enhanced=ft;
      }
      else
      {
         
          for(int i=0;i<ft.size();i++)
          {
              String wrd=(String)ft.get(i);
              wrd=wrd.trim();
              String st[]=wrd.split(" ");
                  if(st.length>1)
                  {
                      enhanced.add(wrd); 
                      
                  }

              for(int j=0;j<tw.size();j++)
              {
                  ArrayList temp = (ArrayList) tw.get(j);
                  String fw = (String) temp.get(0);
                  fw = fw.trim();
                  String wc = (String) temp.get(1);
                  int wcount = Integer.parseInt(wc);
                  
                  if(wrd.equals(fw))
                  {
//                     System.out.println("wwwwww "+wrd);
//                      System.out.println("ccccc "+wcount);
                      for(int k=0;k<wcount;k++)
                      {
                           enhanced.add(wrd);
                      }
                      
                      
                  }
                 
                   
                  
              }
            
              
          }
          
          

       
      }
        
      
      return enhanced;
    }
}
