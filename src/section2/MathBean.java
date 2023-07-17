package section2;

public class MathBean {
    public void printClassName() {
        System.out.println("MathBean");
    }

    public void printNumber(int number) {
        System.out.println(number);
    }

    public int getOne() {
        return 1;
    }

    public int plus(int x, int y) {
        return x + y;
    }
}

// 회색은 해당 클래스가 사용되는 곳이 없다는 의미

// UML표기법
// 예시, printNumber(int) : void