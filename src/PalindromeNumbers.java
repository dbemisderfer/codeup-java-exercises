package algorithms;

public class PalindromeNumbers {

    public boolean findPalindrome(int num) {

        int t = num;
        System.out.println("t = " + t);
        int s = 0;
        System.out.println("s = " + s);
        while(num > 0) {
            int r = num % 10;
            System.out.println("r = " + r);
            num = num / 10;
            System.out.println("num = " + num);
            s = s * 10 + r;
            System.out.println("s = " + s);
        }
        System.out.println("t = " + t);
        if (t == s) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PalindromeNumbers x = new PalindromeNumbers();
        System.out.println(x.findPalindrome(727));

    }
}
