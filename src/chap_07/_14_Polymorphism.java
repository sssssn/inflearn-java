package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person.)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person.)

        Camera camera = new Camera();
//        FactoryCam factoryCam = new FactoryCam();
        Camera factoryCam = new FactoryCam(); // 부모 클래스로 정의
//        SpeedCam speedCam = new SpeedCam();
        Camera speedCam = new SpeedCam(); // 부모 클래스로 정의

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("--------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("--------------------");

        // 부모 클래스로 정의했기 때문에 부모 클래스에 있는 메서드만 접근 가능
//        factoryCam.detectFire(); // 에러
//        speedCam.checkSpeed(); // 에러
//        speedCam.recognizeLicensePlate(); // 에러

        // 자식 클래스에 있는 메서드에 접근하기 위한 방안
        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
//            factoryCam.detectFire(); // 에러
            ((FactoryCam) factoryCam).detectFire(); // ((형 변환 클래스명) 객체).메서드
        }

        if (speedCam instanceof SpeedCam) {
//            speedCam.checkSpeed(); // 에러
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        // 기본적으로 Object 라는 클래스를 상속
//        Object[] objs = new Object[3];
//        objs[0] = new Camera();
//        objs[1] = new FactoryCam();
//        objs[2] = new SpeedCam();
    }
}
