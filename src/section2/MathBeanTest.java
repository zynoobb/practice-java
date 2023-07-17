package section2;

public class MathBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean(); // new 생성자로 생성된 것은 heap 메모리에 올라감

        math.printClassName();
        math.printNumber(5000);
        // return으로 값이 반환되는 경우 변수로 저장하여 사용
        int x = math.getOne();
        System.out.println(x);
        int value = math.plus(200,300);
        System.out.println(value);
    }
}

