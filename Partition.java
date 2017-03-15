public class Partition{
int part(int[] data, int start, int end){
	if (left >= right){
	    return;
	}
	part(data, positions[1], right);
	part(data, left, positions[0]);
    }
}
}