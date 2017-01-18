package com.arrayBounce.Geyang;



public class test {
	static void initArray(int a[], int nItems) {
		for (int i = 0; i < nItems; i++) {
				a[i] = 0;        
		} 
	}
	
	public static void main(String[] args){
		int[] a  = {1, 2, 3};
		initArray(a,5);
	}

}
