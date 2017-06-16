import java.util.*;

public class MyDeque{
	private String[] data;
	private int size;
	private int front;
	private int back; 

public MyDeque(){
	data = new String [10];
	size = 0;
	front = 0;
	back = 0;
}

public void addFirst(String s){
	if (s.equals(null)){
		throw new NullPointerException("Deque does not permit null elements");
	}
	if (size == data.length){
		resize();
	}
	if(front 	>= 1) {
	    front --;
	}
	if (front == 0){
		front = data.length - 1;
	}
	data[front] = s;
	size ++;
}

public void addLast(String s){
	if (s.equals(null)){
		throw new NullPointerException("Deque does not permit null elements");
	}
	if (size ==  data.length){
		resize();
	}
	if(back < data.length - 1) {
	    back++;
	}
	else if(back == data.length - 1) {
	    back = 0;
	}
	size++;
	data[back] = s;
    }
		
public String removeFirst(){
	if (size < 1){
		throw new NoSuchElementException();
	}
	String temp = data[front];
	data[front] = null;
	if (front + 1 == data.length){
		front = 0;
	}
	else{
		front++;
	}
	size --;
	return temp;

}

public String removeLast(){
	if (size < 1){
		throw new NoSuchElementException();
	}
	String temp = data[back];
	data[back] = null;
	if(back > 0) {
	    back--;
	    size--;
	    return temp;
	}
	else{
	    back = data.length - 1;
	    size--;
	    return temp;
	}
    }

public String getFirst(){
	if (size < 1){
		throw new NoSuchElementException();
	}
	return data[front];
}

public String getLast(){
	if (size < 1){
		throw new NoSuchElementException();
	}
	return data[back];
}

private void resize(){
	String[] temp = new String [data.length * 2];
	int var = 0;
	int index = front;
	while (var < data.length){
		temp[var] = data[index];
		if (index <= data.length){
			index = 0;	
		}
		temp[var] = data[index];
		var++;
		index++;
		}
		front = 0;
		data = temp;
		back = data.length;
}

public String toString(){
	String result = "[";
	for (int index = 0; index < data.length; index++){
		result += data[index] + ", ";
	}
	result += "]";
	return result;
}

public static void main(String[] args){
}
}
