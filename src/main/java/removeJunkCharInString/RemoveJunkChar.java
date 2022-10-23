package removeJunkCharInString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveJunkChar {
    public static void main(String[] args) {
        String a = "!#!%@^&$^*U&mert";
        //asagidaki pattern yardimiyla regex uyguladik ve junklar sildik
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(a);
        while (matcher.find()) {
            String result = matcher.group();
            System.out.print(result);
            //asagidaki regex e uyanlari getirir sadece
        }
        //asagida direk replace all dedik ve junklari sildik
        a = a.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("\n" + a);


    }
}
