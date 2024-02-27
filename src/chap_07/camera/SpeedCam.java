package chap_07.camera;

// SpeedCam is a Camera. (IS-A)
public class SpeedCam extends Camera { // 자식 클래스
//    public String name;

    public SpeedCam() {
//        this.name = "과속 단속 카메라";
        super("과속 단속 카메라"); // 부모 클래스의 생성자 호출
    }

    public void takePicture() {
//        // 사진 촬영
//        System.out.println(this.name + " : 사진을 촬영합니다.");
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

//    public void takePicture() {
//        // 사진 촬영
//        System.out.println("사진을 촬영합니다.");
//    }

//    public void recordVideo() {
//        // 동영상 녹화
//        System.out.println("동영상을 녹화합니다.");
//    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
         // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
