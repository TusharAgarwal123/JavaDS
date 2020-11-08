package com.rec;

public class AscendingOrder {

	public static void main(String[] args) {
		order(6);
		

	}
	static void order(int n) {
		if(n==0) {
			return;
		}
		
		System.out.print(n+" ");
		order(n-1);
	}

}
