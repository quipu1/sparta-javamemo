# README



1. 클래스 생성 - 태웅님
2. 메모 리스트 - 승호님
3. 입력 - 송미님
4. 목록 보기
5. 수정 - 루비
6. 삭제 - 시원님
7. 종료 - 이건 마지막

```
-------------------------------------------
1 입력 | 2 목록 보기 | 3 수정 | 4 삭제 | q 종료
-------------------------------------------
1 입력
이름 / 비밀번호 / 메모 형식으로 입력해주세요. => split / 각각을 필드에 넣어줘야함
이름: 
비밀번호는 6글자이내 뭐시로~
비밀번호: 
메모: 
-------------------------------------------
2 목록 보기
메모리스트
1 잠자기 (성루비, 2022-11-23)
2 잠자기 (성루비, 2022-11-23)
3 잠자기 (성루비, 2022-11-23)
-------------------------------------------
3 수정
입력 > 5
글이 존재하지 않습니다.
입력 > 1
비밀번호: 
비밀번호가 일치하지 않습니다.
입력 > 1
비밀번호: 
1번이 밥먹기로 수정되었습니다.
-------------------------------------------
4 삭제
입력 > 5
글이 존재하지 않습니다.
입력 > 1
비밀번호: 
비밀번호가 일치하지 않습니다.
입력 > 1
비밀번호: 
1번 잠자기가 삭제되었습니다.
-------------------------------------------
q 종료
입력 > q
프로그램이 종료되었습니다.
```





[field명]

 글 번호 id - int

작성자 이름 name - string

비밀번호 password - int

게시글 post  - string

작성일(컴퓨터 시스템의 날짜와 시간을 자동으로 저장) date - string



[method명]

추가 saveMemo(int id, string name, int password, string post, string date)

삭제 removeMemo(int id, int password)

수정 editMemo(int id, int password, string post)

불러오기 getMemo()
