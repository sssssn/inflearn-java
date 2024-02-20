package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
//        writeFile();

        try { // try-catch : 메서드 내에서 자체 해결
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메서드에서 해결할게요.");
        }
    }

    public static void writeFile() throws IOException { // throws : 메서드를 호출한 쪽으로 미루기
//        try { // try-catch : 메서드 내에서 자체 해결
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기에 실패했어요!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메서드 내에서 자체 해결했어요.");
//        }

        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패했어요!!");
    }
}
