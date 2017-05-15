public interface Frontier{
	public void add(Location);
	public Location next();	
}

public class FrontierPriortyQueue implements Frontier

public class Location implements Comparable<Location>{
	private int row;
	private int col;
	private Location previous;
	private int distanceToStart;
	private boolean aStar;

public Location(int r, int c
}

