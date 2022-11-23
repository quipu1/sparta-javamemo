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
    public void delMemo(int id, int password) {
       memoRepository.removeMemo(id, password);
    }

    @Override
    public void changeMemo(int id, int password, String newPost) {
        memoRepository.editMemo(id, password, newPost);
    }
    @Override
    public void postMemo(String name, int password, String post) {
        memoRepository.saveMemo(name, password, post);
    }

}
