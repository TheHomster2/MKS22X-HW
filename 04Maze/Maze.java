import java.util.*;
import java.io.*;

public class Maze{

	private char[][] maze;
	private boolean animate;

	public Maze(String filename){
        File text = new File(filename);
        int row = 1;
        int col = 0;

        try{
        	animate = true;
        Scanner inf = new Scanner(text);
        int lineNumber = 1;

        while(inf.hasNextLine()){
        String line = inf.nextLine();
        row++;
        col = line.length();
   	}
    	maze = new char[row][col];
    	int numRows = 0; 
    	int numCols = 0;
    	Scanner inf2 = new Scanner(text);

    	while (inf2.hasNextLine()){
    			String line = inf2.nextLine();
    			numCols = 0;
    			while (line.length() > 0){
    				maze[numRows][numCols] = line.charAt(0);
    				line = line.substring(1);
    				numCols++;
    			}
    			numRows++;
    	}
	}

	catch(FileNotFoundException e){
		System.out.println("File not found");
	}
}

	private void wait(int millis){
         try {
             Thread.sleep(millis);
         }
         catch (InterruptedException e) {
         }
     }

	public void setAnimate(boolean b){
		animate = b;
	}

	public void clearTerminal(){
	System.out.println("\033[2J\033[1;1H");
	}

	public boolean solve(){
	 int startr=-1,startc=-1;
	 for (int row = 0; row < maze.length; row++){
	 	for (int col = 0; col < maze[0].length; col++){
	 		if(maze[row][col] == 'S'){
	 		startr = row;
	 		startc = col;
	 		}
	 	}
	}
            maze[startr][startc] = ' ';
            return solve(startr,startc);
    }

	private boolean solve(int row, int col){
        if(animate){
            System.out.println("\033[2J\033[1;1H"+this);
            wait(20);
        }
	if(maze[row][col] == 'E'){
		return true;
	}

	if (maze[row][col] == ' '){
		maze[row][col] = '@';
	}

	boolean check = solve(row, col - 1) || solve(row + 1, col) || solve (row, col + 1) || solve(row - 1, col);

	if (check){
		return true;
	}

	else{ 
		maze[row][col] = '.';
	}
        return false;
    }

    public String toString(){
    	String result = "";
    	for(int row = 0; row < maze.length; row++){
    		for(int col = 0; col < maze[0].length; col++){
    			result += maze[row][col];
    		}
    		result += "\n";
    	}
    		return result;
    }
}




