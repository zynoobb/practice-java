package section2;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);

        // static 선언 메서드 출력 가능
        vm1.printVersion();
        // 다만, 클래스명을 명시해주어야 가독성이 좋음
        VendingMachine.printVersion();
    }
}

// static 이 붙은 메소드는 클래스 메소드라 부름
// 클래스 메소드는 인스턴스를 생성하지 않아도 사용할 수 있음 (중요)