public class QueenBoard{
	private int[][] board;
	private int solutionCount;

	public QueenBoard(int size){
		board = new int[size][size];
	}

	public boolean solve(){
		solveH(0);
	}

	private boolean solveH(int col){
		if (col >= board.length){
			return true;
		}
		for(int row = 0; row < board.length; row++){
			if(board[row][col] == 0;){
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

	public boolean addQueen(int row, int col){;}
	public boolean removeQueen(int row, int col){;}
}