package reuse;

import java.util.Scanner;

public class RevrseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		//using algorithm
		int rev=0;
		while(num!=0) {
			 rev=rev*10+num%10;
			 num=num/10;
		}
		System.out.println("the reverse number is: " + rev);
		

	}

}
