import java.util.*;

public class QueueFrontier implements Frontier{
	private Queue<Location> locations;

	public QueueFrontier(){
		locations = new LinkedLists<Location>();
	}

	public void add(Location location){
		locations.add(location);
		return;
	}

	public Location next(){
		return locations.remove();
	}

	public int size(){
		locations.size();
	}
}