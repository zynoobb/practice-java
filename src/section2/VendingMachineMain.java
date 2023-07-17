package section2;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);

        // static 선언 메서드 출력 가능
        vm1.printVersion();
        // 다만, 클래스명을 명시해주어야 가독성이 좋음
        VendingMachine.printVersion();

        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);
    }
}

// static 이 붙은 메소드는 클래스 메소드라 부름
// 클래스 메소드는 인스턴스를 생성하지 않아도 사용할 수 있음 (중요)

// javac VendingMachine.java 컴파일
// javac VendingMachineMain.java 컴파일
// java VendingMachineMain 실행
// 이때 JVM(java가상머신)은 CLASSPATH 경로에서 클래스를 찾아 실행하게 됨.
// 이후 JVM은 해당 클래스를 읽어들이고 해당 '클래스 정보'를 PERM이라는 메모리 영역에 저장.

// 메소드 안에 선언된 지역 변수는 메소드가 실행될 때 생성되었다가 메소드가 종료될 때 사라짐
// 따라서 동시에 메소드가 호출되어도 문제가 없음