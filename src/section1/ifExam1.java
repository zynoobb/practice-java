package section1;

public class ifExam1 {
    public static void main(String[] args) {

        // if문 첫번째 사용법
        // 자바스크립트와 같음
        int a = 5;
        if (a > 4) {
            System.out.println("a는 4보다 큽니다.");
        }

        // if문 두번째 사용법
        // else
        int b = 3;
        if (b > 4) {
            System.out.println("b는 4보다 큽니다");
        } else {
            System.out.println("b는 4보다 작거나 같습니다");
        }

        // if문 세번째 사용법
        // else if 여러번 사용 가능
        int score = 70;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (80 > score) {
            System.out.println("C");
        }

        // if문 중괄호가 없는 경우, if문장 다음만 조건에 만족할 경우 실행됨

        // 삼항 연산자
        int v = 10;
        int value = (v > 5) ? 20 : 30;
        System.out.println(value);
    }
}

