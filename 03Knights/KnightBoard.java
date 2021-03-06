public class KnightBoard{
	
	private int[][] board;

	public KnightBoard(int startingRows,int startingCols){
		board = new int [startingRows][startingCols];
		for (int rows = 0; rows < startingRows; rows++){
			for (int cols = 0; cols < startingCols; cols++){
				board[rows][cols] = 0;
			}
		}
	} 

	public String toString(){
		String result = "";
		for (int row = 0; row < board.length; row++){
			for (int col = 0; col < board[0].length; col++){
				if(board[row][col] < 10){
					result += " " + board[row][col] + " ";
				}
				else{
					result += board[row][col] + " ";
				}
			}
			result += "\n";
		}
		return result;
	}

	public void solve(){
		solveH(0,0,1);
	} 

	private boolean solveH(int row, int col, int level){
	if(row >= board.length || row < 0 || col >= board[0].length || col < 0){
            return false;
        }
        for(int i = 0; i < board.length; i++){
            for(int a = 0; a < board[0].length; a++){
                if(board[i][a] >= level){
                    board[i][a] = 0;
                }
            }
        }
        if(level == board.length*board[0].length + 1){
	    return true;
	}
	else if (board[row][col] > 0){
	    return false;
	}
	else {
	    board[row][col] = level;
	    return (solveH(row + 1, col + 2, level + 1) || solveH(row + 1, col - 2, level + 1) || solveH(row + 2, col + 1, level + 1) || solveH(row + 2, col - 1, level + 1) || solveH(row - 1, col + 2, level + 1) || solveH(row - 1, col - 2, level + 1) || solveH(row - 2, col + 1, level + 1) || solveH(row - 2, col - 1, level + 1));
	}
    }

	public static void main(String[] args){
	KnightBoard knight = new KnightBoard(7, 7);
	knight.solve();
	System.out.println(knight);
    }

}

