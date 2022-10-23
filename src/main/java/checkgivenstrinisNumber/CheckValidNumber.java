package checkgivenstrinisNumber;

import java.util.regex.Pattern;

public class CheckValidNumber {
    public static void main(String[] args) {
        System.out.println(isValid("mety"));
        System.out.println(isValidPhone("05078435"));
    }

    public static boolean isValid(String s) {
        Pattern pattern = Pattern.compile("[0-99]+");
        Pattern pattern2 = Pattern.compile("\\d+");
        return pattern2.matcher(s).matches();
    }

    public static boolean isValidPhone(String s) {
        Pattern pattern = Pattern.compile("[0-9]{10}");
        return pattern.matcher(s).matches();
    }
}
