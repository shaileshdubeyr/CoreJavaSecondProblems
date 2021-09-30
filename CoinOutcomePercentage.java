package com.myjava;

import java.util.Scanner;

public class CoinOutcomePercentage {
	public int coinFlip() {
		int percentageOfHead;
		double HEAD = 0.5;
		final int ONE = 1;
		int HUNDRED = 100;
		int headCounter = 0;
		int flipCoinLimit = inputCoinLimit();
		for (int i = ONE; i <= flipCoinLimit; i++) {
			int coinFlip = (int) (Math.random() * 2);
			if (coinFlip > HEAD) {
				headCounter++;
			}
		}
		return percentageOfHead = headCounter * HUNDRED / flipCoinLimit;
	}

	static int inputCoinLimit() {
		Scanner coinFlipInput = new Scanner(System.in);
		System.out.print("Enter the limit of coin flip ");
		int flipCoinLimit = coinFlipInput.nextInt();
		coinFlipInput.close();
		return flipCoinLimit;
		
	}

	public static void main(String[] args) {
		int HUNDRED = 100;
		QuestionOfCoreJava calculationCoinHeadPercentage = new QuestionOfCoreJava();
		int percentageOfHeadOutcome = calculationCoinHeadPercentage.coinFlip();
		int percentageOfTailOutcome = HUNDRED - percentageOfHeadOutcome;

		System.out.printf("the percentage of head outcome %d\nthe percentage of tail outcome %d\n",
				percentageOfHeadOutcome, percentageOfTailOutcome);
	}

}
