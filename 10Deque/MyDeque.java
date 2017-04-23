import java.util.*;

public class MyDeque{
	private String[] data;
	private int size;
	private int front;
	private int back; 
}

public MyDeque(){
	data = new String [10];
	size = 0;
	front = 0;
	back = 0;
}

public void addFirst(String s){
	if (s == null){
		throw new NullPointerException("Deque does not permit null elements");
	}
	if (size ==  data.length){
		resize();
	}
	if (size != 0){
		if (front < 0){
			front = data.length - 1;
		}
		else{
			front -= 1;
		}
		data[front] = s;
		size += 1;
	}
}

public void addLast(String s){
	if (s == null){
		throw new NullPointerException("Deque does not permit null elements");
	}
	if (size ==  data.length){
		resize();
	}
	if (size != 0){
		if (back == data.length - 1){
			back = 0;
		}
		else{
			back -= 1;
		}
		data[back] = s;
		size += 1;
		}
	}
public String removeFirst(){
	if (size < 1){
		throw new NoSuchElementException();
	}
	String temp = data[front];
	if (front + 1 == data.length){
		front = 0;
	}
	else{
		front += 1;
	}
	size -= 1;
	return temp;
}

public String removeLast(){
	if (size < 1){
		throw new NoSuchElementException();
	}
	String temp = data[back];
	if (back > 0){
		back -= 1;
		size -= 1;
		return temp;
	}
	else{
		back = data.length - 1;
		size -= 1;
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

}