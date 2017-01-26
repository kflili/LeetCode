import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class PrintFreqHashMapDemo {
    
    private static void printFreq(char[] str) {
        
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (freqMap.containsKey(str[i])) {
                freqMap.put(str[i], freqMap.get(str[i]) + 1);
            } else {
                freqMap.put(str[i], 1);
            }
        }
        
        // iteration of Map
//        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
//            System.out.println("[" + (char)entry.getKey() + "] : " + 
//                               entry.getValue());
//        }
        
        // alternative iteration of Map
        Iterator<Map.Entry<Character, Integer>> iterator = 
            freqMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = 
                iterator.next();
            System.out.println("[" + (char)entry.getKey() + "] : " + 
                               entry.getValue());
        }
            
    }
    
    public static void main(String[] args) {
        char[] str = "He*4#$##!!".toCharArray();
        printFreq(str);
    }
}        