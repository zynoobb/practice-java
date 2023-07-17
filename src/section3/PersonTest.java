package section3;

public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        // 문자열은 new를 사용하지 않고 인스턴스 사용 가능. 되도록 new사용하지 않기(String 사용시)
        p1.name = "홍길동";
        p1.address = "일산";
        p1.isVip = true;
        p2.name = "조조";
        p2.address = "서울";

        System.out.println(p1.name); // 초기값 설정 없는 경우 null
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.isVip); // false

        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);
    }
}

// nullPointException => 참조하지 않은 변수를 사용할 때 발생하는 오류
