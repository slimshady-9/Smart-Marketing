/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package decisionMaking;

import java.util.ArrayList;

/**
 *
 * @author A57
 */
public class FuzzyRules {

    public ArrayList getFuzzyRules(double  val)
    {
        

        

              ArrayList r=new Range().getMinMax(val);
     
           
//        }
//       System.out.println("rules generated..");
//       System.out.println(rule);
     return r;
    }

}
