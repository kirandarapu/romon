package reuse;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a number");
		int num=sc.nextInt();
		int org_num=num;
		
		int rev=0;
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println("this is palindrome num ");
		}else
		{
			System.out.println("this is nota palindrime num ");
		}
		
		

	}

}
