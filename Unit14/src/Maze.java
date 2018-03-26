//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

   List<Integer> goneOnX = new ArrayList<Integer>();
   List<Integer> goneOnY = new ArrayList<Integer>();
	public Maze()
	{
		maze = new int[0][0];
	}

	public Maze(int size, String line)
	{
		//System.out.println(line);
		
		maze = new int[size][size];
		int curY = 0;
		int curX = 0;
		for (int i = 0; i < line.length(); i++) {
			//System.out.println("character is " + line.charAt(i));
			if ( i % 2 != 0) {
				i++;
				maze[curY][curX] = line.charAt(i);
				maze[curY][curX] -= 48;
				System.out.print(maze[curY][curX]);
				curX++;
			}
			
			else {
				maze[curY][curX] = line.charAt(i);
				maze[curY][curX] -= 48;
				System.out.print(maze[curY][curX]);
				
				curX++;
				i++;
			
			}
			
			//curX++;
			
			if (curX >= size) {
				curX = 0;
				System.out.println("\n");
				curY++;
			}
			
			
		}
		 //System.out.println("maze length is " + maze.length);
		System.out.println(hasExitPath(0,0));

	}

	public boolean hasExitPath(int r, int c)
	{
		if (c == maze.length - 1) {
			return true;
		}
		
		goneOnX.add(r);
		goneOnY.add(c);
		if (maze[r][c] == 1) {
			if (r != maze.length - 1) {
				
				boolean weworked = true;
				for (int i = 0; i < goneOnX.size(); i++) {
					if (goneOnX.get(i) == r + 1 && goneOnY.get(i) == c) {
						//System.out.println("ERROR");
						weworked = false;
						break;
					}
				}
				
				if (weworked) {
					if (maze[r+1][c] == 1 && hasExitPath(r + 1, c) && weworked) {
						return true;
					}
				}
				
			}
			
			if (r != 0) {
				boolean weworked = true;
				for (int i = 0; i < goneOnX.size(); i++) {
					if (goneOnX.get(i) == r - 1 && goneOnY.get(i) == c) {
						//System.out.println("ERROR");
						weworked = false;
						break;
					}
				}
				
				if (weworked) {
					if (maze[r-1][c] == 1 && hasExitPath(r - 1, c) && weworked) {
						return true;
					}
				}
				
			}
			
			if (c != maze.length - 1) {
				boolean weworked = true;
				for (int i = 0; i < goneOnX.size(); i++) {
					if (goneOnX.get(i) == r && goneOnY.get(i) == c + 1) {
						//System.out.println("ERROR");
						weworked = false;
						break;
					}
				}
				
				if (weworked) {
					if (maze[r][c + 1] == 1 && hasExitPath(r, c + 1) && weworked) {
						return true;
					}
				}
				
			}
			
			if (c != 0) {
				boolean weworked = true;
				for (int i = 0; i < goneOnX.size(); i++) {
					if (goneOnX.get(i) == r && goneOnY.get(i) == c - 1) {
						//System.out.println("ERROR");
						weworked = false;
						break;
					}
				}
				
				if (weworked) {
					if (maze[r][c-1] == 1 && hasExitPath(r, c - 1)) {
						return true;
					}
				}
				
			}
			
		}
		
		else {
			return false;
		}
		
		
		
		
				

		return false;
	}

	public String toString()
	{
		String output="";





		return output;
	}
}