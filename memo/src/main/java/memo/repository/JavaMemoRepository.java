package memo.repository;

import memo.Memo;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class JavaMemoRepository implements MemoRepository {

    private List<Memo> memoDB = new ArrayList<>();

    @Override
    public void editMemo(int memoId, String newPost) {
        if ( memoId > 0 && memoId < memoDB.size()) {
            Memo memo = getMemo(memoId);
            String newDate = "";
            // memo.changePostDate(newPost, newDate);

        } else {
            System.out.println("해당 메모가 없습니다.");
        }

    }

    public Memo getMemo(int memoID) {
        Memo memo = this.memoDB.get(memoID);
        return memo;
    }
}
