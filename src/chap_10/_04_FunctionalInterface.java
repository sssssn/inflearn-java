package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(1);

//        convertUSD(converter, 1);

//        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 1);

        // 함수형 인터페이스 : 인터페이스에 단 하나의 추상 메서드가 존재해야 함
        // 클래스 밖 : 함수 (cf. 클래스 안 : 메서드)
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 1);

        System.out.println("--------------------");

        // 전달값이 없는 경우
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        System.out.println("--------------------");

        // 두 줄 이상의 코드가 필요한 경우
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        System.out.println("--------------------");

        // 전달값이 2개인 경우
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 원");
        c2.convert(10, 1400);

        System.out.println("--------------------");

        // 반환값이 있는 경우
//        ConvertibleWithReturn c3 = (d, w) -> { return d * w; }; // return 포함 시 { } 생략 불가
        ConvertibleWithReturn c3 = (d, w) -> d * w; // return 자체를 제거할 시 { } 생략 가능
        int result = c3.convert(20, 1400); // c3.convert(20, 1400); -> CTRL + ALT + V
        System.out.println("20 달러 = " + result + " 원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
