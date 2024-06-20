/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package product_recom;

import java.util.ArrayList;

/**
 *
 * @author 1450
 */
public class SarcasmNeuron 
{
    public ArrayList getEnhancedList(ArrayList tfidf,ArrayList pos,ArrayList neg)
    {
        ArrayList list=new ArrayList();
        
        if(pos.size()==0 && neg.size()==0)
        {
            
            
            for(int i=0;i<tfidf.size();i++)
            {
                ArrayList temp=(ArrayList)tfidf.get(i);
                String wrd=(String)temp.get(0);
                String tfidfindex=(String)temp.get(1);
                double dv=Double.parseDouble(tfidfindex);
                if(dv>0.4)
                {
                    neg.add(wrd);
                }
                
            }
            
             list.add(pos);
            list.add(neg);
        }
        else
        {
            list.add(pos);
            list.add(neg);
            
        }
        
        
        
        return list;
    }
}
