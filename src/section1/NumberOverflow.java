package section1;

public class NumberOverflow {
    public static void main(String[] args) {
        int value = 10;
        int maxInt = Integer.MAX_VALUE;

        System.out.println(value +1);
        System.out.println(maxInt +1);
    }
}

// 계산 결과가 최댓값을 넘거나 최솟값보다 작을 경우 음수는 양수로, 양수는 음수로 바뀌는 문제가 발생
// 이를 오버 플로우라고 함 => 이를 해결하기 위해 overflow 확인 후 연산을 하거나, 변수의 범위를 더 크게 잡음

