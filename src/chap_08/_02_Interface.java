package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.repoter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 (뼈대만 제공하는 구조)
//        NormalReporter normalReporter = new NormalReporter();
        Reportable normalReporter = new NormalReporter(); // 인터페이스로 정의
        normalReporter.report();

//        VideoReporter videoReporter = new VideoReporter();
        Reportable videoReporter = new VideoReporter(); // 인터페이스로 정의
        videoReporter.report();

        System.out.println("--------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("--------------------");

        FactoryCam factoryCam = new FactoryCam();
//        factoryCam.setDetector(fireDetector);
        factoryCam.setDetector(advancedFireDetector);
//        factoryCam.setReporter(normalReporter);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
