package com.string;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstStr = "stop";
		String secondStr = "post";

		char[] firstCh = firstStr.toCharArray();
		char[] secondCh = secondStr.toCharArray();
		Arrays.sort(firstCh);
		Arrays.sort(secondCh);

		if (Arrays.equals(firstCh, secondCh)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

		// Second Method

		StringBuilder stBu = new StringBuilder(secondStr);
		for (Character ch : firstCh) {

			int index = stBu.indexOf("" + ch);
			if (index != -1) {
				stBu.deleteCharAt(index);
			} else {
				System.out.println("Not anagram");
				break;
			}

		}
		if (stBu.length() == 0) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
