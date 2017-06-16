public class FrontierPriority implements Frontier{
    private PriorityQueue locations;
    private int size;

    public FrontierPriorityQueue(){
	locations = new PriorityQueue();
    }
   
    public void add(Location location){
	locations.add(location);
    }

    public Location next(){
	return locations.remove();
    }

    public int size(){
	return size;
    }

    public boolean hasNext() {
    if(queue.isEmpty()) {
        return false;
    }
    else{
        return true;
    }
    }
}