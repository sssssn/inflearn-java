package chap_07.camera;

public final class ActionCam extends Camera {
//    public final String lens = "광각 렌즈"; // (1) 선언과 동시에 초기화
    public final String lens; // (2) 선언

    public ActionCam() {
        super("액션 카메라");
        lens = "광각 렌즈"; // (2) 초기화
    }

    public final void makeVideo() {
//        this.lens = "값 변경"; // 에러
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
