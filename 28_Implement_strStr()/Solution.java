public class Solution { 
    public static int strStr(String haystack, String needle) { 
        if (haystack == null || needle == null) return -1; 
        if (needle.length() == 0) return 0; 
        if (haystack.length() == 0) return -1; 
        if (haystack.length() < needle.length()) return -1; 
        for (int i = 0; i < haystack.length(); i++) { 
            if (haystack.charAt(i) == needle.charAt(0))
            for (int j = 1; ; j++) {
                    if (j == needle.length()) return i;
                    if (i + j == haystack.length()) return -1;
                    if (haystack.charAt(i + j) != needle.charAt(j)) {  
                        break; 
                    } 
                }                                                  
        }
        return -1;
    } 
    
    // more consise solution 
    public static int strStr2(String haystack, String needle) { 
        if (haystack == null || needle == null) return -1; 
        if (needle.length() == 0) return 0; 
        if (haystack.length() == 0) return -1; 
        if (haystack.length() < needle.length()) return -1; 
        for (int i = 0; ; i++) { 
            for (int j = 0; ; j++) {
                    if (j == needle.length()) return i;
                    if (i + j == haystack.length()) return -1;
                    if (haystack.charAt(i + j) != needle.charAt(j)) break; 
            }                                    
        }       
    } 
    
    
    public static void main(String... args) {
     
        String haystack = "bi", needle = "bii";
        
        System.out.println(strStr(haystack, needle));
        
        
    }
}