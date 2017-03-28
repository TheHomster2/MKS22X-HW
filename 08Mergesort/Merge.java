public class Merge{

	public static void mergesort(int[] ary){
		if(ary.length <= 1){
			return;
		}

		int [] left = new int [ary.length / 2];
		int [] right = new int[ary.length - left.length];
		for(int index = 0; index < ary.length; index++){
			if(index < left.length){
				left[index] = ary[index];
			}
			else{
				right[index - left.length] = ary[index];
			}
		}

		mergesort(left);
		mergesort(right);
		merge(left, right, ary);
	}


	public static void merge(int[] a, int[] b,int[] destination){
		int lo = 0;
		int hi = 0;
		int index = 0;

		while(lo < a.length && hi < b.length){
			if(a[lo] <= b[hi]){
				destination[index] = a[lo];
				lo++;
				index++;
			}
			if(b[hi] < a[lo]){
				destination[index] = b[hi];
				hi++;
				index++;
			}
		}

		while(lo < a.length){
			for(int count = lo + hi; count < destination.length; count++){
			destination[count] = a[lo];
			lo++;
			}
		}	

		while(hi < b.length){
			for(int index2 = lo + hi; index2 < destination.length; index2++){
			destination[index2] = b[hi];
			hi++;
			}
		}
	}
}
