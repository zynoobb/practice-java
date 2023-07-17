package section2;

public class VendingMachine {
    // 필드 (가지는 것들)
    // 생성자
    // 메서드
    public String pushProductButton(int menuId) {
        System.out.println(menuId + "를 전달받았습니다");
        return "콜라";
    }

    // static으로 선언한 메서드는 인스턴스를 만들지 않아도 사용 가능
    public static void printVersion(){
        System.out.println("v1.0");
    }
}
