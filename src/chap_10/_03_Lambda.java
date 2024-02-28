package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식 : 아주 간결한 형태의 코드 뭉치
        // (전달값1, 전달값2, ...) -> { 코드 };
    }

    // (1)

//    public void print() {
//        String s = "test";
//        System.out.println(s);
//    }

//    () -> { // 접근 제어자, 메서드명, 반환형 필요 X
//        String s = "test";
//        System.out.println(s);
//    }

    // (2)

//    public void print(String s) {
//        System.out.println(s);
//    }

//    s -> System.out.println(s) // 접근 제어자, 메서드명, 반환형, 전달형 필요 X // 한 줄만 있을 때 중괄호, 세미콜론 생략 O

    // (3)

//    public int add(int x, int y) {
//        return x + y;
//    }

//    (x, y) -> x + y // 접근 제어자, 메서드명, 반환형, 전달형 필요 X // return 생략 O
}
