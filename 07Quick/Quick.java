public class Quick{
public static int part(int[] data, int start, int end){
//-Choose a random element to be a pivot, and partition the array around it. 
//-Only partition the elements from start to end inclusive.
//-When done returns the index of the final position of the pivot element.      
//    (Should be from start to end inclusive)
	
	int pivot = Math.random() * data[start] - 1;
	int start1 = start - 1;
	int end1 = end + 1;
	if (end >= start){
	for(int left = 0; data[left] < pivot; left++){
		for(int right = 0; data[right] > pivot; right--){
	if(data[left] < data[right]){
		swap(left, right); 
	}
	return right;
	part(data, positions[1], right);
	part(data, left, positions[0]);
    }
private void swap(int a, int b){
	data[a] = data[b];
	data[b] = data[a];
}



