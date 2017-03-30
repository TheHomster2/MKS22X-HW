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
	return false;
	}
	

	public void add(int index, int value){
	if(index < 0 || index > size()){
		throw new IndexOutOfBoundsException();
	}
	if(index == size()){
	add(value);
	return;
}		
	if(index == 0){
	index == new LNode(value);
	}
	else{
		LNode current = index;
		for(int i = 0; i < index; i++){
			current = current.Next();
		}
	current.setNext(current.Next());
	}	
	size++;
}
	public int size(){
	return size;
}

	public String toString(){}

	public int get(int index){}

	public int set(int index, int newValue){}	
}
