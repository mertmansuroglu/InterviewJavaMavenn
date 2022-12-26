package APIUserComment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User {
    int id;
    String name;
    String username;

    String email;

    HashMap<String,Object> address;

    String phone;
    String website;

    HashMap<String,String> company;

   ArrayList<Post> posts;

   @Override
   public String toString(){
       String complex="User id:"+id+" /User name:"+name+"/Username:"+username+"/User email"+email+"/Phone number:"+phone+"/Website:"+website+"/Adress:\n";
       for (Map.Entry<String, Object> set : address.entrySet()) {
           complex+=set.getKey()+" = "+set.getValue();
           // Printing all elements of a Map
       }
       return complex;
   }
      public  Post getPost(int d){
       return  posts.get(d);
   }
    public ArrayList<Post> getPosts(){
        return  posts;
    }
}
