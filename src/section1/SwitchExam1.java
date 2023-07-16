package section1;

public class SwitchExam1 {
    public static void main(String[] args) {
        // switch 블록 안에는 여러 개의 case가 올 수 있음
        // switch 블록 안에는 하나의 default가 올 수 있음
        // break 문은 생략할 수 있음
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("1입니다");
                break;
            case 2:
                System.out.println("2입니다");
                break;
            case 3:
                System.out.println("3입니다");
                break;
            default:
                System.out.println("1,2,3이 아닙니다.");
        }
    }
}
