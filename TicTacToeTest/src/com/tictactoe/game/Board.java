package com.tictactoe.game;

import java.util.Arrays;

public class Board {
	public int grid[][];
	int dimension;
	Board(int dimension){
		this.dimension = dimension;
		grid = new int[dimension][dimension];
		for(int i = 0; i < dimension; i++) {
			Arrays.fill(grid[i], -1);
		}
	}
	
	public int getRowSum(int row) {
		int sum=0;
		for(int i=0; i<grid.length; i++) {
			sum+=grid[row][i];
		}
		return sum;
	}
	
	public int getColSum(int col) {
		int sum =0 ;
		for(int i=0; i<grid.length; i++) {
			sum += grid[i][col];
		}
		return sum;
	}
	
	public void print() {
		System.out.println("--------------------------------------------------------------");
		for(int i = 0; i < this.dimension; i++) {
			for(int j = 0; j < this.dimension; j++) {
				if(this.grid[i][j] == 1) {
					System.out.print("X ");
				}
				else if(this.grid[i][j] == 0) {
					System.out.print("O ");
				}
				else
					System.out.print("- ");
			}
			System.out.println();
		}
		
	}

	public int getDimentions() {
		// TODO Auto-generated method stub
		return this.dimension;
	}

}
