package ArraySort;

public class arraySort {

	public static final int ARRAY_SIZE = 14;
	private static int sorted[] = new int[ARRAY_SIZE];
	
	public static void merge(int[] a, int lo, int mid, int hi)
	{ // Merge a[lo..mid] with a[mid+1..hi].
		int i = lo, j = mid+1;
		for (int k = lo; k <= hi; k++) // Copy a[lo..hi] to aux[lo..hi].
			sorted[k] = a[k];
		for (int k = lo; k <= hi; k++) // Merge back to a[lo..hi].
			if (i > mid) 
				a[k] = sorted[j++];
			else if (j > hi ) 
				a[k] = sorted[i++];
			else if (less(sorted[j], sorted[i])) 
				a[k] = sorted[j++];
			else 
				a[k] = sorted[i++];
	}

	private static boolean less(int v, int w)
	 { return Integer.compare(v, w) < 0; }
	
	private static void sort(int[] a, int lo, int hi)
	{ 
		if (hi <= lo) return;
		int mid = lo + (hi - lo)/2;
		sort(a, lo, mid); // Sort left half.
		sort(a, mid+1, hi); // Sort right half.
		merge(a, lo, mid, hi); // Merge results (code on page 271).
		//print(a);
	} 
	
	private static void print(int[] a) {
		System.out.print("[");
		System.out.print(a[0]);
		for(int i = 1; i < a.length; i++)
	    {
			System.out.print(", " + a[i]);
	    }
		System.out.println("]");
	}
	
	public static void main(String[] args)
	{
		int[] array = new int[ARRAY_SIZE];
	  
		for(int i = 0; i < array.length; i++)
	    {
			array[i] = (int)(Math.random()*100);	
	    }
		System.out.println("Array ");
	    print(array);
	  
	    sort(array, 0, ARRAY_SIZE-1);
	    System.out.println("sorted ");
		print(array);
	}
}
