package palindrome;

public class Palindrome {
    public static boolean palindrome(int number) {
        char[] ch = String.valueOf(number).toCharArray();
        char[] newCh = new char[ch.length];
        int b = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            newCh[b] = ch[i];
            b++;
        }
        int reverse = Integer.parseInt(String.valueOf(newCh));
        return reverse == number;
    }

    public static boolean testAlternative(int num) {
        int yedek = num;
        int rev = 0;

        while (num != 0) {
            int n = num % 10;
            rev = rev * 10 + n;
            num = num / 10;

        }
        return yedek == rev;
    }
}
