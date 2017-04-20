import java.util.*;
import java.io.*;

public class MyLinkedList implements Iterator<Integer>{

	private class LNode{
		Lnode next, prev;
		int value;

		public LNode(int value){
			next = null;
			prev = null;
			this.value = value;
		}

		public String toString(){
			return value + "";
		}
	}

	LNode start, tail;
	int size;

	public MyLinkedList(){
		start = null;
		tail = null;
		size = 0;
	}

	public int size(){
		return size;
	}

	public boolean add(int value){
		LNode index = new LNode(value);
		if (size < 1){
		start = index;
		tail = index;
		}

		else if (size == 1) {
	    start.next = n;
	    index.prev = start;
	    tail = index;
	}
	else {
	    tail.next = index;
	    index.prev = tail;
	    tail = index;
	}
	size++;
	return true;
	}

	public void add(int index, int value){
		if (index < 0 || index >= size()){
		throw new IndexOutOfBoundsException();
		}
		LNode input = new LNode(value);
		LNode current = start;
		if (index == size()){
		add(value);
		}
		for (int track = 0; track < index - 1; track++){
			current = current.next;
			}
		input.next = current.next;
		input.prev = current;
		current.next = input;
		current.next.prev = input;
		size++;
	}

	private LNode getNthNode(int n){
		LNode current = start;
		for(int index = 0; index < n; index++){
			current = current.next;
		}
		return current;
	}

	private void addAfter(LNode location, LNode toBeAdded){
		location.next = toBeAdded;
		toBeAdded.prev = location;
		toBeAdded.next = location.next;
		toBeAdded.next.prev = toBeAdded;
	}

	public int remove(int index){
		LNode target = getNthNode(index);
		remove(target);
		size--;
		return target.value;
	}

	private void remove(LNode target){
		if (target == start) {
	    start = target.next;
	}
	else if (target == tail) {
	    tail = target.prev;
	}
	else {
	    target.prev.next = target.next;
	    target.next.prev = target.prev;
		}
    }

    public String toString(){
    	String result = "[";
        LNode current = start;
        while(current != null){
            result += current.value;
            if(current.next != null){
                result +=", ";
            }
            current = current.next;
        }
        return result + "]";
    }

	public int get(int index){
		if (index < 0 || index >= size()){
			throw new IndexOutOfBoundsException();
		}
		return getNthNode(index).value;
		}

	public int set(int index, int value){
		if (index < 0 || index >= size()){
			throw new IndexOutOfBoundsException();
		}
		LNode current = getNthNode(index);
		int retain = current.value;	
		current.value = value;
		return retain;
	}

	public int indexOf(int value){
		LNode current = start;
		int index =0;
		while(current.next != null){
			if (current.value == value){
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}


		



















/*

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
	index = new LNode(value);
	}
	else{
		LNode current = index;
		for(int i = 0; i < index; i++){
			current = current.next();
		}
	current.setNext(current.next());
	}	
	size++;
}
	public int size(){
	return size;
}

	public String toString(){}

	public int get(int index){
	if(index < 0 || index > size()){
		throw new IndexOutOfBoundsException();
	}
	LNode current = index;
	for(int i = current; i < index; i++){
		return current.next;
	}
	return current.value();
}


	public int set(int index, int newValue){
	if(index < 0 || index > size()){
		throw new IndexOutOfBoundsException();
	}
	int counter = 0;
	while(start.hasNext()){
		counter++;
		if (counter == index){
		set(newValue);
		}
	}
}	
	public int remove(int index){
		if(index < 0 || index > size()){
		throw new IndexOutOfBoundsException();
	}
	
		
		
}

	public int indexOf(int value){
		int index = new LNode (value);
		LNode current = index;
		for (int i = 0; i < index; i++){
		while (current != null){
			if (current.equals(value)){
				return value;
			}
			current = current.next;
		else{
		return -1;
			}	
}
}
*/
