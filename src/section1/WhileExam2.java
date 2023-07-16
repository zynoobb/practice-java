package section1;

public class WhileExam2 {
    public static void main(String[] args) {
        // 자바스크립트와 마찬가지로, while이 true일 경우 무한 반복
        // 조건문을 설정하여 탈출 경로를 만들어야 함
        int i = 1;
        while (true) {
            if(i == 11) break;
            System.out.println(i);
            i++;
        }
    }
}
