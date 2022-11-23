package memo.repository;

import memo.Memo;

public interface MemoRepository {
    void editMemo(Memo memo, String newPost);
}
