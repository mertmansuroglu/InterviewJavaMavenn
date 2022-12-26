package jsonReadOrder;

import com.jayway.jsonpath.JsonPath;
import jsonReadAndParse.TestCaseItem;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonParse {

    static String jsonFileName = System.getProperty("user.dir") + "\\src\\main\\java\\jsonReadOrder\\s.json";
    public static void main(String[] args) throws IOException {
        ArrayList<User> list= jsonPars(jsonFileName);
        print(list);
    }
    public static void print(ArrayList<User> list){
        for(int x=0;x<list.size();x++){
            System.out.println("///////////////////////////////////");
            System.out.println("User id: "+list.get(x).userID);
            System.out.println("User Name: "+list.get(x).userName);
            System.out.println("User Pasword: "+list.get(x).passsword);
            int o=1;
            for(int c=0;c<list.get(x).orderList.size();c++){

                System.out.println("Order:" + (o++) +" ,Order Id: "+list.get(x).orderList.get(c).OrderId+",Order details: "+list.get(x).orderList.get(c).OrderDetails+" ,Order Fees:"+list.get(x).orderList.get(c).OrderFees );
            }
            System.out.println("Total fees: "+list.get(x).totalFees);
        }
    }
    public static ArrayList<User> jsonPars(String jsonData) throws IOException {
        JSONParser jsonParser = new JSONParser();

        ArrayList<User> userArrayList = new ArrayList<>();
        ArrayList<Order> orderArrayList = new ArrayList<>();
        try (FileReader reader = new FileReader(jsonData)) {
            Object obj = jsonParser.parse(reader);
            JSONArray testCaseList = (JSONArray) obj;
            JSONArray arrUsers = JsonPath.parse(testCaseList).read("$[0].Users");
            JSONArray arrOrder = JsonPath.parse(testCaseList).read("$[1].Orders");
            userArrayList = getUserList(testCaseList,arrUsers);
            orderArrayList = getOrderList(testCaseList,arrOrder);
            fillUserOrders(userArrayList,orderArrayList);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return userArrayList;
    }

    private static void fillUserOrders(ArrayList<User> userArrayList, ArrayList<Order> orderArrayList) {
        int totalFee=0;
        for(int i=0;i<userArrayList.size();i++){
            ArrayList<Order> newOne= new ArrayList<>();
            for(int b=0;b<orderArrayList.size();b++){
                if(userArrayList.get(i).userID.equalsIgnoreCase(orderArrayList.get(b).userId)){
                    Order order= new Order();
                    order.OrderDetails=orderArrayList.get(b).OrderDetails;
                    order.userId= userArrayList.get(i).userID;
                    order.OrderFees= orderArrayList.get(b).OrderFees;
                    order.OrderId= orderArrayList.get(b).OrderId;
                    totalFee+=orderArrayList.get(b).OrderFees;
                    newOne.add(order);
                }
                userArrayList.get(i).totalFees=totalFee;
                userArrayList.get(i).orderList=newOne;
            }
        }
    }
    private static ArrayList<User> getUserList(JSONArray testCaseList,JSONArray arrUsers) {
        ArrayList<User> userArrayListt = new ArrayList<>();
        for (int i = 0; i < arrUsers.size(); i++)
            {
                User testCaseItem = new User();
                String userID=String.format("$[0].Users[%d].userId",i).toString();
                String password=String.format("$[0].Users[%d].password",i).toString();
                String userName=String.format("$[0].Users[%d].username",i).toString();
                testCaseItem.userID = JsonPath.parse(testCaseList).read(userID).toString();
                testCaseItem.passsword = JsonPath.parse(testCaseList).read(password).toString();
                testCaseItem.userName = JsonPath.parse(testCaseList).read(userName).toString();
//                testCaseItem.userID=   JsonPath.parse(testCaseList).read("$[0].Users[\""+(i)+"\"].userId").toString();
                userArrayListt.add(testCaseItem);
            }
            return userArrayListt;
    }

    private static ArrayList<Order> getOrderList(JSONArray testCaseList,JSONArray arrOrder) {
        ArrayList<Order> orderArrayListt = new ArrayList<>();
        for(int a=0;a<arrOrder.size();a++){
            Order testCaseItemO = new Order();
            String orderId=String.format("$[1].Orders[%d].orderId",a).toString();
            String userId=String.format("$[1].Orders[%d].UserId",a).toString();
            String orderDetails=String.format("$[1].Orders[%d].orderDetails",a).toString();
            String orderFee=String.format("$[1].Orders[%d].OrderFees",a).toString();
            testCaseItemO.OrderId= Integer.parseInt(JsonPath.parse(testCaseList).read(orderId).toString());
            testCaseItemO.userId=JsonPath.parse(testCaseList).read(userId).toString();
            testCaseItemO.OrderDetails=JsonPath.parse(testCaseList).read(orderDetails).toString();
            testCaseItemO.OrderFees= Integer.parseInt(JsonPath.parse(testCaseList).read(orderFee).toString().substring(0,3).trim());
            orderArrayListt.add(testCaseItemO);
        }
        return orderArrayListt;
    }




}
