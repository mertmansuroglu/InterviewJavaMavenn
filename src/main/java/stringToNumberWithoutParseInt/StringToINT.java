package stringToNumberWithoutParseInt;

public class StringToINT {
    public static void main(String[] args) {
        String string = "123";
        int stringI = Integer.parseInt(string);
        char[] arr = string.toCharArray();
        char av = 0;
        for (int i = 0; i < arr.length; i++) {
            av += Character.valueOf(arr[i]);
        }

    }
}
