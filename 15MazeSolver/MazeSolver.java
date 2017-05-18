import java.util.*
public interface Frontier{
	public void add(Location);
	public Location next();	
		
}

public class Location implements Comparable<Location>{
	private int row;
	private int col;
	private Location previous;
	private int distToStart;
	private int distToGoal
	private boolean AStar;

	public int compareTo(Location other){
		if(AStar){
			return (distToStart + distToGoal) - (other.distToStart + distToGoal); 	
	}
	else {
	return distToGoal - other.distToGoal;	
	}

	public int getLocation(){

}
}

public Location(int r, int c, Location previous, int distanceToStart, boolean aStar){
	row = r;
	col = c;
	previous = previous;
	distToStart = distanceToStart;
	AStar = aStar;
}

public class FrontierPriortyQueue implements Frontier{
	public void add(Location){}
	public Location next(){}
}

public class FrontierQueue implements Frontier{
	Queue queue = new Queue();	
}

public class FrontierStack implements Frontier{
	Stack stack = new Stack();
}

public class MazeSolver{

	private Maze board;
	public MazeSolver(String filename){
	this(filename, false)
}

	public MazeSolver(String filename, boolean animate){
	File text = new File(filename);
}

	public void solve(){
	
}

	public void solve(int style){
	if (style == 0){
	Frontier frontier = new frontier();	
	}//DFS

	else if (style == 1){
	Frontier frontier = new frontier();	
	}//BFS

	else if (style == 2){
	Frontier frontier = new frontier();	
	}//Best First
	
	else if(style == 3){
	Frontier frontier = new frontier();
	}//A*
}	 

	public String toString(){}
}





