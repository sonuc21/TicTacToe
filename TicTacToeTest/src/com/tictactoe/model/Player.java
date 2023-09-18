package com.tictactoe.model;

import com.tictactoe.constant.Symboll;
import com.tictactoe.game.Board;

public abstract class Player {
	public Symboll symbol;

	public Player(Symboll symbol) {
		this.symbol = symbol;
	}
	public abstract void makeMove(Board b);

}
