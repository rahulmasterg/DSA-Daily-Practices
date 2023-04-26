package gfg;
import java.util.*;

public class InsertElementInDynamicSizeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		
		int ele = sc.nextInt();
		
		arr.add(ele);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		
		sc.close();
	}

}
