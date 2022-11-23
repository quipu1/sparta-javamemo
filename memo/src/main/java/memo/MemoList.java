package memo;

import memo.repository.JavaMemoRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoList {
    List<Memo> memoList;
    public MemoList(List<Memo> memoList) {
        this.memoList = memoList;
    }
//    List<Memo> memoList = new ArrayList<Memo>(); //여러 건의 메모를 저장하는 클래스 이다.
    static int count= 0;

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
        memoList.set(count++, memo);
    }
}
