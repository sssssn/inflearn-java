package chap_13;

public class _02_Output {
    public static void main(String[] args) {
//        System.out.format(); // (방법 1)
//        System.out.printf(); // (방법 2) ("포맷", 값1, 값2, 값3, ...);

        System.out.println("---------- 정수 ----------");
        // %n = \n
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1 2 3
        System.out.printf("%d%n", 1234); // 1234
        System.out.printf("%6d%n", 1234); // __1234 (6자리 공간 확보)
        System.out.printf("%06d%n", 1234); // 001234 (빈 공간만큼 0 출력)
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234 (항상 +- 표시)
        System.out.printf("%,15d%n", 1000000000); // __1,000,000,000 (세 자리마다 , 구분)
        System.out.printf("%-6d%n", 1234); // 1234__ (좌측 정렬)

        System.out.println("---------- 실수 ----------");
        System.out.printf("%f%n", Math.PI); // 3.141593
        System.out.printf("%.2f%n", Math.PI); // 3.14 (소수점 둘째 자리까지 출력)
        System.out.printf("%6.2f%n", Math.PI); // __3.14 (6자리 공간 확보)
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__ (좌측 정렬)
        System.out.printf("%06.2f%n", Math.PI); // 003.14 (빈 공간만큼 0 출력)
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14 (항상 +- 표시)

        System.out.println("---------- 문자열 ----------");
        System.out.printf("%s%n", "Java"); // Java
        System.out.printf("%6s%n", "Java"); // __Java (6자리의 공간 확보)
        System.out.printf("%-6s%n", "Java"); // Java__ (좌측 정렬)
        System.out.printf("%6.2s%n", "Java"); // ____Ja (두 글자까지 출력)
        System.out.printf("%-6.2s%n", "Java"); // Ja____ (좌측 정렬)

        System.out.println("---------- 응용1 ----------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("두부 " + 90 + " " + 80 + " " + 85.0); // 두부 90 80 85.0
        System.out.println("팡이 " + 100 + " " + 100 + " " + 100.0); // 팡이 100 100 100.0
        System.out.println("모찌 " + 95 + " " + 100 + " " + 97.5); // 모찌 95 100 97.5

        System.out.println("---------- 응용2 ----------");
        System.out.println("이름      영어   수학   평균"); // 공백 6, 3, 3칸 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "두부", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "팡이", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "모찌", 95, 100, 97.5);

        System.out.println("---------- 참고 ----------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
    }
}
