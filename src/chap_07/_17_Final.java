package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final

        // public (final) class ...
        // public (final) void ...
        // public > abstract > static > final > ...

        ActionCam actionCam = new ActionCam();
//        actionCam.lens = "표준 렌즈"; // 에러
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("--------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
//        slowActionCam.recordVideo(); // 에러
        slowActionCam.makeVideo();
    }
}
