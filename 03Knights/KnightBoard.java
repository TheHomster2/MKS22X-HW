public class KnightBoard{
private int[][] board;
private String string="";

	public KnightBoard(int startingRows, int startingCols)
	public String toString(){
	if(
	return string;
	}
	public void solve(){
	return solveH(0,0,0);
	private boolean solveH(int row, int col, int level){
		if (level > board.length * board[row]){
			return true;
		}
		if 
	}
