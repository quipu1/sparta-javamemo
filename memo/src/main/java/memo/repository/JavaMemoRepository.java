package memo.repository;

import memo.Memo;
import java.util.ArrayList;
import java.util.List;

public class JavaMemoRepository implements MemoRepository {

    private List<Memo> memoDB = new ArrayList<>();

    @Override
    public void getMemoList() {
        for (Memo memo : this.memoDB) {
            System.out.println(memo.getId() + "번 | " + memo.getName() + " | " + memo.getDate());
            System.out.println(memo.getPost());
            System.out.println("-------------------------------------");
        }
    }

    // 메모 저장
    public void saveMemo(String name, int password, String post) {
        // 메모 객체 생성
        Memo memo = new Memo(name, password, post);
        // DB에 앞에서부터 저장
        memoDB.add(0, memo);
        System.out.println(name + "님의 메모가 등록되었습니다.");
    }

    @Override
    public void editMemo(int memoId, int password, String newPost) {
        for (int i = 0; i < memoDB.size(); i++) {
            Memo memo = memoDB.get(i);
            // db에 있는 메모인지 확인
            if (memo.getId() == memoId) {
                // password 체크
                if (memo.getPassword() == password) {
                    memo.editDate(Memo.setDate());
                    memo.setPost(newPost);
                } else {
                    System.out.println("비밀번호가 틀렸습니다.");
                }
                System.out.println("글 번호" + memo.getId() + "가 수정되었습니다.");
                return;
            }
        }
        System.out.println("없는 게시물입니다.");
    }

    @Override
    public void removeMemo(int id, int password) {

        for (int i = 0; i < memoDB.size(); i++) {
            Memo memo = memoDB.get(i);
            if (memo.getId() == id) {
                if (memo.getPassword() == password) {
                    memoDB.remove(i);
                } else {
                    System.out.println("비밀번호가 틀렸습니다.");
                }
                System.out.println("글 번호" + memo.getId() + "가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("없는 게시물입니다.");
    }
}



