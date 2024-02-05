package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조

        // 기본 자료형 (Primitive Data Types) : int, float, double, long, boolean, ...
        // 값을 지정하지 않아도 기본값을 항상 가짐
        // 메서드 X
        // 소문자로 시작
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam, ...
        // 값을 지정하지 않으면 null
        // 메서드 O
        // 대문자로 시작
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        System.out.println("--------------------");

        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------");

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1; // Camera c1 = new Camera(); 참조
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("--------------------");
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = null; // 참조 없애기 (관계 끊기)
        System.out.println(c2.name);
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
