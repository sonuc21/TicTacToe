package com.tictactoe.builder;

import com.tictactoe.game.Board;
import com.tictactoe.game.Game;
import com.tictactoe.model.Player;

public class GameBuilder {
	Player player1;
	Player player2;
	Board board;
	boolean currentPlayer;
	public GameBuilder setPlayer1(Player player1) {
		this.player1 = player1;
		return this;
	}
	public GameBuilder setPlayer2(Player player2) {
		this.player2 = player2;
		return this;
	}
	public GameBuilder setBoard(Board board) {
		this.board = board;
		return this;
	}
	public GameBuilder setCurrentPlayer(boolean currentPlayer) {
		this.currentPlayer = currentPlayer;
		return this;
	}
	
	public Game getGame() {
		return new Game(player1, player2, board, currentPlayer);
	}

}
