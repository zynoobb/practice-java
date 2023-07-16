package section1;

public class ForExamGugudan1 {
    public static void main(String[] args){
        // 중첩 반복문을 이용한 구구단 출력
        for(int i = 1; i <= 9; i++) {
            System.out.println(i + "단");
            for(int k = 1; k <= 9 ; k ++) {
                System.out.println(i + "*" + k + " = " + (k * i));
            }
            System.out.println();
        }
    }
}
