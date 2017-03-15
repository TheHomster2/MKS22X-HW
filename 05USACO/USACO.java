import java.util.*;
import java.io.*;

public class USACO{

    private int [][] lake;
	private int r;
	private int c;
	private int e;
	private int numMoves;

    public USACO(){};

    public int bronze(String filename){
    Scanner inf = null;
	try{
		File text = new File(filename);
	    inf = new Scanner(text);
	}

	catch(FileNotFoundException f){
	    System.out.println("Invalid filename or path.");
	    System.exit(0);
	}

	    r = inf.nextInt();
	    c = inf.nextInt();
	    e = inf.nextInt();
	    numMoves = inf.nextInt();

	    lake = new int[r][c];

	    for(int row = 0; row < r; r++){
	    	Scanner nextline = new Scanner(inf.nextLine());
		for(int col = 0; col < c; c++){
		    lake[row][col] = nextline.nextInt();
		}
	    }

	    while(inf.hasNextLine()){
	    Scanner lastline = new Scanner(inf.nextLine());
	    int row = lastline.nextInt() - 1;
	    int col = lastline.nextInt() - 1;
	    int depth = lastline.nextInt();
	    int height = stomp(r, c, depth);
		for(int r = row; r < row + 3; r++){
			for(int c = col; c < col + 3; c++){
		    	if(lake[r][c] > height){
					lake[r][c] = height;
		    		}
				}
	   		}
		}
		return volume(e);
}

	public int stomp (int row, int col, int depth){
    	int max = lake[row][col];
    	for (r = row; r < row + 3; r++){
    		for(c = col; c < col + 3; c++){
    			if(lake[r][c] > max - depth){
    				max = lake[r][c];
    			}
    		}
    	}
    	return lake[r][c] = max - depth;
    }

	public int volume (int elevation){
    	int depth = 0;
    	for (int row = 0; r < r; r++){
    		for(int col = 0; c < c; c++){
    			if(lake[row][col] < e){
		    		depth += (e - lake[row][col]);
				}
			}
		}
    		return depth * 72 * 72;
    	}


	private int[][] pasture;
	private int[][] temp; //Help f/ Ahbab
	private int time;
	private int row;
	private int col;
	private int startR;
	private int startC;
	private int endR;
	private int endC;
	
	public int silver(String filename){
	Scanner inf = null;
	try{
		File text = new File(filename);
	    inf = new Scanner(text);
	}

	catch(FileNotFoundException f){
	    System.out.println("Invalid filename or path.");
	    System.exit(0);
	}

	row = inf.nextInt();
	col = inf.nextInt();
	time = inf.nextInt();
	pasture = new int[row][col];
	temp = new int [row][col];
	String result = "";

	for(int r = 0; r < row; r++){
	    result = inf.next();
		for(int c = 0; c < col; c++){
		    if(result.charAt(c) == '.'){
		    	pasture[r][c] = 0;
		    	temp[r][c] = 0;
		    }
		    else{
		    	pasture[r][c] = -1;
		    	temp[r][c] = -1;
		    }
		}
	}

	startR = inf.nextInt() - 1;
	startC = inf.nextInt() - 1;
	endR = inf.nextInt() - 1;
	endC = inf.nextInt() - 1;
	return solve();
}

	private int solve(){
		pasture[startR][startC] = 1;
		int total = 0;
		for(int steps = 0; steps < time; steps++){
			for (int r = 0; row < row; r++){
				for (int c = 0; c < col; c++){
					if(pasture[r][c] != -1){
					if (r > 0 && pasture[r - 1][c] != -1){
						total += pasture[r - 1][c];
					}
					if (r < row - 1 && pasture[r + 1][c] != -1){
						total += pasture[r + 1][c];
					}
					if (c > 0 && pasture[r][c - 1] != -1){
						total += pasture[r][c - 1];
					}
					if (c < col - 1 && pasture[r][c + 1] != -1){
						total += pasture[r][c + 1];
					}
					temp[r][c] += total;
						}
					}
				}
				for(int r = 0; r < row; r++){
					for (int c = 0; c < col; c++){
						pasture[r][c] = temp[r][c];
					}
				}
			}
			return pasture[endR][endC];
		}
}



