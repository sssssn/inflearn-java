package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스
        // 기본 자료형(int, double, float, char)을 객체 형태로 만들어서 사용할 수 있도록 해주는 역할

        Integer i = 123; // int i = 123;
        Double d = 1.0; // double d = 1.0;
        Character c = 'A'; // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("--------------------");

        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 형 변환
        System.out.println(c.charValue());

        System.out.println("--------------------");

        String s = i.toString(); // 형 변환
        System.out.println(s);
    }
}
