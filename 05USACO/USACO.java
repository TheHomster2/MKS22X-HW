import java.io.*;
import java.util.*;  

public class USACO{

    private int[][] lake;
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
	    System.exit(1);
	}

		Scanner checkline = new Scanner(inf.nextLine());
		r = Integer.parseInt(checkline.next());
		c = Integer.parseInt(checkline.next());
		e = Integer.parseInt(checkline.next());
		numMoves = Integer.parseInt(checkline.next());

		lake = new int[r][c];

		for(int row = 0; row < r ; row++){
	    	Scanner nextline = new Scanner(inf.nextLine());
	    	for(int col = 0; col < c; col++){
			lake[row][col] = nextline.nextInt();
	    	}
		}

	while(inf.hasNextLine()){
	    Scanner lastLine = new Scanner(inf.nextLine());
	    int row = lastLine.nextInt() - 1;
	    int col = lastLine.nextInt() - 1;
	    int depth = lastLine.nextInt();
	    int height = stomp(row, col, depth);
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

    private int stomp(int row, int col, int depth){
	int max = lake[row][col];
	for(int r = row; r < row + 3; r++){
	    for(int c = col; c < col + 3; c++){
		if (lake[r][c] > max){
		    max = lake[r][c];
			}
	    }
	}
        int result = max - depth;
       	return result;

    }

    private int volume(int elevation){
	int depth = 0;
	for(int row = 0; row < r; row++){
	    for(int col = 0; col < c; col++){
		if(lake[row][col] < e){
		    depth += e - lake[row][col];
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
	    System.exit(1);
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
		for(int steps = 0; steps < time; steps++){
			for (int r = 0; r < row; r++){
				for (int c = 0; c < col; c++){
					int total = 0;
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

	public static void main (String []args){
		/*
		USACO test = new USACO();
		System.out.println(test.bronze("bronze1.txt"));
		System.out.println(test.silver("silver1.txt"));
		*/
}	
}



