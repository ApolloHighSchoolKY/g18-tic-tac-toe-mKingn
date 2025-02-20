//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		int loc=0;
		for(int row=0; row<3; row++)
			for(int col=0; col<3; col++)
			{
				mat[row][col] = game.charAt(loc);
				loc++;
			}



	}

	public String getWinner()
	{
		//horizontals
		if(mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2])return mat[0][0] + "Wins by top horizontal"; 

		else if(mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2])return mat[1][0] + "Wins by middle horizontal"; 

		else if(mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2])return mat[2][0] + "Wins by bottom horizontal"; 

		//collums
		else if(mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0])return mat[0][0] + "Wins by left collum"; 

		else if(mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1])return mat[0][1] + "Wins by middle collum";

		else if(mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2])return mat[0][2] + "Wins by right collum";

		//diagnals
		else if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])return mat[0][0] + "Wins by left Diagnal";

		else if(mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0])return mat[0][0] + "Wins by right diagnal";

		else return "cat got the game";











		
	}

	public String toString()
	{
		String output="";
		for(int row=0; row<3; row++)
			{		
				for(int col=0; col<3; col++)
				{	
					output = output + mat[row][col]; 
				}	
				 output = output+"\n";
				
			}





		return output+"\n\n";
	}
}