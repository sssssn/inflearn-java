package chap_07;

public class BlackBox {
    // 인스턴스 변수, 필드 ≒ 설계도
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호를 생성해 주는 역할 (++ 연산을 통해 값을 증가)

    // 클래스 변수
    static boolean canAutoReport = false; // 자동 신고 기능

    // 생성자
    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 번호를 발급 받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    // 인스턴스 메서드
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        }
        else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }

    // showDateTime : 날짜 정보 표시 여부
    // showSpeed : 속도 정보 표시 여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    // 클래스 메서드
    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-oooo) 로 연결합니다.");
        // modelName = "test"; // 인스턴스 변수는 직접 접근 불가
        canAutoReport = false;
    }

    // 인스턴스 변수와 전달받은 파라미터 변수의 이름이 동일한 경우
    void appendModelName(String modelName) {
//        modelName += modelName; // 인스턴스 변수가 아닌 파라미터 변수로 인식

        this.modelName += modelName; // 인스턴스 변수로 명시하고 싶을 경우 this 사용
    }

    // 인스턴스 변수와 전달받은 파라미터 변수의 이름이 동일하지 않은 경우
//    void appendModelName(String s) {
//        modelName += s; // 상관 없음
//    }

    // Getter (값을 가져오는 메서드)
    String getModelName() {
        return modelName;
    }

    // Setter (값을 설정하는 메서드)
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
