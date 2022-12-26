package jsonReadAndParse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jsonparser {

    public static void main(String[] args) {
        String projectDir = System.getProperty("user.dir");
        String jsonFileName = projectDir + "\\src\\main\\java\\jsonReadAndParse\\uiTestScenarios.json";
        printWay(jsonFileName);

        }
    public static void printWay(String jsonFileName){
        ArrayList<TestCaseItem> jsonpars = jsonPars(jsonFileName);
        for(TestCaseItem testCaseItem:jsonpars){
            System.out.println("index no:"+String.valueOf(testCaseItem.index));
            System.out.println("TestCaseID:"+testCaseItem.testCaseId);
            System.out.println("Description:"+testCaseItem.desc);
         for(int i=0;i<testCaseItem.steps.size();i++){
             Step step= testCaseItem.steps.get(i);
             System.out.println("Step" + (i+1) + " Command==>" + step.command + " locator==> " + step.locator + " Value==>" + step.value);
         }
        }
    }
    public static ArrayList<TestCaseItem> jsonPars(String jsonData) {
        JSONParser jsonParser = new JSONParser();

        ArrayList<TestCaseItem> data = new ArrayList<>();
        try (FileReader reader = new FileReader(jsonData)) {
            Object obj = jsonParser.parse(reader);
            JSONArray testCaseList = (JSONArray) obj;
            testCaseList.forEach(tCase -> {
                TestCaseItem testCaseItem = new TestCaseItem();
                JSONObject testCaseObject = (JSONObject) tCase;
                testCaseItem.index= Integer.parseInt( testCaseObject.get("IndexNo").toString().trim());
                testCaseItem.testCaseId=  testCaseObject.get("TestCaseID").toString();
                testCaseItem.desc=  testCaseObject.get("Description").toString();
                testCaseItem.steps= stepsParse(testCaseObject.get("Steps").toString());
                data.add(testCaseItem);
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static List<Step> stepsParse(String testSteps) {
        List<Step> stepList = new ArrayList<>();
        String[] arraySteps = testSteps.split("::");
        Pattern textEqualValue = Pattern.compile("\\['(.*?)\\']");
        Pattern buttonClickLocator = Pattern.compile("\\((.*?)\\)");
        Pattern locatorName = Pattern.compile("\\((.*?)\\[");

        for (String var : arraySteps) {
            Step stepModel = new Step();
            String command = var.substring(0, var.indexOf('(')).trim();
            if (command.toLowerCase().equalsIgnoreCase("click")) {
                Matcher matcherButton = buttonClickLocator.matcher(var);
                if (matcherButton.find()) {
                    stepModel.command = command;
                    stepModel.locator = matcherButton.group(1);
                }
            } else {
                Matcher matcherText = textEqualValue.matcher(var);
                Matcher matcherLocator = locatorName.matcher(var);
                stepModel.command = command;
                if (matcherText.find()) {
                    stepModel.value = matcherText.group(1);
                }
                if (matcherLocator.find()) {
                    stepModel.locator = matcherLocator.group(1);
                }
            }
            stepList.add(stepModel);
        }
        return stepList;

    }

}

