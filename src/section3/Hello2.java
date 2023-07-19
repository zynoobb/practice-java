package section3;

public class Hello2 {
    static int i = 0;
    static {
        i = 500;
        System.out.println("static block"); // 원래는 static 필드를 초기화함
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}

// javac Hello2.java // 컴파일
// java Hello2 // 실행

// static 블록 이용 시 main함수보다 먼저 실행되는 함수를 만들 수 있음짐