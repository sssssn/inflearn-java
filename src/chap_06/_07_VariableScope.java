package chap_06;

public class _07_VariableScope {
    public static void methodA() {
//        System.out.println(number); // main 영역 내에서만 사용 가능
//        System.out.println(result); // methodB 영역 내에서만 사용 가능
    }

    public static void methodB() {
        int result = 1; // 지역 변수
    }

    public static void main(String[] args) {
        int number = 3; // 지역 변수

//        System.out.println(result); // methodB 영역 내에서만 사용 가능

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

//        System.out.println(i); // 반복문 For 영역 내에서만 사용 가능

        {
            int j = 0; // 지역 변수
            System.out.println(j);
            System.out.println(number);
        }
//        System.out.println(j); // { } 영역 내에서만 사용 가능
    }
}
