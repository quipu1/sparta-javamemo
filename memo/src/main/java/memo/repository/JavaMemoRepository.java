package memo.repository;

import memo.Memo;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class JavaMemoRepository implements MemoRepository {

    private List<Memo> memoDB = new ArrayList<>();

    @Override
    public void getMemoList() {
        for (Memo memo : this.memoDB) {
            System.out.println(memo.getName() + "|" + memo.getDate());
            System.out.println(memo.getPost());
            System.out.println("-------------------------------------");
        }
    }

    @Override
    public void editMemo(int memoId, int password, String newPost) {

        // db에 있는 메모인지 확인
        for (Memo memo : this.memoDB) {
            // db에 해당 메모가 있을 때,
            if (memo.getId() == memoId) {
                // password 체크
                if (memo.getPassword() == password) {
                    memo.setDate();
                    memo.setPost(newPost);
                } else {
                    System.out.println("비밀번호가 틀렸습니다.");
                }
            } else {
                System.out.println("해당 메모가 없습니다.");
            }
        }
    }

    //수정에서 안 쓰는 부분인데 다른 분들도 안 쓰면 지우기
    public Memo getMemo(int memoID) {
        Memo memo = this.memoDB.get(memoID);
        return memo;
    }
}
