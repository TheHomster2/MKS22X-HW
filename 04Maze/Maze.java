import.java.util.*;
import.java.io.*;

public class Maze{

	private char[][] maze;
	private boolean animate;

	public Maze(String filename){
		  //instead of a try/catch, you can throw the FileNotFoundException.
        File text = new File(filename);// can be a path"/full/path/to/file.txt" 
        Scanner inf = new Scanner(text);
        int lineNumber = 1;
        while(inf.hasNextLine()){
            String line = inf.nextLine();
            System.out.println(line);
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

            //Initialize starting row and startint col with the location of the S. 

            maze[startr][startc] = ' ';//erases the S, and start solving!
            return solve(startr,startc);
    }

	private boolean solve(int row, int col){
        if(animate){
            System.out.println("\033[2J\033[1;1H"+this);
            wait(20);
        }
	if(maze[row][col] == "S"){
		maze[row][col] = "@"
	return true; 
        //COMPLETE SOLVE

        return false; //so it compiles
    }



