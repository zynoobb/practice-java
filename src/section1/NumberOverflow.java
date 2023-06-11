package section1;

public class NumberOverflow {
    public static void main(String[] args) {
        // 계산 결과가 최댓값을 넘거나 최솟값보다 작을 경우 음수는 양수로, 양수는 음수로 바뀌는 문제가 발생
        // 이를 오버 플로우라고 함 => 이를 해결하기 위해 overflow 확인 후 연산을 하거나, 변수의 범위를 더 크게 잡음
        int value = 10;
        int maxInt = Integer.MAX_VALUE;

        System.out.println(value +1);
        System.out.println(maxInt);
        System.out.println(maxInt +1);

        // double 형 타입은 정수 값이 잘 대입된다.
        double d1 = 50;
        double d2 = 500L;

        System.out.println(d1);
        System.out.println(d2);

        // int 타입에 실수 대입 시 오류 나타남.
//         int d3 = 50.50;
        // 실수 값을 정수에 저장하려면 다음과 같이 형 변환을 해야 함.
        int i1 = (int)50.5;
        int i2 = (int)25.6f;
        System.out.println(i1); // 50
        System.out.println(i2); // 25
    }
}





