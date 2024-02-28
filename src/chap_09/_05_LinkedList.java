package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        // 중복 허용 O, 순서 보장 O
        LinkedList<String> list = new LinkedList<>();

        // 추가
        list.add("두부");
        list.add("팡이");
        list.add("모찌");
        list.add("꺽정이");
        list.add("선녀");

        // 조회 (인덱스 기준)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst()); // 처음 인덱스
        System.out.println(list.getLast()); // 마지막 인덱스

        System.out.println("--------------------");

        // 추가
        list.addFirst("선녀선녀"); // 처음 인덱스
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------");

        list.addLast("선녀선녀선녀"); // 마지막 인덱스
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------");

        System.out.println("학생 추가 전 (index 1) : " + list.get(1));
        list.add(1, "두부두부"); // 원하는 인덱스
        System.out.println("학생 추가 후 (index 1) : " + list.get(1));
        System.out.println("학생 추가 후 (index 2) : " + list.get(2));

        System.out.println("--------------------");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1); // 마지막 인덱스
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("--------------------");

        // 처음 학생과 마지막 학생 전학
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        list.removeFirst(); // 처음 인덱스
        list.removeLast(); // 마지막 인덱스
        System.out.println("남은 학생 수 (전학 후) : " + list.size());
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------");

        // 변경 (수강권 양도)
        list.set(0, "모찌모찌"); // 처음 인덱스
        System.out.println(list.get(0));

        System.out.println("--------------------");

        // 확인
        System.out.println(list.indexOf("모찌"));
        if (list.contains("모찌")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("--------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("--------------------");

        // 새로운 학기 시작
        list.add("두부");
        list.add("팡이");
        list.add("모찌");
        list.add("꺽정이");
        list.add("선녀");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
