package warmUpQuestions;

public class PrintName1000TimeWithoutLoop {
    public static void main(String[] args) {
        String name = "mert";
        String s = "i";
        s = s.replaceAll("i", "iiiiiiiiii");
        s = s.replaceAll("i", "iiiiiiiiii");
        s = s.replaceAll("i", "iiiiiiiiii");
        s = s.replaceAll("i", name + "\n");
        System.out.println(s);


    }
}
