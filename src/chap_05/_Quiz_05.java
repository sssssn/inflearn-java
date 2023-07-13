package chap_05;
/*
신발 사이즈는 250부터 295까지 5단위로 증가
신발 사이즈 수는 총 10가지

(실행 결과)
사이즈 250 (재고 있음)
...
사이즈 295 (재고 있음)
 */
public class _Quiz_05 {
    public static void main(String[] args) {
//        int[] sizeArray = {250, 255, 260, 265, 270, 275, 280, 285, 290, 295};
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
//            System.out.println("사이즈 " + sizeArray[i] + " (재고 있음)");
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
