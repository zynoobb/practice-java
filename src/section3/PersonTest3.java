package section3;

public class PersonTest3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "홍길동";

        p1.printName();
        // p1.printCount();
        // static 메소드는 클래스명.메소드명() 형태로 사용할 것
        Person.printCount();
        Person.count++;
        Person.printCount();
        System.out.println(Person.count);
    }
}


