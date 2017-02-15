public class QueenBoard{
	private int[][] board;
	private int solutionCount = -1;

	public QueenBoard(int size){
		board = new int[size][size];
	}

	public boolean solve(){
		return solveH(0);
	}

	private boolean solveH(int col){
		if (col >= board.length){
			return true;
		}
		for(int row = 0; row < board.length; row++){
			if(board[row][col] == 0){
				addQueen(row, col);
				if (solveH(col + 1)){
					return true;
				}
				else{
					removeQueen(row, col);
				}
			}
		}
		return false;
	}

	private boolean addQueen(int row, int col){
		if (board[row][col] != 0){
	    return false;
		}
		board[row][col] = 1;
		int index = 1;
		while (col + index < board[row].length){
	    	board[row][col + index]--;
	    	if (row - index >= 0){
				board[row - index][col + index]--;
	    	}
	    	if (row + index < board.length){
				board[row+index][col+index]--;
	    	}
	    index++;
	}
		return true;
    }

	private boolean removeQueen(int row, int col){
		if (board[row][col] != 1){
	    return false;
	}
	board[row][col] = 0;
	int index = 1;
	while (col + index < board[row].length){
	    board[row][col + index]++;
	    if(row - index >= 0){
		board[row - index][col + index]++;
	    }
	    if(row + index < board.length){
		board[row + index][col + index]++;
	    }
	    index++;
	}
	return true;
    }

    //Help f/ Mr. K + Alex S. to keep track of solutionCount as the functions recurse
    public void countSolutions(){
	for(int row = 0; row < board.length; row++){
	    for(int col = 0; col < board.length; col++){
		board[row][col] = 0;
	    }
	}
	solutionCount = 0;
	countH(0);
	    }
    
    private boolean countH(int col){
	if(board.length == 2 || board.length == 3){
	    return false;
	}
	for(int row = 0; row < board.length; row++){
	    if(col >= board.length){
		return true;
	    }
	    if(addQueen(row, col)){
		addQueen(row, col);
		if(countH(col + 1)){
		    solutionCount++;
		    removeQueen(row, col);
		}
		else{
		    removeQueen(row, col);
		}
	    }
	}
	return false;
    }
    
    public int getSolutionCount(){
	return solutionCount;
    }


    public String toString(){
    	String result = "";
	for(int row = 0; row < board.length; row++){
	    for(int col = 0; col < board.length; col++){
		if (board[row][col] == -1){
		    result += "Q ";
		}
		else{
		    result += "_ ";
		}
		if(col == board.length - 1){
		    result += "\n";
		}
	    }
	}
	return result;	    
    }

    public static void main(String[] args){
	QueenBoard board = new QueenBoard(10);
	board.solve();
	System.out.println(board);
	//board.countSolutions();
	System.out.println(board.getSolutionCount());
    }
}
