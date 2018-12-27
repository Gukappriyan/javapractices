package com.string;

public class CountDulicate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
		String givenStr = "this is my first page";
		int countStr = 0;
		
		for( int i = 0; i< givenStr.length();i++){
			
			if(givenStr.charAt(i) == 'i') {
				countStr++;
			}
		}
		
		System.out.println(countStr);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
