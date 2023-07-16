package section1;

public class LabelExam2 {
    public static void main(String[] args) {
        outter:
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (i == 0 && k == 2)
                    continue outter;
                System.out.println(i + ", " + k);
            }
        }
    }
}

// continue outter를 만나게 되면 continue outter 아랫부분을 실행하지 않고 (0,2) 생략
// 바깥쪽 반복문을 이어서 반복하게 됨