package section2;

public class MyMath {
    // 자동 생성 - 기본 생성자는 생성자가 없을 경우 컴파일할 때 자동으로 생성.
    //     private MyMath(){
    //
    //     }

    public static int abs(int x) {
        if(x < 0)
            return x * -1;
        else
            return x;
    }
}

// 접근제한자를 private로 변경 시, 해당 클래스 안에서만 접근할 수 있음