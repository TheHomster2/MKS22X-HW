public class Location implements Comparable<Location>{
    private int row,col;
    private int distToStart;
    private int distToGoal;
    private Location previous;
    private boolean aStar;

    public Location(int r, int c, Location previous , int toStart, int toGoal, boolean aStar){
	row = r;
	col = c;
	this.previous = previous;
	this.distToStart = toStart;
	this.distToGoal = toGoal;
	this.aStar = aStar
    }

    public Location(int r, int c, Location previous , int toStart, int toGoal, boolean aStar){
	row = r;
	col = c;
	this.previous = previous;
	this.distToStart = toStart;
	this.distToGoal = toGoal;
	this.aStar = aStar
    }

    public int getRow() {
    return row;
  }

  public int getCol() {
    return col;
  }

    public Location getPrevious() {
    return previous;
  }

 public int getDistToStart() {
    return distToStart;
  }

  public int getDistToGoal() {
    return distToGoal;
  }

  public boolean getAStar() {
    return aStar;
  }

  public int compareTo(Location other){
  	if (other.getAStar()){
  		return (distToStart + distToGoal) - (other.getDistToStart() + other.getDistToGoal());
  	}
  	else{
  	 return getDistToGoal() - other.getDistToGoal();
  	}
  }
}