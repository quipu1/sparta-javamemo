package memo;

public class Memo implements Comparable<Memo> {
    int id;
    String name;
    int password;
    String post;
    String date;

    Memo(int id, String name, int password, String post, String date) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.post = post;
        this.date = date;
    }

    @Override
    public int compareTo(Memo m) {
        int comparedResult = this.date.compareTo(m.date);
        if (comparedResult > 0) {
            return 1;
        } else if (comparedResult < 0) {
            return -1;
        }
        return 0;
    }

}
