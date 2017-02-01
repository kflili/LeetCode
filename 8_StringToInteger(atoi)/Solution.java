public class Solution { 
    public static int myAtoi(String str) { 
        if (str.isEmpty()) return 0;
        int sign = 1, base = 0, i = 0;
        char[] c = str.toCharArray();
        
        // discards all leading whitespaces
        while (i < c.length && c[i] == ' ') 
            i++; 
        
        // determin the sign of the number
        if (i < c.length && (c[i] == '-' || c[i] == '+')) {
            sign = (c[i++] == '-') ? -1 : 1;
        }
        
        while (i < c.length && c[i] >= '0' && c[i] <= '9') {
            //check for overflow
            if (base > Integer.MAX_VALUE / 10 || 
                (base == Integer.MAX_VALUE / 10 && c[i] - '0' > 7
                     /* or use Integer.MAX_VALUE % 10 */)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            //System.out.println(Integer.MAX_VALUE) gives 2147483647
            //System.out.println(Integer.MIN_VALUE) gives -2147483648
            base = 10 * base + (c[i++] - '0');
        }
        return base * sign;        
    } 
    
    public static void main(String[] args) {
       System.out.println(myAtoi("+ ")); 
    }
}