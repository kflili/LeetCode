public class PrintFreqArrayDemo2 {
    
    private static void printFreq(char[] str) {
        
        int[] freq = new int[26];
        for (int i = 0; i < str.length; i++) {
            freq[str[i] - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println("[" + (char)(i + 'a') + "] : " + freq[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        char[] str = "helloworld".toCharArray();
        printFreq(str);
    }
}