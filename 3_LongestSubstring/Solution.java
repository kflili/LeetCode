import java.util.*;
public class Solution { 
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int fastIndex = 0, slowIndex = 0;
        while (fastIndex < s.length()) {
            char c = s.charAt(fastIndex);
            if (map.containsKey(c)) {
                slowIndex = Math.max(slowIndex, map.get(c) + 1);
            }
            map.put(c, fastIndex);
            maxLen = Math.max(maxLen, fastIndex - slowIndex + 1);
            ++fastIndex;            
        }        
        return maxLen;  
    } 

    public static void main(String[] args) {
     
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        s = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));                   
        s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
        
    }
}