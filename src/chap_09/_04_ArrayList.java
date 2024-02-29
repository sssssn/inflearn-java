package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 : 많은 데이터를 쉽고 편리하게, 효과적으로 관리하기 위해 제공해주는 클래스 모음 (List, Set, Map)
        // 어레이 리스트
        // 중복 허용 O, 순서 보장 O
        ArrayList<String> list = new ArrayList<>();

        // 추가
        list.add("두부");
        list.add("팡이");
        list.add("모찌");
        list.add("꺽정이");
        list.add("선녀");

        // 조회 (인덱스 기준)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("--------------------");

        // 삭제 (꺽정이 이사)
        System.out.println("신청 학생 수 (이사 전) : " + list.size()); // 5
        list.remove("꺽정이");
        System.out.println("신청 학생 수 (이사 후) : " + list.size()); // 4
        System.out.println(list.get(3));

        System.out.println("--------------------");

        System.out.println("남은 학생 수 (제외 전) : " + list.size()); // 4
        list.remove(list.size() - 1); // 마지막 인덱스
        System.out.println("남은 학생 수 (제외 후) : " + list.size()); // 3

        System.out.println("--------------------");

        // 순회
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------");

        // 변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "선녀선녀"); // 처음 인덱스
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("--------------------");

        // 확인
        System.out.println(list.indexOf("모찌"));
        if (list.contains("모찌")) {
            System.out.println("수강신청 성공");
        } else {
            System.out.println("수강신청 실패");
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
