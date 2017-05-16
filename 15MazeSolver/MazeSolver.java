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
}

public Location(int r, int c, Location previous, int distanceToStart, boolean aStar){
	row = r;
	col = c;
	previous = previous;
	distToStart = distanceToStart;
	AStar = aStar;
}

public class FrontierPriortyQueue implements Frontier{
	
}

public class FrontierQueue implements Frontier{}

public class FrontierStack implements Frontier{}

public class MazeSolver{}





