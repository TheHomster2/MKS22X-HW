import java.util.*;

public class MyHeap{	

private ArrayList<Integer> heap;
private int size;
private int constant;

public MyHeap(){
	heap = new ArrayList<Integer>();
	size = 0;
	heap.add(0);
}

public MyHeap(boolean result){
	if (result){
		constant = 1;
	}
	else{
		constant = -1;
	}
	heap = new ArrayList<Integer>();
	heap.add(0);
}

public void add(Integer s){
	size+=1;
	heap.add(s);
	pushUp(size);
}

public Integer remove(){
	Integer temp = heap.get(size);
	heap.set(1, heap.remove(size));
	size -= 1;
	pushDown(1);
	return temp;
}

public Integer peek(){
	return heap.get(1);
}

private void pushUp(int index){
	if (index == 1){
		return;
	}

	if (size >= 1 && index > 1 && heap.get(index).compareTo(heap.get(index / 2)) < 0){
		return;
	}

	else{
		swap(index, index / 2);
		pushUp(index / 2);
	}
}

private void pushDown(int index){
	if (constant == 1){
		if (index < size && heap.get(index).compareTo(heap.get(2 * index)) < 0){
			swap(index, 2 * index);
			pushDown(2 * index);
		}
	}
	else{
		if (index > 1 && heap.get(index).compareTo(heap.get(2 * index)) > 0){
			swap(index, 2 * index);
			pushDown(2 * index);
		}
	}
}

public void swap(int index, int index2){
	Integer temp = heap.get(index);
	heap.set(index, heap.get(index2));
	heap.set(index2, temp);
}

public int size(){
	return size;
}

 public String toString(){
	String result = "";
	for(int index = 1; index < heap.size(); index++){
	    result += heap.get(index) + ", ";
	}
	return result;
    }

}
