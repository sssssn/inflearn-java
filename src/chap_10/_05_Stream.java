package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 : 데이터 흐름, 일회성 (매번 새롭게 만들어야 함)

        // 스트림 생성
        // (방법 1) Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);// Arrays.stream(scores); -> CTRL + ALT + V

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // (방법 2) Collection.stream()
        List<String> langList = new ArrayList<>();
//        langList.add("python");
//        langList.add("java");
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#"); // 리스트 생성과 동시에 값 정의
        // System.out.println(langList.size()); // 6
        Stream<String> langListStream = langList.stream();

        // (방법 3) Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip, ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90점 이상인 점수
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
//        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("--------------------");

        // 90점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("--------------------");

        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("--------------------");

        // 90점 이상인 점수들의 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("--------------------");

        // "python", "java", "javascript", "c", "c++", "c#"
        // c 로 시작하는 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("--------------------");

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("--------------------");

        // 4글자 이하인 언어들의 정렬
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("--------------------");

        // 4글자 이하인 언어 중 c 라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("--------------------");

        // 4글자 이하인 언어 중 c 라는 글자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("--------------------");

        // 3글자 이하인 언어 중 c 라는 글자를 포함하는 언어가 모두 있는지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 3)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("--------------------");

        // 4글자 이하인 언어 중 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자 추가
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + " (어려워요)")
                .forEach(System.out::println);
        System.out.println("--------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 변경
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("--------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStartsWithC.stream().forEach(System.out::println);
    }
}
