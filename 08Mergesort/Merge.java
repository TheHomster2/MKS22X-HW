public class Merge{

	public static void mergesort(int[] ary){
		if(ary.length != 1){
		int temp = new int [ary.length / 2];
	}

	public void merge(int[] a, int[] b,int[] destination){
		int lo = 0;
		int hi = 0;
		index = 0;

		while(lo < a.length && hi < b.length){
			if(a[lo] <= b[hi]){
				destination[index] = a[lo];
				lo++;
				index++
			}
			if(b[hi] < a[lo]){
				destination[index] = b[hi];
				hi++;
				index++
			}
		}

		while(lo < a.length){
			for(int index = lo + hi; index < destination.length; index++){
			destination[index] = a[lo];
			lo++;
			}
		}	
		
		while(hi < b.length){
			for(int index = lo + hi; index < destination.length; index++){
			destination[index2] = b[hi];
			hi++;
			}
		}
	}
