package gfg;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = {15, 42, 8, 23, 12};
		
		int res1 = secondLargest1(arr);
		int res2 = secondLargest2(arr);
		System.out.println("Func1: "+res1);
		System.out.println("Func2: "+res2);
	}
	
	
	static int secondLargest1(int[] arr) {
		int res = -1;
		
		int largest = getLargest(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=arr[largest]) {
				if(res==-1)
					res = i;
				else if(arr[i]>arr[res])
					res = i;
			}
		}
		return res;
	}
	
	static int getLargest(int arr[]) {
		int largest = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[largest])
				largest = i;
		}
		return largest;
	}

	
	static int secondLargest2(int[] arr) {
		int res = -1, largest = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			}else if(arr[i] != arr[largest]) {
				if(res==-1 || arr[i]>arr[res])
					res=i;
			}
		}
		return res;
	}

}
