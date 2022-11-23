package memo;


import memo.presentation.Uinterface;
import memo.presentation.UserInterface;

import java.util.Scanner;

public class MemoApplication {
    public static void main(String[] args) {
        MemoService memoService = new JavaMemoService();
        Uinterface uinterface = new UserInterface();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            uinterface.inputList();
            System.out.print("입력 > ");
            String input = scanner.next();
            switch (input) {
                case "1":
                    System.out.println("1 입력");
                    System.out.print("이름: ");
                    String name = scanner.next();
                    System.out.println("비밀번호는 6글자 이내 숫자로 입력하시오.");
                    System.out.print("비밀번호: ");
                    int password = scanner.nextInt();
                    System.out.print("메모: ");
                    String post = scanner.next();
                    memoService.postMemo(name, password, post);
                    break;
                case "2":
                    System.out.println("2 목록 보기");
                    memoService.showMemoList();
                    break;
                case "3":
                    System.out.println("3 수정");
                    System.out.print("글 번호: ");
                    int id3 = scanner.nextInt();
                    System.out.print("비밀번호: ");
                    int password3 = scanner.nextInt();
                    System.out.print("메모: ");
                    String post3 = scanner.next();
                    memoService.changeMemo(id3, password3, post3);
                    break;
                case "4":
                    System.out.println("4 삭제");
                    System.out.println("삭제하면 돌이킬 수 없으니 신중히 삭제해 주세요");
                    System.out.print("글 번호: ");
                    int id4 = scanner.nextInt();
                    System.out.print("비밀번호: ");
                    int password4 = scanner.nextInt();
                    memoService.delMemo(id4, password4);
                    break;
                case "q":
                    System.out.println("프로그램이 종료되었습니다");
                    uinterface.endUI();
                    System.exit(0);
            }
        }
    }
}
