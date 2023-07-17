package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

//    public static int getPowerStr(String strNumber) {
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

//    public static int getPowerByExp(int number, int exponent) {
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메서드 오버로딩
        // 같은 이름의 메서드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다를 때 가능
        // 반환값의 타입이 다를 땐 불가능!
        System.out.println(getPower(3)); // 3 * 3 = 9
//        System.out.println(getPowerStr("4"));
        System.out.println(getPower("4")); // 4 * 4 = 16
//        System.out.println(getPowerByExp(3, 3));
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
    }
}
