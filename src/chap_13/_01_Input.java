package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요.");
//        String name = sc.next();
//        System.out.println("혈액형을 입력하세요.");
//        String bloodType = sc.next();
//        System.out.println("키를 입력하세요.");
////        int height = Integer.parseInt(sc.next()); // (방법 1) String 으로만 반환하므로 형 변환 필요
//        int height = sc.nextInt(); // (방법 2) 정수형 값만 입력 필요
//        System.out.println("몸무게를 입력하세요.");
////        double weight = Double.parseDouble(sc.next());
//        double weight = sc.nextDouble();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("혈액형 : " + bloodType);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : " + weight);

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.next(); // 띄어쓰기로 구분
//        String lang = sc.nextLine(); // 입력받은 단어가 2개 이상인 경우 (방법 1) 문장으로 구분
        System.out.println("언어 : " + lang);

        sc.nextLine(); // 입력받은 단어가 2개 이상인 경우 (방법 2) 불필요한 문장(다음 단어) 삭제

        System.out.println("배우고 나니 기분이 어땠나요?");
//        String feeling = sc.next();
        String feeling = sc.nextLine();
        System.out.println("기분 : " + feeling);
    }
}
