// Print the frequency of each character appeared in a given String.
// Use HashMap for input consists unicode characters.

import java.util.*;

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

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("[" + (char)(entry.getKey()) + "] = " + entry.getValue()); 

        }
    }

    public static void main(String[] args) {
        char[] str = "*&$!@@@!*".toCharArray();
        printFreq(str);
    }
}

    