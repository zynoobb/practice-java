package section1;

public class PrimitiveCaseExam4 {
    public static void main(String[] args) {
        // 크기가 큰 타입은 작은 타입을 저장할 수 있음.
        // long 타입은 byte, short, int 타입 저장 가능 /int 타입은 byte, short 저장 가능 /short 타입의 변수는 byte
        long x2 = 50;
        int i2 = (int)x2;
        System.out.println(x2);
        System.out.println(i2);

        // 단, 크기가 큰 타입을 작은 타입에 저장할 때는 오버플로우를 조심해야 함
    }
}
