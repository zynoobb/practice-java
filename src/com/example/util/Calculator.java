package com.example.util;

public class Calculator {
    public int plus(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();
        int value = cal.plus(10,100);
        System.out.println(value);
    }

}

// 패키지가 정의된 클래스 컴파일 하기
// javac -d 경로명 *.java
// -d 옵션을 사용