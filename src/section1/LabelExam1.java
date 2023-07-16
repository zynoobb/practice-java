package section1;

public class LabelExam1 {
    public static void main(String[] args) {
        outter:
        // 라벨
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (i == 0 && k == 2)
                    break outter; // outter가 붙어있는 반복문을 단번에 빠져나감
                System.out.println(i + ", " + k);
            }
        }
    }
}

// break와 continue의 한계
// 중첩 반복문을 한번에 빠져나가기 위해선 label을 사용


