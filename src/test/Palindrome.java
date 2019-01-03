package test;


public class Palindrome {
	static String reverse;
    public static boolean isPalindrome(String word) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        word = word.toLowerCase();
        reverse = "";
        for(int i=word.length()-1;i>=0;i--){
            reverse = reverse+word.charAt(i);
        }
        System.out.println(reverse);
        if(word.equals(reverse)){
            return true;
        }else{
            return false;
        }
       // return false;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}