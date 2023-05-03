package gfg;

public class SortedElement {

	public static void main(String[] args) {
		int[] arr = {5, 8 , 12, 42};
		
		System.out.println(isSorted(arr));

	}
	/*
	static boolean isSorted(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[i])
					return false;
			}
		}
		return true;
	}
	*/
	
	static boolean isSorted(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	}

}
