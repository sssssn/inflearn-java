package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
//        String folder = "."; // 현재 위치
//        String folder = "C:\\Users\\sn\\Desktop\\JavaWorkspace\\src\\chap_13"; // 절대 경로
        String folder = "src/chap_13"; // 상대 경로
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());
        for (File file : filesAndFolders.listFiles()) { // 모든 파일과 폴더 목록
            if (file.isFile()) {
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
        }
    }
}
