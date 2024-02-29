package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir(); // 폴더 생성
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("--------------------");

        folderName = "A/B/C";
//        "A\\B\\C" (방법 1)
//        "A" + File.separator + "B" + File.separator + "C" (방법 2)

        // 윈도우 : C:\\Users\\sn
        // 맥, 리눅스 : /Users/sn

        folder = new File(folderName);
//        folder.mkdir(); // 단일 폴더 (폴더를 생성하려는 위치에 해당 폴더의 상위 폴더가 존재하는 경우)
        folder.mkdirs(); // 하위 폴더 (여러 개의 하위 폴더가 존재하는 경우)
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
