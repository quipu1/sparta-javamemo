package memo;

import java.util.Collections;

public class MemoList {
    static Memo[] memoList = new Memo[500]; //여러 건의 메모를 저장하는 클래스 이다.
    static int count= 0;


    // 메모 전체를 조회할 수 있다. (Getter/Setter 존재)
    public Memo[] getMemo() {
        return memoList;
    }
    // 작성 최신 순으로 메모를 출력한다.
    public void printMemo() {
        Collections.sort(memoList);
        for(Memo memo : memoList) {
            System.out.println(memo.id + "\t" + memo.post + "\t (" + memo.name
                + ", " + memo.date);
        }
    }
    // 1건의 글을 메모 리스트에 추가할 수 있다.
    public void saveMemo(Memo memo) {
        memoList[count++] = memo;
    }
}
