package lurn_algorithm;

import java.util.Scanner;

public class Credit_Card_Validator {

	static long  Multiplication;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 11 digit Card Number:");
		String num = sc.next();
		System.out.println(num);
		System.out.println(num.length());

		for (int i = num.length() - 1; i >= 0; i--) {
			// System.out.print(num.charAt(i));
			
			char[] c= num.toCharArray();
			System.out.println(c);
			
		
			if (i % 2 != 0) {

				System.out.println(num + " is of type " + num.getClass().getSimpleName());

				long number = num.charAt(i) - '0';

				long Multiplication = number * 2;

				System.out.println("Multiplied=" + Multiplication);
				
				String s=String.valueOf(Multiplication);
				
				System.out.println("Add:"+s);
				
				char[] d= s.toCharArray();
				System.out.println("d="+d);
				
				for(int j =0;j<s.length()-1;j++)
				
				if(s.charAt(j)>9)
				{
					long add = s.charAt(i)-'0';
					
					
					
					long rem = add%10;
					long mod = add/10;
					long sum = rem+mod;
					
					System.out.println("Sum = "+sum);
					
					
				}
				
			
					
			}
				
				

			}
			
	
			
		}
		
		  }

	



