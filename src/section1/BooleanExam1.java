package section1;

public class BooleanExam1 {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;

        // 아래 논리연산자는 JS단축평가와 같은 방식으로 실행됨
        flag1 = 10 > 5 && 5 < 20; // && : 전자가 false 인 경우, 뒤에는 실행 X
        flag2 = 10 < 5 & 5 < 20; // & : 전자가 false 인 경우, 뒤에도 실행 O
        flag3 = 10 >= 10 || 5 > 6;
        flag4 = 10 >= 10 | 5 > 6;
        flag5 = 10 == 10 ^ 5 == 4; // ^ : 두 값이 달라야 true
        flag6 = !flag5;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);
        System.out.println(flag6);
    }
}

// 불린형 타입의 경우, 1byte 사용. 0 or 1