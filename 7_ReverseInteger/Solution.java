public class Solution { 
    public static int reverse(int x) {  
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            System.out.println("result: " + result);
            System.out.println("tail: " + tail);
            int newResult = result * 10 + tail;
            // test overflow
            if ((newResult - tail) / 10 != result) return 0;
            result = newResult;
            x = x / 10;           
        }
        return result;
    }
     
    
    public static void main(String[] args) {
        int x = -123000;
        int n = reverse(x);
        System.out.println(n);
        
        
    } 
}