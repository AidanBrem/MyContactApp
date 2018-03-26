//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	private int winStyle = 0;
	private String[] winStyles = {"Horizontally", "Vertically", "Diagonally"};
	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int curY = 0;
		int curX = 0;
		for (int i = 0; i < game.length(); i++) {
			mat[curY][curX] = game.charAt(i);
			curX++;
			if (curX == 3) {
				curX = 0;
				curY++;
			}
		}
		
		//for (int i = 0; i < mat.length; i++) {
			//for (int x = 0; x < mat.length; x++) {
				//System.out.print(mat[i][x]);
			//}
			//System.out.println("\n");
		//}
		
		//getWinner();

		toString();


	}

	public char getWinner()
	{
		//Horizontal test
		char winner = ' ';
		//System.out.println("winner is currently " + winner + " test 1");
		char curChar = ' ';
		for (int y = 0; y < mat.length; y++) {
			boolean winnerwinnerchickendinner = true;
			char[] tempArray = new char[3];
			for (int n = 0; n < tempArray.length; n++) {
				//System.out.println(mat[y][n] + " ");
				tempArray[n] = mat[y][n];
			}
			//System.out.println("\n");
			//System.out.println("Testing for " + curChar + " horizontally");
			curChar = tempArray[0];
			for (int i = 0; i < tempArray.length; i++) {
				if (curChar != tempArray[i]) {
					winnerwinnerchickendinner = false;
					break;
				}
			}
			
			if (winnerwinnerchickendinner == true) {
				//System.out.println("Winner is " + curChar + " horizontally changing winner...");
				winStyle = 0;
				winner = curChar;
				return winner;
			}
			
			
		}
		
		//Vertical test
		winner = ' ';
		curChar = ' ';
		for (int x = 0; x < mat.length; x++) {
			boolean winnerwinnerchickendinner = true;
			char[] tempArray = new char[3];
			for (int n = 0; n < tempArray.length; n++) {
				//System.out.println(mat[n][x] + " ");
				tempArray[n] = mat[n][x];
			}
			
			//System.out.println("\n");
			//System.out.println("Testing for " + curChar + " horizontally");
			curChar = tempArray[0];
			for (int i = 0; i < tempArray.length; i++) {
				if (curChar != tempArray[i]) {
					winnerwinnerchickendinner = false;
					break;
				}
			}
			
			if (winnerwinnerchickendinner == true) {
				//System.out.println("Winner is " + curChar + " vertically");
				winStyle = 1;
				winner = curChar;
				return winner;
			}
			
			
		}
		
		//Diagonal tests
		winner = ' ';
		//System.out.println("Winner is " + winner + " at test 3");
		curChar = ' ';
		boolean winnerwinnerchickendinner = true;
		char[] tempArray = new char[3];
		for (int i = 0; i < mat.length; i++) {
			tempArray[i] = mat[i][i];
		}
		
		curChar = tempArray[0];
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] != curChar) {
				winnerwinnerchickendinner = false;
				break;
			}
		}
		
		if (winnerwinnerchickendinner == true) {
			//System.out.println("Winner is " + curChar + " Diagonally");
			winStyle = 3;
			winner = curChar;
			return winner;
		}
		winnerwinnerchickendinner = true;
		for (int i = 0; i < mat.length; i++) {
			tempArray[i] = mat[2 - i][i];
		}
		
		curChar = tempArray[0];
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] != curChar) {
				winnerwinnerchickendinner = false;
				break;
			}
		}
		
		if (winnerwinnerchickendinner == true) {
			//System.out.println("Winner is " + curChar + " Diagonaly");
			winner = curChar;
			winStyle = 2;
			return winner;
		}
	


		return winner;







		//return "";
	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i < mat.length; i++) {
			for (int x = 0; x < mat.length; x++) {
				output += mat[i][x];
			}
			output += "\n";
		}

		char winner = getWinner();
		//System.out.println(winner);
		if (winner != ' ') {
			output += "Winner is " + winner + " " + winStyles[winStyle];
		}
		
		else {
			output += "tie!";
		}





		return output+"\n\n";
	}
}