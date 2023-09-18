package com.tictactoe.model;

import java.util.Scanner;

import com.tictactoe.constant.Symboll;
import com.tictactoe.game.Board;

public class HumanPlayer extends Player{
	private Scanner scanner;

	public HumanPlayer(Symboll symbol, Scanner scanner) {
	    super(symbol);
	    this.scanner = scanner;
	}

	@Override
	public void makeMove(Board b) {
		System.out.println("Please enter x and y cordinate");
	    int i = scanner.nextInt();
	    int j = scanner.nextInt();
	    b.grid[i][j] = this.symbol == Symboll.X ? 1 : 0;
	}
}
