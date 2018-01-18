package com.usa.ttech.student;

public class Mathematics {
	protected int sum;
	int sub;
	
	void addition(int x, int y) {
		sum = x+y;
		System.out.println("sum"+sum);
	}
	
	 int substraction(int x, int y) {
		return sub=x-y;
		System.out.println("sub"+sub);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Mathematics math = new Mathematics();
	
	math.addition(34, 66);
	math.substraction(89, 78);
	
	
	
	}

}
