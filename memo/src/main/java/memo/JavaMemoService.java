package memo;

import memo.repository.JavaMemoRepository;
import memo.repository.MemoRepository;

public class JavaMemoService implements MemoService{

    private final MemoRepository memoRepository = new JavaMemoRepository();

    @Override
    public void editMemo(int id, String newPost) {
        memoRepository.editMemo(id, newPost);
    }

}
