import java.util.Map;
import java.util.TreeMap; 
//How to sort a character by number of occurrences in a String using a Map?
//a=1 c=2 e=3 f=1 k=1 l=2 m=1 o=4 r=1 s=1 t=2 v=1 w=2
class FindOccurrenceSort { 
    static void characterCount(String inputString) 
    { 
        TreeMap<Character, Integer> charCountMap = new TreeMap<Character, Integer>(); 
        char[] strArray = inputString.toCharArray(); 
        for (char c : strArray) { 
            if (charCountMap.containsKey(c)) { 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
                charCountMap.put(c, 1); 
            } 
        } 
        for (Map.Entry entry : charCountMap.entrySet()) { 
            System.out.println(entry.getKey() + "=" + entry.getValue()); 
        } 
    } 

    public static void main(String[] args) 
    { 
        String str = "welcometostackoverflow"; 
        characterCount(str); 
    } 
} 
