package memo;

import memo.repository.JavaMemoRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MemoList {
//    Memo[] memoList;
//    public MemoList(Memo[] memoList) {
//        this.memoList = memoList;
//    }

    static List<Memo> memoList = new ArrayList<Memo>(); //여러 건의 메모를 저장하는 클래스 이다.
    static int count= 0;

    memoList.add(new Memo(1,"sh",1647,"test1","2021-11-23"));
    memoList.add(new Memo(2,"sh2",1123,"test2","2022-04-28"));
    memoList.add(new Memo(3,"sh3",1145,"test3","2022-06-30"));
    memoList.add(new Memo(4,"sh4",2426,"test4","2022-09-10"));


    // 메모 전체를 조회할 수 있다. (Getter/Setter 존재)
    public List<Memo> getMemo() {
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
        memoList.set(count++, memo);
    }
}
