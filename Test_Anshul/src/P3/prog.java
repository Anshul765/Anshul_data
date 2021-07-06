//To find out Palindrome
package P3;

import java.util.*;   
import java.lang.*;
class prog  
{  
   public static void main(String args[])  
   {  
     prog obj = new prog();
    /* obj.palindrome(); 
     obj.swap_version1();
     obj.swap_version2();  
     
     obj.factorial();
     obj.table();
     obj.Fibonacci(); 
     obj.armstrong(); */
     obj.primecheck();
   }
   
   public void palindrome() {
	      String a = ""; // input string 
	      String temp = ""; //temporary string for storing reverse value
	      
	      Scanner sc = new Scanner(System.in);   
	      System.out.println("Please provide the input");
	      a = sc.nextLine();   
	      int len = a.length();
	      
	      for (int i=len- 1;i >= 0;i--) {  	  // for loop; iteration start from last index 		 
	         temp = temp + a.charAt(i);  // building string array in reverse format.
	      }
	      if (a.equals(temp)) { 
	         System.out.println("Palindrome State"); 
	      }
	      else {  
	         System.out.println("Not a palindrome state");  
	      }
	}

   
   public void swap_version1() {
	   int a,b,temp;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value of a");
	   a = sc.nextInt();
	   System.out.println("Enter the value of b");
	   b = sc.nextInt();
	   
	   System.out.println("Initial value is " + a + " " + b );
	   
	   /* swapping logic begins here */
	   
	   temp = a;   
	   a = b;
	   b = temp;
	
	   
	   /* swapping logic ends here */
	   
	   System.out.println("New value of a is " +a);
	   System.out.println("New value of b is " +b);
	   
	   System.out.println("On swapping value using 3rd variable is " + a + " " + b );
	   
	} 
   
   public void swap_version2() {
	   int a,b;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value of a");
	   a = sc.nextInt();
	   System.out.println("Enter the value of b");
	   b = sc.nextInt();
	   
	   System.out.println("Initial value is " + a + " " + b );
	   
	   /* swapping logic begins here */
	   a = a + b;
	   b = a - b;
	   a = a - b;
	   
	   /* swapping logic ends here */
	   
	  System.out.println("New value of a is " +a);
	   System.out.println("New value of b is " +b);
	   
	   System.out.println("On swapping value without using 3rd variable is " + a + " " + b );
	   
	}
 
   public void primecheck() {
	   int a;
	   boolean bool = true;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number");
	   a = sc.nextInt();
	   
	   System.out.println("Number to be check  is " + a);
	   
	   if(a == 0 || a == 1) {
		   System.out.println("Its not a prime number"); // since 0 and 1 can not be prime number
		   bool = false;
	   }
	    /* logic begins from here */ 
	    for(int i=2;i<=a/2;i++) {
			   if(a % i == 0) {
				   System.out.println("Its not a prime number");
				   bool = false;
				   break;  // to avoid unnecessary iterations
				}
		   } 	 
		
		if(bool == true) {
				   System.out.println("Its a prime number"); 
		   }	
		/* logic ends here */ 
   }
	
   
   
   public void factorial() {
	   int a;
	   int number = 1;
	  
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number");
	   a = sc.nextInt();
	   
	   for(int i = 1; i <= a; i++) {
		   number = number * i;   //factorial calculation 
	   }
	   	System.out.println("Factorial of " + a + " is " +number);
   }
   
   public void table() {
	   int a;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number");
	   a = sc.nextInt();
	   
	   for(int i = 1; i <= 10; i++) {
		  System.out.println(a + " cross " + i + " is " + (a*i)); //printing a table

	   }
	   
   }
   
   public void Fibonacci() {
	   int a;
	   int x = 0;
	   int y = 1;
	   int fib;
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number");
	   
	   a = sc.nextInt();
	   System.out.println(x);
	   System.out.println(y);
	   
	   for(int i = 2; i < a; i++) {
		   fib = x + y;    // adding first and second value
		   System.out.println(fib);
		   x = y; //  value reassigned to previous value  
		   y = fib; //  value reassigned sum of  previous 2 values 
	   }
	   
   }
   /*
   public void armstrong() {
	   
	   int sum = 0;

	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number for string");
	   String a = sc.nextLine();
	   
	   System.out.println("Enter a number again for integer");
	   int b = sc.nextInt();
	   
	   
	   for(int i=0;i<a.length();i++) {
		   char p = a.charAt(i);
		   int q = Character.getNumericValue(p); // to convert string to int
		   int x = q;   // to hold value created by ith index
		   int y = q;	// to hold value created by ith index
		   
		   for(int j=0;j<a.length()-1;j++)
			{
				x=x*y;    // y will always hold the same value
			}
		   sum = sum + x;
		}
	  
	   if(b == sum)
		{
			System.out.println("This is Armstrong number");
		}
		else {
			System.out.println("This is Not a armstrong number");
		} 
		
   }
   */
   
public void armstrong() {
	   int sum = 0;

	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number for string");
	   
	   Integer b = sc.nextInt();
	   String a = b.toString();
	   
	for(int i=0;i<a.length();i++) {
		   char p = a.charAt(i);
		   int q = Character.getNumericValue(p); // to convert string to int
		   int x = q;   // to hold value created by ith index
		   int y = q;	// to hold value created by ith index
		   
		   for(int j=0;j<a.length()-1;j++)
			{
				x=x*y;    // y will always hold the same value
			}
		   sum = sum + x;
		}
	  
	   if(b == sum)
		{
			System.out.println("This is Armstrong number");
		}
		else {
			System.out.println("This is Not a armstrong number");
		} 
		
   }
}
   