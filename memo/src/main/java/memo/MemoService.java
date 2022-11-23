package memo;

public interface MemoService {
    void changeMemo(int id, int password, String newPost);
    void showMemoList();

    void delMemo(int id, int password);
    void postMemo(String name, int password, String post);

}
