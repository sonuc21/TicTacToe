package com.tictactoe.game;

import com.tictactoe.model.Player;

public class Game {
	Player player1;
	Player player2;
	Board board;
	boolean currentPlayer;
	public Game(Player player1, Player player2, Board board,boolean currentPlayer) {
		this.player1 = player1;
		this.player2 = player2;
		this.board = board;
		this.currentPlayer = currentPlayer;
	}
	
	void run() {
		int totalTurns = board.getDimentions() * board.getDimentions();
		int turns = 0;
		while(turns < totalTurns) {
			board.print();
			Player currentPlayer = getCurrentPlayer();
			System.out.println("Player "+currentPlayer.symbol+"'s turn");
			currentPlayer.makeMove(board);
			int winner = ConventionalWinnerSelection.getWinner(board);
			if(winner > -1) {
				board.print();
				printWinner(winner);
				return;
			}
			
			updateCurrentPlayer();
			turns++;
		}
		System.out.println("No result!!");
	}
	Player getCurrentPlayer() {
		return currentPlayer? player1 : player2;
	}
	void updateCurrentPlayer() {
		currentPlayer = !currentPlayer;
	}
	
	void printWinner(int winner) {
		if(winner == 0) {
			System.out.println("Player O wins the game!!");
		}else if(winner == 1) {
			System.out.println("Player X wins the game!!");
		}
	}
}
