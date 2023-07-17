package section2;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);
    }
}

// static 이 붙은 메소드는 클래스 메소드라 부름
// 클래스 메소드는 인스턴스를 생성하지 않아도 사용할 수 있음 (중요)