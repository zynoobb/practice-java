package section1;

public class WhileExam1 {
    public static void main(String[] args) {
        // while문은 탈출 조건식이 false를 반환할 때 while문을 종료하게 됨
        int i = 1;
        while (i<=5) {
            System.out.println(i);
            i++;
        }
    }
}


// 인텔리제이는 강력한 디버거를 제공함
// 이를 활용하면 로직이 내 의도대로 움직이고 있는지 확인할 수 있음
// 좌측 줄에서 붉은 점 생성 후, 벌레 버튼
