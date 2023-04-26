package gfg;
import java.util.*;

public class InsertElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cap = sc.nextInt();
		int n = sc.nextInt();
		
		int[] arr = new int[cap];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ele = sc.nextInt();
		int pos = sc.nextInt();
		
		//int res = fun(arr, n, ele, cap, pos);
		fun(arr, n, ele, pos);
		
		//System.out.println("Result: "+res);
		
		System.out.print("Output: ");
		
		for(int i=0; i<n+1; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}
	/*  //return array size after insert one element
	static int fun(int[] arr, int n, int ele, int cap, int pos) {
		if(n==cap)
			return n;
		
		int idx = pos-1;
		
		for(int i=n-1; i>=idx; i--)
			arr[i+1] = arr[i];
		arr[idx] = ele;
		
		return n+1;
	}
	*/
	
	static void fun(int[] arr, int n, int ele, int pos) {
		int idx = pos-1;
		
		for(int i=n-1; i>=idx; i--)
			arr[i+1] = arr[i];
		
		arr[idx] = ele;
	}

}
