package chap_08;

import chap_07.BlackBoxRefurbish;
// import chap_07.*; // 모든 클래스 가져오기

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
//        b1.resolution = "FHD"; // default // 에러
//        b1.price = 200000; // private // 에러
//        b1.color = "블랙"; // protected // 에러
    }
}
