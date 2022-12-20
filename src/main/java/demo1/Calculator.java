package demo1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		
		System.out.println("Addition :" + Math.add(a,b));
		
		sc.close();

	}

}
