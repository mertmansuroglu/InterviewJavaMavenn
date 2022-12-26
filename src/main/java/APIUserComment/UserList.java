package APIUserComment;

import java.util.ArrayList;

public class UserList {

    ArrayList<User> userList;

    @Override
    public String toString(){
    String complex = null;
       for(int i=0;i<userList.size();i++){
           complex+= userList.toString();
       }
       return complex;
    }
    User getUser(int id){
      return  userList.get(id);
    }

}
