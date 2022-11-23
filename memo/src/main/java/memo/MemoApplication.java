package memo;


import java.util.Scanner;

public class MemoApplication {
    public static void main(String[] args) {
        MemoService memoService = new JavaMemoService();
        Scanner scanner = new Scanner(System.in);
        boolean run = True;

        while(run) {
            //UI 메소드 자리
            System.out.print("입력 > ");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
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
                case 2:
                    System.out.println("2 목록 보기");
                    memoService.getMemo();
                    break;
                case 3:
                    System.out.println("3 수정");
                    System.out.print("아이디 > ");
                    int id = scanner.nextInt();
                    if(!memoService.isExist()) {
                        System.out.println("글이 존재하지 않습니다.");
                        break;
                    }
                    System.out.print();
            }
        }
    }
}
