package com.arraya;

public class FindMissingEleRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 5, -2, 200, 0, 7 };
		int n = arr.length;
		printmissingEl(arr, n);
	}

	public static void printmissingEl(int[] arr, int n) {

		int limit = 10;

		boolean seen[] = new boolean[limit];

		for (int i = 0; i < limit; i++) {

			seen[i] = false;
		}

		for (int i = 0; i < n; i++) {

			if (arr[i] < limit && arr[i] > 0) {
				seen[arr[i]] = true;
			}
		}

//		for (int x = 0; x < seen.length; x++) {
//			System.err.println("Index " + x + " value " + seen[x]);
//		}

		int i = 0;

		while (i < limit) {

			if (seen[i] == false) {

				int j = i + 1;

				while (j < limit && seen[j] == false) {
					j++;
				}

				int p = j - 1;
				System.err.println(i + 1 == j ? i : i + " - " + p);
				i = j;
			} else {
				i++;
			}
		}
	}

}