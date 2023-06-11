package section1;

public class bitExam {
    public static void main(String[] args) {
        int a = 4; // 0000 0100
        int b = a >> 1; // 0000 0010 우측으로 한칸씩 밀림 // 2
        System.out.println(b);

        int c = 4; // 0000 0100
        int d = c << 1; // 0000 1000
        System.out.println(d);

        // >>> 는 지정된 수만큼 비트를 전부 오른쪽으로 이동시키며, 새로운 비트는 전부 0이 됨
        int e = 16; // 자0000
        int f = e >>> 2;
        System.out.println(f);
    }
}

// bit 와 byte
// bit는 컴퓨터가 처리하는 정보의 최소단위. 한개로는 많은 양의 데이터를 나타내기에 부족하기ㄷ 때문에, 8개의 bit을 묶은 byte를 사용
// 1byte는 00000000부터 11111111 까지 값을 표현할 수 있음 (2^8)으로, 0~254까지
// 1byte를 16진수로 표현 시 00부터 FF까지 표현 가능. => 4비트는 0부터 15까지 표현 가능하기 때문

// 비트연산자
// 비트연산자는 논리연산자와 비슷하나, bit 단위로 논리 연산을 할 때 사용하는 연산자
// 종류 & | ^ ~ << >> >>> 이 있음
// & = and // | = or
// ^ = x or // ~ = not
// << 는 좌측시프트 // >>는 우측 시프트 // >>> 우측양수화 시프트

