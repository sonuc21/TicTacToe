package com.tictactoe.game;

import java.util.Scanner;

import com.tictactoe.builder.GameBuilder;
import com.tictactoe.constant.Symboll;
import com.tictactoe.model.ComputerPlayer;
import com.tictactoe.model.HumanPlayer;
import com.tictactoe.model.Player;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1;
		Player p2;
		Scanner sc = new Scanner(System.in);
		Board b = new Board(3);
		while(true) {
			//vs computer is not implemented yet
			System.out.println("Please enter 1 for Vs Computer");
            System.out.println("Please enter 2 for Vs Human");
            int choice = sc.nextInt();
            System.out.println("Please enter symbol choice for Player1 for");
            System.out.println("Please enter 1 X");
            System.out.println("Please enter 2 O");
            int ch = sc.nextInt();
			if(choice == 1) {
				p1 = new HumanPlayer(ch == 1 ? Symboll.X : Symboll.O,sc);
				p2 = new ComputerPlayer(ch == 1 ? Symboll.O : Symboll.X);
				break;
			}else if(choice == 2) {
				p1 = new HumanPlayer(ch == 1 ? Symboll.X : Symboll.O,sc);
				p2 = new HumanPlayer(ch == 1 ? Symboll.O : Symboll.X,sc);
				break;
			}else {
				System.out.println("Abe chutiya choice shi se daal");
			}
		}
		System.out.println("Please enter 1 if you want to play first");
		boolean currentPlayer = sc.nextInt() == 1? true:false;
		Game game = new GameBuilder().setBoard(b).setPlayer1(p1).setPlayer2(p2).setCurrentPlayer(currentPlayer).getGame();
		game.run();
		
		

	}

}
