package chap_07.camera;

public final class ActionCam extends Camera { // 상속 불가
//    public final String lens = "광각 렌즈"; // (방법 1) 선언과 동시에 초기화
    public final String lens; // (방법 2) 선언

    public ActionCam() {
        super("액션 카메라");
        lens = "광각 렌즈"; // (방법 2) 생성자 내에서 초기화
    }

    public final void makeVideo() { // 자식 클래스에서 오버라이딩 불가
//        this.lens = "값 변경"; // 에러
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
