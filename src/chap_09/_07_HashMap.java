package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        // 중복 허용, 순서 보장 X
        HashMap<String, Integer> map = new HashMap<>();

        // 추가
        map.put("두부", 10);
        map.put("팡이", 5);
        map.put("모찌", 3);
        map.put("꺽정이", 15);

        System.out.println("총 고객 수 : " + map.size());

        System.out.println("--------------------");

        // 조회
        System.out.println("두부님의 포인트 : " + map.get("두부"));
        System.out.println("팡이님의 포인트 : " + map.get("팡이"));

        System.out.println("--------------------");

        // 확인
        if (map.containsKey("꺽정이")) {
            int point = map.get("꺽정이");
            map.put("꺽정이", ++point);
            System.out.println("꺽정이님의 누적 포인트 : " + map.get("꺽정이"));
        } else {
            map.put("꺽정이" , 1);
            System.out.println("꺽정이님 신규 등록 (포인트 1)");
        }

        System.out.println("--------------------");

        // 삭제
        map.remove("두부");
        System.out.println(map.get("두부"));

        System.out.println("--------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        }

        System.out.println("--------------------");

        // 재방문
        map.put("두부", 10);
        map.put("팡이", 5);
        map.put("모찌", 3);
        map.put("꺽정이", 15);

        // 순회 (Key)
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("--------------------");

        // 순회 (Value)
        for (int value : map.values()) {
            System.out.println(value);
        }

        System.out.println("--------------------");

        // 순회 (Key & Value)
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("--------------------");

        map.put("모찌", 10);
        map.put("모찌", 30);
        map.put("모찌", 50); // 값(Value)만 업데이트

        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("--------------------");

//        HashMap<String, Integer> map2 = new HashMap<>(); // 순서 보장 X
        HashMap<String, Integer> map2 = new LinkedHashMap<>(); // 순서 보장 O

        map2.put("두부", 10);
        map2.put("팡이", 5);
        map2.put("모찌", 3);
        map2.put("꺽정이", 15);

        for (String key : map2.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map2.get(key));
        }
    }
}
