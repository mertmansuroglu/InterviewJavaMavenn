package getTotalOfCharLineWord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GetTotalCount {
    public static void main(String[] args) {
        BufferedReader fr = null;
        HashMap<String, Integer> map = new HashMap<>();
        String projectDir = System.getProperty("user.dir");
        String FileName = projectDir + "\\src\\main\\java\\getTotalOfCharLineWord\\word.txt";
        //eger bosluk olarak ayiracaktik splitle
        //buffered reader sectik cunkku readline var
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        List<String> list = new ArrayList<>();
        try {
            fr = new BufferedReader(new FileReader(FileName));
            String currentLine = fr.readLine();
            while (currentLine != null) {
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount += words.length;
                int a = 0;
                for (int i = 0; i < words.length; i++) {
                    charCount += words[i].length();
                }
                currentLine = fr.readLine();
            }

            System.out.println(charCount);
            System.out.println(wordCount);
            System.out.println(lineCount);
            System.out.println();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//        for(int i=0;i<words.length;i++){
//                    charCount=words[i].charAt()
//                }