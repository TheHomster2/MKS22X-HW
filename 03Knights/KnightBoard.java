public class KnightBoard{
private int[][] board;
private String string="";

	public KnightBoard(int startingRows, int startingCols)

	public String toString(){
		String result = "";
	for(int row = 0; row < board.length; row++){
		for(int col = 0; col < board.length; col++){
			if(board[row][col] < 10){
				result+= board[row][col];
			}
			else {
				result += board[row][col] + " ";
				}
	return string;
	}

	public void solve(){
	return solveH(0,0,0);
	}

	private boolean solveH(int row, int col, int level){
		if (level > board.length * board[row]){
			return true;
		}
		if (board[row][col] != 0){
			return false;
		}
		if (board[row + 1][col] 
	}
