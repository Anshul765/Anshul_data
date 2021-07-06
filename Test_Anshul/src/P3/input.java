package P3;
/*
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		 System.out.println("Please enter a value");
		Scanner sc = new Scanner(System.in); // has a relationship, we are creating object of another class
		int a = sc.nextInt();
		System.out.println("value of a is " +a);
		}

	}
	
	
	
}


*/


import java.util.*;

public class input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the " + (i+1) + " value");
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		
		
	}
	
}
