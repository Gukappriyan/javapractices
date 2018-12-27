package com.arraya;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {2,6,7};
		int[] array2 = {2,6,8};
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(
				Arrays.copyOf(array1, 4)));

	}

}
