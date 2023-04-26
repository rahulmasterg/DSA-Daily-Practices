package gfg;

public class LargestElement {

	public static void main(String[] args) {
		
		int[] arr = {5, 8, 20, 10};
		
		System.out.println(getLargest1(arr));
		System.out.println(getLargest2(arr));
	}
	
	static int getLargest1(int arr[]) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			boolean flag = true;
			for(int j=0; j<n; j++) {
				if(arr[j]>arr[i]) {
					flag = false;
					break;
				}
			}
			if(flag==true)
				return i;
		}
		return -1;
	}
	
	static int getLargest2(int arr[]) {
		
		int res = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr[res])
				res = i;
		}
		return res;
	}

}
