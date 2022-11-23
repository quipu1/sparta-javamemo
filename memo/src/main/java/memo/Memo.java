package memo;

public class Memo implements Comparable<Memo> {
    int id;
    String name;
    int password;
    String post;
    String date;
    @Override
    public int compareTo(Memo m) {
        int comparedResult = this.date.compareTo(m.date)
        if(comparedResult > 0) {
            return 1;
        }
        else if(comparedResult < 0) {
            return -1;
        }
        return 0;
    }
}
