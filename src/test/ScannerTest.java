package test;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter age");
		String line = null;

		while (line == null) {
			line = sc.nextLine();
			try {
				age = Integer.valueOf(line);
				break;

			} catch (NumberFormatException e) {
				System.out.println("Pls enter int");

				line = null;

			}
		}
		System.out.println("Enter salary ");
		double salary = sc.nextDouble();

		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		
		*/
		
		Scanner input = new Scanner(System.in);
		int[]  inputArr = new int[5];
		
		
		for(int i=0; i<inputArr.length;i++) {
			System.out.println("Pls enter int "+i+" :");
			inputArr[i] = input.nextInt();
		}
		
		System.out.println(Arrays.toString(inputArr));

	}

	

}
