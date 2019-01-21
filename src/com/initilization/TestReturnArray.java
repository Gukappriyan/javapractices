package com.initilization;

public class TestReturnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = getDataArray();
		
		for(int i=0;i<=data.length-1;i++) {
			System.out.println(data[i]);
		}
}

	private static int[] getDataArray() {
		// TODO Auto-generated method stub
		return new int[] {5,6,7};
	}

}
