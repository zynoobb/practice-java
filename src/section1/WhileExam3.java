package section1;

public class WhileExam3 {
    public static void main(String[] args) {
        // 후위증감식
        // 변수 뒤에 후위 증가식이 붙을 경우, 변수가 사용된 이후에 값이 증가하게됨
        // i와 10이 비교를 한 후 i가 1 증가함
        // 예제는 예제일뿐, 좋은 코드는 아님
        int i = 0;
        while (i++ < 10) {
            System.out.println(i);
        }
    }
}
