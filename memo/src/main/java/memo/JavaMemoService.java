package memo;

import memo.repository.JavaMemoRepository;
import memo.repository.MemoRepository;

public class JavaMemoService implements MemoService{

    private final MemoRepository memoRepository = new JavaMemoRepository();

    @Override
    public void editMemo(Memo memo, String newPost) {
        memoRepository.editMemo(Memo memo, String newPost);
    }
}
