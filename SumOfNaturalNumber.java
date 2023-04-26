package gfg;

import java.util.*;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Res1: "+fun1(n));
		System.out.println("Res2: "+fun2(n));
		System.out.println("Res3: "+fun3(n));
		sc.close();
	}
	
	static int fun1(int n) {
		return n*(n+1)/2;
	}
	
	static int fun2(int n) {
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum = sum+i;
		}
		return sum;
	}
	
	static int fun3(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				sum++;
			}
		}
		return sum;
	}

}
