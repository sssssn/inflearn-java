package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("두부");
        c2.ready();

        System.out.println("--------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("팡이");
        c4.ready();

        System.out.println("--------------------");

//        int c3Name = c3.name; // 에러
        int c3Name = (int) c3.name; // 형 변환
        System.out.println("주문 고객 번호 : " + c3Name);

//        String c4Name = c4.name; // 에러
        String c4Name = (String) c4.name; // 형 변환
        System.out.println("주문 고객 이름 : " + c4Name);

//        c4Name = (String) c3.name; // 에러 (형 변환 잘못할 시 실행 X)

        System.out.println("--------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("모찌");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("--------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("꺽정이"));
        c7.ready();

//        CoffeeByUser<VIPUser> c8 = new CoffeeByUser<>(new VIPUser("선녀"));
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("선녀"));
        c8.ready();

//        CoffeeByUser<User> c9 = new CoffeeByUser<>(new BlackBox()); // 에러 (상속하지 않는 클래스)

        System.out.println("--------------------");

        orderCoffee("선녀선녀");
        orderCoffee(36);

        System.out.println("--------------------");

        orderCoffee("선녀선녀선녀", "바닐라라떼");
        orderCoffee(37, "아메리카노");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}

//class BlackBox {

//}
