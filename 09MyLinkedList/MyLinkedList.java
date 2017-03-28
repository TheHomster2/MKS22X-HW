public class MyLinkedList{

	public LinkedList(){

	private LNode start;
	private int size;

	public boolean add(int value){
	LNode index = new LNode(value);
	if (start == null){
		start = index;
}
	LNode current = start;
		while (current.hasNext() != null){
			current = current.next();
			size++
		}

	}
}	
	public int size(){
	return size;
}

	public String toString(){}

	public int get(int index){}

	public int set(int index, int newValue){}	
}
