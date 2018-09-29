package demo;

import java.util.Scanner;

public class Sam {
	public static void main(String args[]){
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a");
		a = s.nextInt();
		System.out.println("Enter b");
		b = s.nextInt();
		//int c = a + b;
		//System.out.println("The Additon a + b = " + c);
		//System.out.println("-------------"); 
		
		int c = a - b;
		System.out.println("The Additon a - b = " + c);
	}

}
