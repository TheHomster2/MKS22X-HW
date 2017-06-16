import java.util.*;

public class Quick{
public static int [] part(int[] data, int start, int end){
//-Choose a random element to be a pivot, and partition the array around it. 
//-Only partition the elements from start to end inclusive.
//-When done returns the index of the final position of the pivot element.      
//    (Should be from start to end inclusive)

	int random = start + (int)(Math.random() * (end - start + 1));
	int pivot = data[random];
	swap(data, pivot, end);
	int lt = start;
	int i = start + 1;
	int gt = end;
	int[] temp = new int [2];

	while(i <= gt){
		if (data[i] == pivot){
			i++;
		}

		else if (data[i] < pivot){
			swap(data, i, lt);
			lt++;
			i++;
		}

		else{
			swap(data, i, gt);
			gt--;
		}
	}
		temp[0] = lt;
		temp[1] = gt;

		return temp;
}

	/*
	int start1 = start;
	while(start < end){
	if (data[start] >= pivot){
		swap(data, start, end);
		end--;
	}
	if (data[start] < pivot){
		swap(data, end, start + 1);
		start++;
		}
	}
	//for those larger numbers in the beginning
	if (data[start] >= pivot){
		swap(data, end, start);
	}
	if (data[start] < pivot){
		swap(data, end, start + 1);
		start1++;
	}
	for(int index = start; index < end; index++){
		if (data[index] < pivot){
			swap(data, start1, index);
			start1++;
		}
	}
	swap(data, end, start1);
	return start1;
	*/

	/*
	for(int index = start; index < end; index++){
		if (data[index] < pivot){
			swap(data, lt, index);
			lt++;
		}
	}
*/

	public static void swap(int[] data, int a, int b){
	int temp = data[a];
	data[a] = data[b];
	data[b] = temp;
}

	public static int quickselect(int[] data, int k){
		return quickselectH(data, 0, data.length - 1, k);
	}

	private static int quickselectH(int[] data, int k, int start, int end){
		int [] index = part(data, start, end);

		if (k == index[0]){
			return data[k];
		}
		if (k < index[0]){
			return quickselectH(data, k, start, index[0]);
		}
		else{
			return quickselectH(data, k, index[0], end);
		}
	}

	public static void quicksort(int[] data){
		quicksortH(data, 0, data.length - 1);
	}

	public static void quicksortH(int[] data, int start, int end){
		if (start + 1 < end){
			int [] index = part(data, start, end);
			quicksortH(data, start, index[0]);
			quicksortH(data, index[1], end);
		}
	}

	public static String toString(int[] data){
		String result = "[";
		for (int index = 0; index < data.length; index++){
			result += data[index] + " ";
		}
		result += "]";
		return result;
	}

	public static void main(String[] args){
    }
}
