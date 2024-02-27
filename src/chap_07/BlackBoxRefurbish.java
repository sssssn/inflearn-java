package chap_07;

// 하나의 파일에 여러 개의 클래스를 정의할 수 있으나, public 클래스명과 java 파일명은 동일해야 함
public class BlackBoxRefurbish {
    public String modelName; // 모델명
    String resolution; // 해상도
    private int price; // 가격
    protected String color; // 색상

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
