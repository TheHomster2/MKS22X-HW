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

}

	private int[][] pasture;
	private int time;
	private int 
	



	public int silver(String filename){
		File text = new File(filename);
		try{
			Scanner inf = new Scanner(file);
		}
	}



