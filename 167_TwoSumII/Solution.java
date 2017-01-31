public class Solution { 
    public static int[] twoSum(int[] num, int tar) { 
        int[] indice = new int[2];
        if (num == null || num.length < 2) return indice;
        int left = 0, right = num.length - 1;
        while (left < right) {
            int v = num[left] + num[right];
            if (v == tar) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                break;
            } else if (v > tar) {
                right--;
            } else {
                left++;
            }  
        }
        return indice;
    } 

    public static void main(String[] args) {
       int[] numbers={2, 7, 11, 15};
       int target=9;
       int[] r = twoSum(numbers, target);
       System.out.println(r[0]);
       System.out.println(r[1]);
    }
}