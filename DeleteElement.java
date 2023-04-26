package gfg;
import java.util.*;

public class DeleteElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ele = sc.nextInt();
		
		sc.close();
		
		int i;
		
		for(i=0; i<n; i++) {
			if(ele==arr[i])
				break;
		}
		
		for(int j=i; j<n-1; j++) {
			arr[j] = arr[j+1];
		}
		
		System.out.print("Output: ");
		
		for(int j=0; j<n-1; j++) {
			System.out.print(arr[j]+" ");
		}
		
	}

}
