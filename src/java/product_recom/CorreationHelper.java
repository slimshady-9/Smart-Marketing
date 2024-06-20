

package product_recom;


public class CorreationHelper
{
   public  double getCorrelation(int p,int n)
    {
        int xc=0;
        int yc=0;
       
        double corr=0;
        int size=0;
      
       if(p==0 && n==0)
       {
           corr=0.5;
       }
       else
       {
           int big = 0;
           if (p > n) 
           {
               big = p;
           } 
           else
           {
               big = n;
           }
           size = big + 1;
           double x[] = new double[size];
           double y[] = new double[size];
           x[xc++]=0;
           y[yc++]=0;
           
           
           if(p>n && n==0)
           {
               
                 for(int i=0;i<p;i++)
                 {
                     x[xc++]=1;
                     y[yc++]=1;
                     
                 }
                      corr=new PersonCorrelation().getCorrelation(x, y);
           }
           else if(p<n && p==0)
           {
               for(int i=0;i<n;i++)
                 {
                     x[xc++]=1;
                     y[yc++]=0;
                     
                 } 
                corr=new PersonCorrelation().getCorrelation(x, y);
           }
           else if(p==n)
           {
               corr=0.5;
           }
           else
          {
//              System.out.println("Here");
              for(int i=0;i<p;i++)
                 {
                     x[xc++]=1;
                                        
                 }  
              
//              System.out.println("xc  "+xc);
//               System.out.println("size  "+size);
              if(xc<size)
              {
                  int r=size-xc;
//                  int k=x.length-1;
//                  System.out.println("K is "+k);
                   for(int i=0;i<r;i++)
                 {
                     x[xc++]=0;
                                        
                 }  
                
              }
               
               
//              System.out.print("X is ");
              
//              for(int i=0;i<x.length;i++)
//              {
//                   System.out.print(x[i]+" ");
//              }
//              System.out.println();
              
           
           

           // for yy
           
            for(int i=0;i<n;i++)
                 {
                     y[yc++]=1;
                                        
                 }  
              
//              System.out.println("yc  "+yc);
//               System.out.println("size  "+size);
              if(yc<size)
              {
                  int r=size-yc;
//                  int k=x.length-1;
//                  System.out.println("K is "+k);
                   for(int i=0;i<r;i++)
                 {
                     y[yc++]=0;
                                        
                 }  
                
              }
               
               
//              System.out.print("y is ");
              
//              for(int i=0;i<y.length;i++)
//              {
//                   System.out.print(y[i]+" ");
//              }
//              System.out.println();
              
               corr=new PersonCorrelation().getCorrelation(x, y);
               if(p>n)
               {
                   if(corr<0.5)
                   {
                       corr=1-corr;
                   }
                   
               }
               else
               {
                    if(corr>0.5)
                   {
                       corr=1-corr;
                   }
               }
              
          }
           
            
           
       }
        
        
        
        



          
          // System.out.println("Correletion is "+corr);

        
        return corr;
    }
}
