/*
 * It creates a size 26 int arrays as buckets for each letter counts. 
 * It increments the bucket value with String s and decrement with string t. 
 * So if they are anagrams, all buckets should remain with initial value(0).
 * So just checking that and return
 */

public class Solution {
    
    // solution-1: beat 86%
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        for (char c : t.toCharArray()) freq[c - 'a']--;
        for (int i : freq) if (i != 0) return false;
        return true;
    }
    
    // solution-2: add null and String lenght checking, beat 96.22%
    public boolean isAnagram2(String s, String t) {
        if (s == null) return t == null;
        if (t == null || s.length() != t.length()) return false; 
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        for (char c : t.toCharArray()) freq[c - 'a']--;
        for (int i : freq) if (i != 0) return false;
        return true;
    }
    
    // solution-3: use HashMap for unicode characters inputs
    public boolean isAnagram3(String s, String t) {
        if (s == null) return t == null; 
        if (t == null || s.length() != t.length()) return false;
        
        Map<Character, Integer> freq = new HashMap<>();
        for (char c:s.toCharArray()) {
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }
        
        for (char c:t.toCharArray()) {
            if (!freq.containsKey(c) || (freq.get(c) == 0)) return false;
            freq.put(c, freq.get(c) - 1);
        }
        
        return true;
    }  
}