package APIUserComment;

import java.util.ArrayList;

public class Post {
    int userId;
    int id;
    String title;

    String body;

    ArrayList<Comment> comments;

    @Override
    public String toString(){
        String complex="/User id :"+userId+"/Post id:"+id+"/Title:"+title+"/Body:"+body;
        return complex;
    }
    Comment getComment(int d){
        return comments.get(d);
    }
    ArrayList<Comment> getComments(){
        return comments;
    }
}
