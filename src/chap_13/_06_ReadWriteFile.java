package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에서 내용을 사용할 때

        // 파일 쓰기
////        FileWriter fw = new FileWriter("goodjob.txt");
////        BufferedWriter bw = new BufferedWriter(fw);
//
////        try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt"))) { // 내용 덮어쓰기 (false)
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) { // 내용 추가
////            bw.write("1. 이제 거의 끝이 보여요.");
////            bw.newLine(); // 줄바꿈
////            bw.write("2. 여기까지 오신 나 자신 정말 대단해요!");
////            bw.newLine();
//            bw.write("3. 조금만 더 힘내요!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
