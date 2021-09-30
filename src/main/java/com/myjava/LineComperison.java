package com.myjava;

import org.apache.logging.log4j.core.pattern.EqualsBaseReplacementConverter;

public class LineComperison {
	public static void main(String[] args) {
		System.out.println("Welcome to the line compersion computation");
		int x1 = (int)(Math.random() * 9);
		int x2 = (int)(Math.random() * 9);
		int y1 = (int)(Math.random() * 9);
		int y2 = (int)(Math.random() * 9);
		int x3 = (int)(Math.random() * 9);
		int x4 = (int)(Math.random() * 9);
		int y3 = (int)(Math.random() * 9);
		int y4 = (int)(Math.random() * 9);
		System.out.printf("the x1 %d and x2 %d and y1 %d y2 %d \n",x1,x2,y1,y2);
		System.out.printf("the x3 %d and x4 %d and y3 %d y4 %d \n",x3,x4,y3,y4);
		double slope = y2-y1 / x2-x1;
		System.out.printf("the slope is line 1 %.2f \n",slope);
		double slope1 = y4-y3 / x4-x3;
		System.out.printf("the slope is line 2 %.2f \n",slope1);
		String string= String.valueOf(slope);
		String string1=String.valueOf(slope1);
		System.out.println(string.compareTo(string1));
		
	}

}
