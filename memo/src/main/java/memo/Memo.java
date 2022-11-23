package memo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Memo {

    String id;
    private String name;
    private int password;
    String post;
    String date = setDate();
    public Memo(String name, int password, String post) {
        this.name = name;
        this.password = password;
        this.post = post;

    }
    
    public String setDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd h:mm");
        String now = dateTimeFormatter.format(LocalDateTime.now());
        //꼬이면 toString 사용해보기
        return now;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public int compareTo(memo.Memo m) {
        int comparedResult = this.date.compareTo(m.date);
        if (comparedResult > 0) {
            return 1;
        } else if (comparedResult < 0) {
            return -1;
        }
        return 0;
    }


}
