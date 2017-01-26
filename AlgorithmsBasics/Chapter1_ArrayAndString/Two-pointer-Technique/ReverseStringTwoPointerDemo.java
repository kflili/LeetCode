public class ReverseStringTwoPointerDemo {

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    private static void reverse(char[] str) {
        int i = 0, j = str.length - 1;
        while (i < j) {
            swap(str,i++,j--);
        }
    }

    private static void display(char[] str) {
        for (char c : str) {
            System.out.print(c);
        }
        System.out.println();
    }

 
    public static void main(String[] args) {
        char[] str = "Hello world!".toCharArray();
        System.out.println("The origin String:");
        display(str);
        reverse(str);
        System.out.println("The reversed String:");
        display(str);
    }
}