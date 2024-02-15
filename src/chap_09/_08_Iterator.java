package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터 (커서)
        List<String> list = new ArrayList<>();
//        List<String> list2 = new LinkedList<>(); // 리스트 인터페이스에서 제공해주는 메서드는 동일하게 사용

        // 추가
        list.add("두부");
        list.add("(알 수 없음)");
        list.add("팡이");
        list.add("(알 수 없음)");
        list.add("모찌");
        list.add("(알 수 없음)");
        list.add("꺽정이");
        list.add("(알 수 없음)");
        list.add("선녀");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------");

        Iterator<String> it = list.iterator(); // list.iterator(); -> CTRL + ALT + V
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("--------------------");

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------");

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove(); // 삭제
            }
        }

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------");

        HashSet<String> set = new HashSet<>();

        set.add("두부");
        set.add("팡이");

        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println("--------------------");

        HashMap<String, Integer> map = new HashMap<>();

        map.put("두부", 10);
        map.put("팡이", 5);

//        map.iterator(); // 에러 (제공되지 않음)

        // 순회 (Key)
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        System.out.println("--------------------");

        // 순회 (Value)
        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("--------------------");

        // 순회 (Key & Value)
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
