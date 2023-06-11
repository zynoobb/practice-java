package section1;

public class PrimitiveCaseExam4 {
    public static void main(String[] args) {
        // 크기가 큰 타입은 작은 타입을 저장할 수 있음.
        // long 타입은 byte, short, int 타입 저장 가능 /int 타입은 byte, short 저장 가능 /short 타입의 변수는 byte
        long x2 = 50;
        int i2 = (int)x2;
        System.out.println(x2);
        System.out.println(i2);

        // 단, 크기가 큰 타입을 작은 타입에 저장할 때는 "오버플로우"를 조심해야 함
        // 오버플로우 시 출력값은 음수로 나오게 되니 주의할 것
        // "보수"의 개념에 대해 이해할 필요 (인터넷 찾아보기)
    }
}
