package com.tictactoe.game;

public class ConventionalWinnerSelection {
	
	// digonal check not done
	public static int getWinner(Board board) {
		for(int i=0; i<board.getDimentions(); i++) {
			int rowSum = board.getRowSum(i);
			int colSum = board.getColSum(i);
			if(rowSum == board.getDimentions() || colSum == board.getDimentions()) {
				return 1;
			}
			else if(rowSum == 0 || colSum == 0) {
				return 0;
			}	
		}
		return -1;
}

}
