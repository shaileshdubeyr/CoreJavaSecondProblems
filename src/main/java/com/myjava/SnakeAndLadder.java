package com.myjava;

public class SnakeAndLadder {

	public static void main(String[] args) {

		playerPlayingLadderAndSnake();
	}

	static void playerPlayingLadderAndSnake() {
		int player1Positatoion = 0;
		int previousPositationPlayer1;
		int player2Positatoion = 0;
		int previousPositationPlayer2;
		while (true) {
			int ladderOrSnakeValue = (int) (Math.random() * 3);
			System.out.println("the snake ladder " + ladderOrSnakeValue);
			int dieValue = (int) ((Math.random() * 6) + 1);
			System.out.println("the dice value is " + dieValue);
			if (ladderOrSnakeValue == 1) {
				previousPositationPlayer1 = player1Positatoion;
				player1Positatoion = player1Positatoion + dieValue;
				if (player1Positatoion > 100)
					player1Positatoion = previousPositationPlayer1;
				continue;
			} else if (ladderOrSnakeValue == 2) {
				player1Positatoion = player1Positatoion - dieValue;
				if (player1Positatoion < 0)
					player1Positatoion = 0;
			} else
				player1Positatoion = player1Positatoion;
			if (player1Positatoion == 100) {
				System.out.println("the player1 win first");
				break;
			}
			playAgainPlayer2: if (true) {
				int ladderOrSnakeValue2 = (int) (Math.random() * 3);
				System.out.println("the snake ladder " + ladderOrSnakeValue2);
				int dieValue2 = (int) ((Math.random() * 6) + 1);
				System.out.println("the dice2 value is " + dieValue2);
				if (ladderOrSnakeValue2 == 1) {
					previousPositationPlayer2 = player2Positatoion;
					player2Positatoion = player2Positatoion + dieValue2;
					if (player2Positatoion > 100)
						player2Positatoion = previousPositationPlayer2;
					break playAgainPlayer2;
				} else if (ladderOrSnakeValue2 == 2) {
					player2Positatoion = player2Positatoion - dieValue2;
					if (player2Positatoion < 0)
						player2Positatoion = 0;
				} else
					player2Positatoion = player2Positatoion;
				if (player2Positatoion == 100) {
					System.out.println("player 2 win first");
					break;
				}
			}
		}
	}
}
