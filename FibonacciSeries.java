package com.myjava;

import java.util.Scanner;

public class FibonacciSeries {
	static int userInputYear() {
		Scanner scanSeriesLimit = new Scanner(System.in);
		System.out.print("Enter the FibonacciSeries limit ");
		int fibonacciSeriesLimit = scanSeriesLimit.nextInt();
		return fibonacciSeriesLimit;
	}
	static void fibonacciSeriesPrinting() {
		int firstNumber = 0, seconNumber = 1, result;
		final int ONE = 1;
		
		int fibonacciSeriesLimit = userInputYear();
		System.out.println("the FibonacciSeries is");
		for(int i = ONE; i <= fibonacciSeriesLimit; i++ ) {
			result = firstNumber + seconNumber;
			System.out.printf("%d ",seconNumber);
			firstNumber = seconNumber;
			seconNumber = result;		
		}
			
	}
	public static void main(String[] args) {
		fibonacciSeriesPrinting();
	}
}
