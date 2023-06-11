package section1;

public class stringExam1 {
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println((int)c1);
        char c2 = (char)97;
        System.out.println(c2);

        char c3 = 'a';
        while(c3 <= 'z') {
            System.out.println(c3);
            c3++;
        }
    }
}

// 문자타입입
// 문자는 작은 따옴표로 묶인 문자 하나를 말하며, 2byte의 크기와 각기 유니코드 값을 가진다. (자바스크립트 charCodeAt과 비슷)
// short 은 2byte 정수 타입인데, 음수, 0, 양수 표현
// char 는 2byte 정수 타입이 될 수 있는 0, 양수 표현



