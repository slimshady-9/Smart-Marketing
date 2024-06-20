



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package decisionMaking;

import java.util.ArrayList;

/**
 *
 * @author 1084
 */
public class InitiateFCM {

    public ArrayList getClusters( double  val)
    {
   
       FuzzyRules fz=new FuzzyRules();
       ArrayList rule=fz.getFuzzyRules(val);

//       FuzzyClustering fc=new FuzzyClustering();
//        ArrayList c=fc.getFuzzyClusters(mas,rule);
//      
       
       
       
return rule;
    }
     
    
    



    }


