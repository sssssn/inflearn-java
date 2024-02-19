package chap_10.converter;

@FunctionalInterface
public interface Convertible {
    void convert(int USD); // 하나의 추상 메서드만 연결
//    void convert2(); // 에러
}
