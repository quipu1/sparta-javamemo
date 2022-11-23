package memo.repository;

import memo.Memo;

public interface MemoRepository {
    void getMemoList();
    void editMemo(int id, int password, String newPost);
}
