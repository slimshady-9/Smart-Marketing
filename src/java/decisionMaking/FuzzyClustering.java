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
public class FuzzyClustering {

    ArrayList fclusters=new ArrayList();
    public ArrayList getFuzzyClusters(ArrayList mas,ArrayList rule)
    {
        int k=1;// start column no//
        
        for(int i=0;i<rule.size();i++)
        {
            ArrayList ccluster=new ArrayList();   // cluster for one cloumn//
            ArrayList crule=(ArrayList)rule.get(i); // get all rule for one column//

            for(int m=0;m<crule.size();m++)
            {
               ArrayList cluster=new ArrayList();// T Hold Cluster of One Type//
               ArrayList temp=(ArrayList)crule.get(m);
               double r1=Double.parseDouble(temp.get(0).toString());
               double r2=Double.parseDouble(temp.get(1).toString());
              
                for(int j=0;j<mas.size();j++)
                {
                ArrayList row=(ArrayList)mas.get(j);
                double rv=Double.parseDouble(row.get(k).toString());
             
                if(rv>=r1&&rv<=r2)
                {
                    
                    cluster.add(row);
                }

                }
               ccluster.add(cluster);

            }
            k++;
            fclusters.add(ccluster);
        }

 System.out.println(fclusters);

return fclusters;

    }
}
