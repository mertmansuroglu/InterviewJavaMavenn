package APIUserComment;

public class Comment {
    int postId;
    int id;

    String name;

    String email;

    String body;

    @Override
    public String toString(){
        String complex="/Post id :"+postId+"/Comment id:"+id+"/Name:"+name+"/Email"+email+"/Body:"+body;
        return complex;
    }
}
