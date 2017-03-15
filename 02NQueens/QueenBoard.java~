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

	private boolean addQueen(int row, int col){
		for(int index = 0; index < board.length; index++){
			board[row][index] = 1;
			board[index][col] = 1;
		for(int r = row; r < board.length; r++){
			if(board[r][col] = 0){
				board[r][col] = "Q";
				board[r++][col] += 1;
		for 
;}
	private boolean removeQueen(int row, int col){

;}
}
