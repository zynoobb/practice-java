package section3;

public class PersonTest2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "홍길동";
        p2.name = "조조";

        System.out.println(Person.count);
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.count);
        System.out.println(p2.count);
        p1.count ++;
        System.out.println(p1.count);
        System.out.println(p2.count);
        p2.count ++;
        System.out.println(p1.count);
        System.out.println(p2.count);
        System.out.println(Person.count);
    }
}

// p2.count는 증가시키지 않았는데도 p2의 카운트 증가

// Person 클래스 정보를 읽어 들일 때 static한 필드는 정적 영역에 따로 저장
// Person이 가지고 있는 count변수는 별도로 저장되고 0으로 초기화 (인스턴스 별로 가지는 것이 아니라 정적 영역에 따로 관리)
// => 따라서 p1.count p2.count는 같은 데이터를 출력
// 인스턴스를 만들지 않아도 Person을 JVM이 읽어들일 때 count 변수는 따로 메모리에 올라감