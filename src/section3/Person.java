package section3;

public class Person {
    // static이 붙지 않으면 인스턴스 필드
    // Person이라는 클래스가 생성되어야 사용할 수 있기 때문
    String name;
    String address;
    boolean isVip;
    // static이 붙으면 클래스 필드
    static int count = 0;
    static { // 클래스 필드는 static 블록에서 초기화할 수 있음
        count = 100;
    }

    // 인스턴스 메소드
    public void printName() {
        System.out.println("내 이름은 " + name);
    }

    // 클래스 메소드
    public static void printCount(){
        System.out.println("count : " + count);
        // System.out.println(name); // static한 메소드에서는 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없음
    }
}
