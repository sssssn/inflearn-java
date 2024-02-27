package chap_07.camera;

//public class SlowActionCam extends ActionCam { // 에러 (상속 불가)
public class SlowActionCam {
    public String name;

    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
    }

//    public void makeVideo() {
//        System.out.println(this.name + " : "
//                + this.lens + "로 촬영한 영상을 통해 멋진 슬로우 모드 비디오를 제작합니다.");
//    } // 에러 (자식 클래스에서 오버라이딩 불가)

    public void makeVideo() {
        System.out.println("자체 개발한 비디오 제작 기능");
    }
}
