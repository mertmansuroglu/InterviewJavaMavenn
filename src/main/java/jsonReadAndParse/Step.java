package jsonReadAndParse;

public class Step {
    String command;
    String locator;
    String value;

    public  String getErrorString(){
        return "The value <"+ value+ "> is not in the element name <"+ locator+ ">";
    }


}
