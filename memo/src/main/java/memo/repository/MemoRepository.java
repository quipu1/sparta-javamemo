package memo.repository;

import memo.Memo;

public interface MemoRepository {
    void getMemoList();
    void editMemo(int id, int password, String newPost);

    void removeMemo(int id, int password);

    void saveMemo(String name, int password, String post);
}
