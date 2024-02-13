package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction) : 디테일한 부분은 숨기고 꼭 필요한 정보만 공개하도록 하는 과정
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스) : 객체를 생성할 수 없음, 자식 클래스로는 생성 가능
        // 추상 메서드 (추상 클래스 또는 인터페이스에서 사용 가능한, 껍데기만 있는 메서드)

//        Camera camera = new Camera(); // 에러

        FactoryCam factoryCam = new FactoryCam();
//        Camera factoryCam = new FactoryCam(); // 부모 클래스로 정의
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
//        Camera speedCam = new SpeedCam(); // 부모 클래스로 정의
        speedCam.showMainFeature();
    }
}
