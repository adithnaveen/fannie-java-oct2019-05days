package com.fannie.exception;

public class ExceptionEx01 {
	public static void main(String[] args) {

		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			try {
				int[] arr = new int[5];
				
				arr[10] =55; 
			} catch (NegativeArraySizeException nase) {
				System.out.println("Sorry dont initialize with -ve values ");
			}
			
			
			
			int result = num1 / num2;

			System.out.println("Result :" + result);
		} catch (ArithmeticException ae) {
			System.out.println("Denominator cannot be zero " + ae.getMessage());
		}catch(Exception e) {
			System.out.println(e);
		}

		System.out.println("Some business logic goes here... ");
	}
}
