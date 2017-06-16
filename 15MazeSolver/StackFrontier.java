import java.util.*

public class StackFrontier implements Frontier{
	private Stack<Location> locations;

	public StackFrontier(){
		locations = new Stack<Location>();
	}

	public void add(Location location){
		locations.push(location);
		return;
	}

	public Location next(){
		return locations.pop();
	}

	public int size(){
		locations.size();
	}
}