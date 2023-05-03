package gfg;

public class RemoveDuplicateElementFromSortedArray {

	public static void main(String[] args) {
		int[] arr = {12, 24, 24, 24, 45, 45, 52};
		
		int res = remDups(arr);
		System.out.println("Size: "+res);
	}
	
	static int remDups(int[] arr) {
		int[] temp = new int[arr.length];
		temp[0]=arr[0];
		int res = 1;
		
		for(int i=1; i<arr.length; i++) {
			if(temp[res-1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}
		for(int i=0; i<res; i++)
			arr[i] = temp[i];
		
		return res;
	}

}
