package memo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Memo implements Comparable<Memo>{

    int id = 0;
    private String name;
    private int password;
    String post;
    String date;

    public Memo(String name, int password, String post) {
        this.id += 1;
        this.name = name;
        this.password = password;
        this.post = post;
        this.date = setDate();
    }

    public String getDate() {
        return date;
    }

    public String setDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd h:mm");
        String now = dateTimeFormatter.format(LocalDateTime.now());
        //꼬이면 toString 사용해보기
        return now;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

}
