package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "선녀"; // 여러 글자 " "
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; // 한 글자 ' '
        name = "두부";

        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println(name + "님의 학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789; // 정밀한 소수점 표현 시 double 사용
        float f = 3.14123456789F; // 기본 double, float 사용 시 F(f) 적기
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // 21억 초과 시 long 사용 L(l) 적기 <-> int
        l = 1000_000_000_000L; // _: 구분
        System.out.println(l);

        /*  (*): 기본
        (*)int, long: 정수
        float, (*)double: 실수
        char, String: 문자
        boolean: 논리
         */
    }
}
