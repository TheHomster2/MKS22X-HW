	public class MazeSolver{

	private Maze board;
    private Frontier front;
    private boolean animate;
    
	public MazeSolver(String filename){
	this(filename, false)
}

	public MazeSolver(String filename, boolean animate){
	board = new Maze(filename);
	this.animate = animate;	
}

	public void solve(){
	solve(1);
}
	//#bless Laura Goon for helping wih with this and letting me use her code
	public void solve(int style){
	Location current;
	boolean aStar = true;

	if (style == 0){
	frontier = new StackFrontier();	
	}//DFS

	else if (style == 1){
	frontier = new QueueFrontier();	
	}//BFS

	else if (style == 2){
	frontier = new FrontierPriortyQueue();	
	}//Best First
	
	else if(style == 3){
	frontier = new FrontierPriortyQueue();
	}//A*

    int[] direction = {-1, 1};
	frontier.add(board.getStart());

	while (frontier.size() != 0){
		current  = frontier.next();

      if (animate) {
        System.out.println(board.toString(100));
      }

      if (current.getDistToGoal() == 0) {
        newSearching(current);
        return;
      }
      else {
        board.set(current.getRow(),current.getCol(),'.');
     	 }

 for (int num : direction) {
        int rowStartDist = Math.abs(board.getStart().getRow() - (current.getRow() + num)) + Math.abs(board.getStart().getCol() - current.getCol);
        int rowEndDist = Math.abs(board.getEnd().getRow() - (current.getRow() + num)) + Math.abs(board.getEnd().getCol() - current.getCol());
        int colStartDist = Math.abs(board.getStart().getRow() - current.getRow()) + Math.abs(board.getStart().getCol() - (current.getCol() + num));
        int colEndDist = Math.abs(board.getEnd().getRow() - current.getRow()) + Math.abs(board.getEnd().getCol() - (current.getCol() + num));

        if (board.get(current.getRow() + num, current.getCol()) != '@' && board.get(current.getRow() + num, current.getCol()) != '.' && board.get(current.getRow() + num, current.getCol()) != '#') {
          pioneer.add(new Location(current.getRow() + num, current.getCol(), ncurrent, rowStartDist, rowEndDist, aStar));
          board.set(current.getRow() + num, current.getCol(), '?');
        }
        if (board.get(current.getRow(), cur.getCol() + num) != '@' && board.get(current.getRow(), current.getCol() + num) != '.' && board.get(current.getRow(), current.getCol() + num) != '#') {
          pioneer.add(new Location(curRow, current.getCol() + num, current, colStartDist, colEndDist, aStar));
          board.set(current.getRow(), current.getCol + num, '?');
        }
      }

	}
}

  private void newSearching(Location loc) {
    Location me;
    int row, col;
    row = loc.getRow();
    col = loc.getCol();
    board.set(row,col,'E');
    me = loc.getPrevious();

    while (me.getToStart() > 0) { 
      if (animate) {
        System.out.println(board.toString(50));
      }
      row = me.getRow();
      col = me.getCol();
      board.set(row,col,'@');
      me = me.getPrevious();
    }
    board.set(me.getRow(), me.getCol(), 'S');
    if (animate) {
      System.out.println(board.toString(50));
    }
  }

	public String toString(){
		return board.toString();
	}

	public String toString(int n){
		return board.toString(n);
	}
}





