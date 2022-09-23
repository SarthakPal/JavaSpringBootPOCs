package StreamsPOC;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String args[])
    {
        //Stream Of Integers
        Stream<Integer> streamOne = Stream.of(1,2,3,4,5,6,7,8,9);
        streamOne.forEach(p -> System.out.println(p));

        System.out.println("----------------------------------------------------------------");

        //Stream Of Arrays
        Stream<Integer> streamTwo = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        streamTwo.forEach(p -> System.out.println(p));

        System.out.println("----------------------------------------------------------------");

        //Stream Of List
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));

        System.out.println("----------------------------------------------------------------");

        //Stream generate
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));

        randomNumbers.limit(20).forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

        //Stream of chars
        IntStream streamThree = "12345_abcdefg".chars();
        streamThree.forEach(p -> System.out.println(p));
        System.out.println("----------------------------------------------------------------");
        Stream<String> streamFour = Stream.of("A$B$C".split("\\$"));
        streamFour.forEach(p -> System.out.println(p));

        System.out.println("----------------------------------------------------------------");

        //Stream Filter
        List<Integer> listOne = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            listOne.add(i);
        }
        Stream<Integer> streamFive = list.stream();
        List<Integer> evenNumbersList = streamFive.filter(i -> i%2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbersList);

        System.out.println("----------------------------------------------------------------");

        //Stream Map
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

        //Stream Sorted
        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

        //Stream Match
        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);     //true
        matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);     //false
        matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);     //false

        System.out.println("----------------------------------------------------------------");

        //Stream Count
        long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();
        System.out.println(totalMatched);

        System.out.println("----------------------------------------------------------------");

        //Stream Reduce
        Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);

        System.out.println("----------------------------------------------------------------");

        //Stream anyMatch
        boolean matched = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));
        System.out.println(matched);

        System.out.println("----------------------------------------------------------------");

        //Stream findFirst
        String firstMatchedName = memberNames.stream()
                .filter((s) -> s.startsWith("S"))
                .findFirst()
                .get();
        System.out.println(firstMatchedName);

        System.out.println("----------------------------------------------------------------");

        //Parallel Stream
        List<Integer> listTwo = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            listTwo.add(i);
        }
        //Here creating a parallel stream
        Stream<Integer> streamSix = list.parallelStream();

        Integer[] evenNumbersArr = streamSix.filter(i -> i%2 == 0).toArray(Integer[]::new);
        for(int i=0;i<evenNumbersArr.length;i++)
        {
            System.out.println(evenNumbersArr[i]+" ");
        }

        System.out.println("----------------------------------------------------------------");

    }

}
