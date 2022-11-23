package memo;

import memo.repository.JavaMemoRepository;
import memo.repository.MemoRepository;

public class JavaMemoService implements MemoService{

    private final MemoRepository memoRepository = new JavaMemoRepository();

    @Override
    public void showMemoList() {
        memoRepository.getMemoList();
    }

    @Override
    public void changeMemo(int id, int password, String newPost) {
        memoRepository.editMemo(id, password, newPost);
    }

}
