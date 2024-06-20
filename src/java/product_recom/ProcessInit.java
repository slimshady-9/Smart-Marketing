/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product_recom;


import decisionMaking.InitiateFCM;
import features.PNListIdentifier;
import features.TermWeightCalculator;

import fuzzyANN.TermWeightNueron;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import preprocessing.Preprocessor;
import tf_idf.TF_Evaluator_FIN;
import tf_idf.IDFInitiator_FIN;


/**
 *
 * @author welcome
 */
public class ProcessInit {
    
    public String  processinitater(ArrayList data ,String prod)
    {
        
        ArrayList product=new ArrayList();
        
        for (int i = 0; i < data.size(); i++) 
        {
            ArrayList row=(ArrayList) data.get(i);
            String pro=(String) row.get(2);
            product.add(pro);
            
        }
        ArrayList unipro=new DuplicateElimater().getUnique(product);
        System.out.println(unipro);
          ArrayList clust=new ArrayList();
        for (int i = 0; i < unipro.size(); i++)
        {
            
          
            ArrayList temp=new ArrayList();
            String proname=(String) unipro.get(i);
            for (int j = 0; j < data.size(); j++)
            {
                
                ArrayList row=(ArrayList) data.get(j);
                String proname1=(String) row.get(2);
                if(proname.equals(proname1))
                {
                    temp.add(row);
                }
              
            }
            
            clust.add(temp);
           
        }
        
           for(int i=0;i<clust.size();i++)
        {
            System.out.println("Cluster No.: "+(i));
            ArrayList single= (ArrayList) clust.get(i);
            for(int j=0;j<single.size();j++)
            {
                ArrayList row=(ArrayList) single.get(j);
                System.out.println(row);
                
            }
            System.out.println("\n------------------------------------------------------------\n");
            
        }
              ArrayList fincorr=new ArrayList();
               String finstr="";
                 ArrayList fin=new ArrayList();
           for(int i=0;i<clust.size();i++)
        {
            System.out.println("Cluster No.: "+(i));
            ArrayList singleproduct= (ArrayList) clust.get(i);
            
            int pc=0,nc=0,nuc=0;
             ArrayList prodt=(ArrayList) singleproduct.get(0);
             String productsub=(String)prodt.get(2);
            String productrecom="";
           
            String finstr1="";
            for(int j=0;j<singleproduct.size();j++)
            {
                ArrayList row=(ArrayList) singleproduct.get(j);
              //  String sub=(String)row.get(2);
             String cont=(String)row.get(4);
             
             cont=cont.toLowerCase();
             cont=cont.trim();
             //  System.out.println("PRODUCT IS : "+sub);
             System.out.println("COMMENT IS : "+cont);
             String pre=new Preprocessor().textProcessing(cont);
             System.out.println("PREPROCESSED SUBJECT CONTENTS IS : "+pre);
             
            ArrayList pn = new PNListIdentifier().getPNList(pre);
            ArrayList pos = (ArrayList) pn.get(0);
            ArrayList neg = (ArrayList) pn.get(1);

            System.out.println("Positive Words : " + pos);
            System.out.println("Negative Words : " + neg);

            ArrayList term = new TermWeightCalculator().termWeightEstimator(pre);
            System.out.println("FREQUENCY OF WORDS ARE  : " + term);

            ArrayList pos1 = new TermWeightNueron().EnhancedTermweight(term, pos);
            ArrayList neg1 = new TermWeightNueron().EnhancedTermweight(term, neg);
               
                System.out.println("Enhanced Positive Neurons Through Term Weight : " + pos1);
                System.out.println("Enhanced Negative Neurons Through Term Weight: " + neg1);
            
                 System.out.println("Enhanced Positive Neurons Through Term Weight : " + pos1);
                System.out.println("Enhanced Negative Neurons Through Term Weight: " + neg1);
                                   
               

                 ArrayList tflist= new TF_Evaluator_FIN().getTF(pre);
                 ArrayList tfidflist= new IDFInitiator_FIN().getIDF(tflist, singleproduct);
                System.out.println("TF IDF OF SUBJECT IS  : "+tfidflist);
                 
                ArrayList list=new SarcasmNeuron().getEnhancedList(tflist, pos1, neg1);
                ArrayList pos2=(ArrayList)list.get(0);
                ArrayList neg2=(ArrayList)list.get(1);
                
                System.out.println("Final Enhanced Positive Neurons Through  : " + pos2);
                System.out.println("Final Enhanced Negative Neurons : " + neg2);
                
                int p=pos2.size();
                int n=neg2.size();
               double corr=new CorreationHelper().getCorrelation(p,n);
               System.out.println("CORRELATION IS "+corr);
               
               String str=Double.toString(corr);
               ArrayList tt=new ArrayList();
               //tt.add(sub);
               tt.add(str);
               fincorr.add(tt);
               
                System.out.println("Postive Words Size is "+p);
                System.out.println("Negative Words Size is "+n);
                
                System.out.println("=======================================================\n\n");
                
                
                 double res=p-n;
                if(res>1)
                {
                    fin.add(row);
                }
            }
            
         
           
        }
           
           
           
               System.out.println("Final Recommendations");
           
           String strlink="";
           for (int i = 0; i < fin.size(); i++)
           {
              ArrayList row=(ArrayList) fin.get(i);
              String link=(String) row.get(8);
              strlink=strlink+"#"+link;
               System.out.println(row);
           }
           
           
             ArrayList mopro=new ArrayList();
             for (int i = 0; i < fin.size(); i++)
           {
              ArrayList row=(ArrayList) fin.get(i);
              String pro=(String) row.get(2);
              ArrayList temp=new ArrayList();
              mopro.add(pro);
               
           }
             
             Set hh1=new HashSet();
              hh1.addAll(mopro);
             mopro.clear();
             mopro.addAll(hh1);
             
                          System.out.println(mopro);
                          
                          
                                ArrayList feature=new ArrayList();
             for (int i = 0; i < mopro.size(); i++)
             {
                 String mo=(String) mopro.get(i);
                 int count=0;
                 ArrayList temp=new ArrayList();
                 for (int j = 0; j < fin.size(); j++)
                 {
                     ArrayList row = (ArrayList) fin.get(j);
                     String pro = (String) row.get(2);
                     if(mo.equals(pro))
                     {
                         count++;
                     }
                 }
                 temp.add(mo);
                 temp.add(count);
                 feature.add(temp);
             }
             System.out.println("Features \n");
                for (int i = 0; i < feature.size(); i++)
           {
              ArrayList row=(ArrayList) feature.get(i);
               System.out.println(row);
           }
                
                 ArrayList defeatures=new Desorter().getSortedList(feature);
              ArrayList unifeatu=new DuplicateElimater().getUnique(defeatures);
           
             int finsize=fin.size();
             double finval=finsize/2;
             
             ArrayList rule=new InitiateFCM().getClusters(finval);
             
             System.out.println(rule);
             
              ArrayList ctype=new ArrayList();
                ctype.add("Very-Low");
                ctype.add("Low");
                ctype.add("Meduim");
                ctype.add("High");
                ctype.add("Very-High");
                
                String clusttype="";
                for (int i = 0; i < feature.size(); i++)
                {
                    ArrayList row=(ArrayList) feature.get(i);
                    String pro=(String) row.get(0);
                    int count=(int) row.get(1);
                   
                    if(pro.equals(prod))
                    {
                        // System.out.println("count "+count);
                        for (int j = 0; j < rule.size(); j++) {
                            ArrayList row1 = (ArrayList) rule.get(j);
                            double min = (double) row1.get(0);
                            double max = (double) row1.get(1);
                            // System.out.println("min "+min+" max "+max);
                            if ((count >=min) && (count <=max)) {
                                clusttype = (String) ctype.get(j);
                            }

                        }
                    }
                  
                    
                }
                String message="";
               if(clusttype.isEmpty())
               {
                   System.out.println("Recoomeded pro "+mopro);
                   String mob="";
                   for (int i = 0; i < 3; i++) 
                   {
                       ArrayList row=(ArrayList) unifeatu.get(i);
                       String mo=(String) row.get(0);
                       mob=mob+","+mo;
                   }
                   
                    message="There are no Recommendation for "+prod+" But you can try the following product "+mob+" and the below are the some recommended products links \n \n \n "+strlink;
               }else
               {
                         message ="Product Recommendation for "+prod+" from system is "+clusttype+" and the below are the some recommended products links \n \n \n "+strlink;  
               }
      
             
             System.out.println("Final Result:\n"+message);
        return message;
             
    }
    
}
