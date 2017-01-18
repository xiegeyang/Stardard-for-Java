package com.VectorUser.Geyang;

class Vector{
	private int val = 1;
	
	public boolean isEmpty(){
		if(val == 1){
			return true;
		}else
			return false;
	}
}

public class VectorUser {
	public static void main(String[] args){
		Vector v = new Vector();
		if(v.isEmpty()){
			System.out.println("Vector is empty");
		}
	}
}
