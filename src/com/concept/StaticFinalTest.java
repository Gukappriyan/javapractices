package com.concept;

public class StaticFinalTest extends StaticFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticFinal sf = new StaticFinal();
		
		System.out.println(StaticFinal.iamStatic);
		System.out.println(sf.iamFinal);
		
		StaticFinal.iamStatic = 9;
		//sf.iamFinal = 9;
		
		System.out.println(StaticFinal.iamStatic);
		

	}

}
