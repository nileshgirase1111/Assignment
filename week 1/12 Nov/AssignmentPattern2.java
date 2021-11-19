public class AssignmentPattern2 {
    public static void main(String args[]) 
   { 
    System.out.println("right tringle");
              //right tringle
    
      int n =5 ;
      for (int i =1; i<=n; i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print("* ");
          }    
           System.out.println();
      }
     
             //down right tringle
             
            System.out.println("down right tringle");
      for (int i =1; i<=n; i++)
      {
          for(int j=5;j>=i;j--)
          {
              System.out.print("* ");
          }    
           System.out.println();
      } 
    
          //square pattern     
          
           
            System.out.println(" Square pattern");
            
            
      for (int i =1; i<=n; i++)
      {
          for(int j=1 ;j<=n;j++)
          {
              System.out.print("* ");
          }    
           System.out.println();
      } 
      
      //Increasing right sided tringle
      
        System.out.println("Increasing right sided tringle :");
      for (int i =1; i<=n; i++)
      {
          for(int j=i;j<=n;j++)
          {
              System.out.print("  ");
          }
              
          for (int j=1 ;j<=i; j++)
          {
              System.out.print("* ");
          }

           System.out.println();
      } 
      //Decreasing right sided tringle
      System.out.println("Decreasing right sided tringle :");
      for (int i =1; i<=n; i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print("  ");
          }
              
          for (int j=i ;j<=n; j++)
          {
              System.out.print("* ");
          }

           System.out.println();
      } 
      // Hill pattern tringle
       System.out.println(" Hill pattern tringle :");
      for (int i =1; i<=n; i++)
      {
          for(int j=i;j<=n;j++)
          {
              System.out.print("  ");
          }
              
          for (int j=1 ;j<i; j++)
          {
              System.out.print("* ");
              
          }
           
            for (int j=1 ;j<=i; j++)
          {
              System.out.print("* ");
              
          }
           System.out.println();
      }
      //Reverse  Hill pattern tringle
        System.out.println("Reverse  Hill pattern tringle :");
      for (int i =1; i<=n; i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print("  ");
          }
              
          for (int j=i ;j<n; j++)
          {
              System.out.print("* ");
              
          }
           
            for (int j=i ;j<=n; j++)
          {
              System.out.print("* ");
              
          }
           System.out.println();
      }
      //Diamond pattern
            System.out.println(" Diamond pattern : ");
      for (int i =1; i<n; i++)
      {
          for(int j=i;j<=n;j++)
          {
              System.out.print("  ");
          }
              
          for (int j=1 ;j<i; j++)
          {
              System.out.print("* ");
              
          }
           
            for (int j=1 ;j<=i; j++)
          {
              System.out.print("* ");
              
          }
           System.out.println();
      }
      
       // here is adding pattern
       
      for (int i =1; i<=n; i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print("  ");
          }
              
          for (int j=i ;j<n; j++)
          {
              System.out.print("* ");
              
          }
           
            for (int j=i ;j<=n; j++)
          {
              System.out.print("* ");
              
          }
           System.out.println();
      }  
      
       System.out.println("its all about pattern");
     
      // Horizontal Triangle Pattern Tringle
      
      System.out.println("Horizontal Trainle Pattern");
      
      for (int i =1;i<n; i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print("* ");
          }    
           System.out.println();
      }
              // Here is adding start
            
      for (int i =1; i<=n; i++)
      {
          for(int j=5;j>=i;j--)
          {
              System.out.print("* ");
          }    
           System.out.println();
      } 
     
     // Here is Right tringle of Number Pattern 
     
     System.out.println("right tringle of Number pattern :");
             
      for (int i =1; i<=n; i++)
      {     
         int p=1;
          for(int j=1;j<=i;j++)
          {
              System.out.print(p+++" ");
          }    
           System.out.println();
      }
     
    }
   }   