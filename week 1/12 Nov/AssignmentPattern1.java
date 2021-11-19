public class AssignmentPattern1 {

	public static void main(String[] args) {
	    
		// Print Reverse Pyramid Pattern : 
		 System.out.println("Print Reverse Pyramid Pattern :");
		
		int n = 5;
		
		for (int i =1 ; i<=n ; i++){
		    for(int j=1;j<=i;j++)
		  {   
		    System.out.print("  ");
		  }
		  for(int j=i;j<n;j++)
		  {
		    System.out.print("* ");  
		  }
		   		  for(int j=i;j<=n;j++)
		  {
		    System.out.print("* ");  
		  }   
		       System.out.println();  
		}
		// Print Diamond Pattern : 
		System.out.println("Print Diamond Pattern :");
		
			for (int i =1 ; i<n ; i++){
		    for(int j=i;j<=n;j++)
		  {   
		    System.out.print("  ");
		  } 
		  for(int j=1;j<i;j++)
		  {
		    System.out.print("* ");  
		  }
		    for(int j=1;j<=i;j++)
		  {
		    System.out.print("* ");  
		  }   
		  System.out.println(); 
			}
		  //Adding start from here 
		  
		  	for (int i =1 ; i<=n ; i++)
		  { 
		       for(int j=1;j<=i;j++)
		  {   
		    System.out.print("  ");
		  } 
		   for(int j=i;j<n;j++)
		  {
		    System.out.print("* ");  
		  }
		    for(int j=i;j<=n;j++)
		  {
		    System.out.print("* ");  
		  }   
		  
		       System.out.println();  
		}

        // Reverse Pyramid Numbrer pattern :--12121
	    
	    
	    System.out.println("Reverse pyramid number pattern :");
	    
	    for (int i =1 ; i<=n ; i++){
		    for(int j=1;j<=i;j++)
		  {   
		    System.out.print("  ");
		  }
		  for(int j=i;j<n;j++)
		  {  
		      if(i%2==0){
		          System.out.print("2 ");
		      }else{
		          System.out.print("1 ");
		      }
		    
		  }
		   		  for(int j=i;j<=n;j++)
		  {
		       if(i%2==0){
		          System.out.print("2 ");
		      }else{
		          System.out.print("1 ");
		      }
		  }   
		       System.out.println();  
		}
		//Print Reverse Pyramid number Pattern :--12345
	 System.out.println("Print Reverse Pyramid number Pattern :");
	
		for (int i =1,p=1;i<=n;i++,p++){
		    for(int j=1;j<=i;j++)
		  {   
		    System.out.print("  ");
		  }
		  for(int j=i;j<n;j++)
		  {
		    System.out.print(p+" ");  
		  }
		   		  for(int j=i;j<=n;j++)
		  {
		    System.out.print(p+" ");  
		  }   
		       System.out.println();  
		}
	} 
  }
