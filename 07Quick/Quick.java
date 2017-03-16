public class Quick{
public static int part(int[] data, int start, int end){
//-Choose a random element to be a pivot, and partition the array around it. 
//-Only partition the elements from start to end inclusive.
//-When done returns the index of the final position of the pivot element.      
//    (Should be from start to end inclusive)

	int number = 0;
	int start1 = start;
	int end1 = end;
	int random = (int)(Math.random() * ((end - start) + 1));
	number = data[start + random];
	swap(data, end1, start + random);	
	end--;

	while (start < end){
	    if (data[start] >= number){
		swap(data, start, end);
		end--;
	    }

	    if (data[start] < number){
		start++;
	    }
	}

	int swap = start;

	if (data[start] >= number){
	    swap(data, end1, start);
	}
	if (data[start] < number){
	    swap(data, end1, start + 1);
	    swap++;
	}
	for (int index = start1; index < end1; index++){
	    if (data[index] == number){
		swap(data, index, swap);
		swap++;
    }
	}
return;
//add result
}

	private static void swap(int[]data, int a, int b){
	int temp = data[a];
	data[a] = data[b];
	data[b] = temp;
}
}



