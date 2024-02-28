package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 : 다양한 타입의 객체를 지원하는 클래스나 인터페이스 또는 메서드를 정의하는 방법
        // 똑같은 동작을 하는 클래스나 메서드를 한 번만 정의하고 나서 여러 타입에 대해서 지원

//        int[] iArray = {1, 2, 3, 4, 5}; // 기본 자료형 (제네릭스 X)
        Integer[] iArray = {1, 2, 3, 4, 5}; // 래퍼 클래스
//        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0}; // 기본 자료형 (제네릭스 X)
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0}; // 래퍼 클래스
        String[] sArray = {"A", "B", "C", "D", "E"}; // 참조 자료형 (제네릭스 O)

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("--------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // <> : 다이아몬드 기호
    // T : Type, K : Key, V : Value, E : Element
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

//    private static void printDoubleArray(double[] dArray) {
    private static void printDoubleArray(Double[] dArray) { // 래퍼 클래스
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

//    private static void printIntArray(int[] iArray) {
    private static void printIntArray(Integer[] iArray) { // 래퍼 클래스
        for (int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }
}
