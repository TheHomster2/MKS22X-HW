public class Quick{
public static int part(int[] data, int start, int end){
//-Choose a random element to be a pivot, and partition the array around it. 
//-Only partition the elements from start to end inclusive.
//-When done returns the index of the final position of the pivot element.      
//    (Should be from start to end inclusive)

	int random = start + (int)(Math.random() * (end - start + 1));
	int pivot = data[random];
	swap(data, pivot, end);
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

	/*
	for(int index = start; index < end; index++){
		if (data[index] < pivot){
			swap(data, start1, index);
			start1++;
		}
	}

	swap(data, end, start1);
	return start1;
	*/
}
	public static void swap(int[]data, int a, int b){
	int temp = data[a];
	data[a] = data[b];
	data[b] = temp;
}

	public static int quickselect(int[]data, int k){
		return quickselect(data, 0, data.length - 1, k);
	}

	private static int quickselect(int[]data, int k, int start, int end){
		int index = part(data, start, end);

		if (k == index){
			return data[k];
		}
		if (k < index){
			return quickselect(data, k, start, index);
		}
		else{
			return quickselect(data, k, index, end);
		}
	}

	public static int quicksort(int[]data){
		return quicksort(data, 0, data.length - 1);
	}

	public static int quicksort(int[]data, int start, int end){
		if (start >= end){
			int index = part(data, start, end);
			quicksort(data, start, index - 1);
			quicksort(data, index + 1, end);
		}
	}

	public static void main(String[] args){
	int[] data = new int[]{9, 8, 7, 6, 5, 0, 1, 2, 3, 4};
	System.out.println(part(data, 0, data.length - 1));
}

}




