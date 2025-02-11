package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation) : 관련 있는 메서드만 하나의 클래스 내에서 정의
        // 정보은닉 (Information hiding) : 허용하는 메서드를 통해서만 접근 가능

        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
//        b1.price = 200000; // 에러
        b1.setPrice(200000);
        b1.color = "블랙";

        // 할인 행사
//        b1.price = -5000; // 에러
        b1.setPrice(-5000);
//        System.out.println("가격 : " + b1.price + "원"); // 에러
        System.out.println("가격 : " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("--------------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        // 할인 행사
        System.out.println("가격 : " + b2.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b2.getResolution());

//        b2.price = -5000; // 에러
    }
}
