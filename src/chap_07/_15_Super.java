package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super : 자식 클래스가 부모 클래스의 기능을 재사용할 수 있도록 하는 역할
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("--------------------");
        speedCam.takePicture();
    }
}
