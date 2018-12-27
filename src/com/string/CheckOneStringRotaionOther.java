package com.string;
import java.util.Scanner;


public class CheckOneStringRotaionOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Rotation in Java - Write a Program to check if strings are rotations of each other or not
		
		Scanner  scr = new Scanner(System.in);
		System.out.println("Print org string :");
		String org = scr.nextLine();
		
		Scanner scrSec  = new Scanner(System.in);
		System.out.println("Print org second");
		String second = scrSec.nextLine();
		
		if(check(org, second)) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
	}

	public static boolean check(String org, String second) {
		
		if(org.length()!= second.length()) {
			return false;
		}
		String cont = org + org;
		System.out.println(cont);
		
		if(cont.indexOf(second) != -1) {
			return true;
		}
		return false;
	}
}
