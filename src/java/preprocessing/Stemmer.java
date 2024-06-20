/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preprocessing;

import java.util.ArrayList;

public class Stemmer
{

    public static String stemmer( String str)
    {
        ArrayList st=new ArrayList();
        st.add("ing");
       

        int n=st.size();

        for(int i=0;i<n;i++)
        {
            String temp=(String)st.get(i);

            if(str.endsWith(temp))
            {
                str=str.replaceAll(temp,"");
            }
        }

    
        
        return str;
    }

}
