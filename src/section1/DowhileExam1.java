package section1;

public class DowhileExam1 {
    public static void main(String[] args) {
        // do / while 문은 탈출조건식이 false를 반환할 때 do / while문을 종료하게 됨
        // 무조건 한번은 실행하고 싶을 때 사용
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i<=10);
    }
}

// do while문은 사용자에게 한번은 값을 입력받고 싶을 때,
// 그리고 입력받은 값이 원하지 않은 값일 경우 바로 종료하고 싶을 때 사용