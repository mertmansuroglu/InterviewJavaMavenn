package maximumWordCountInTextFile;

import org.junit.jupiter.api.Test;

import static maximumWordCountInTextFile.MaximumWordCount.findMaxWord;

public class MaximumWordTest {

    @Test
    public void test() {
        String projectDir = System.getProperty("user.dir");
        String FileName = projectDir + "\\src\\main\\java\\maximumWordCountInTextFile\\word.txt";
        findMaxWord(FileName);
    }
}
