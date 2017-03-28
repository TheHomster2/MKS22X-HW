public class Merge{

	public static void mergesort(int[] ary){
		ary = mergesortH(ary);
	}

	public static void mergesortH(int[] ary){
		if(ary.length <= 1){
			return ary;
		}

		int [] left = new int [ary.length / 2];
		int [] right = new int[ary.length - left.length];
		for(int index = 0; index < ary.length; index++){
			if(index < left.length){
				left[index] = ary[index];
			}
			else{
				right[index - left.length] = data[index];
			}
		}

		mergesortH(left);
		mergesortH(right);
		merge(left, right, ary);
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
