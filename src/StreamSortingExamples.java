import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingExamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 5, 7, 3, 9, 8);
        List<String> courses = List.of("java", "angular", ".net", "spring", "spring boot", "c", "c++");
        numbers.stream().sorted().forEach(System.out::print);
        System.out.println(" ");
        numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::print);
        System.out.println(" ");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println(" ");
        courses.stream().sorted().forEach(System.out::println);

        List<Integer> sqaureOfNumbers = numbers.stream().map(number -> number * number).collect(Collectors.toList());
        System.out.println(sqaureOfNumbers);
        List<Integer> sqaureOfEvenNumbers = numbers.stream().filter(x -> x % 2 == 0).map(number -> number * number).collect(Collectors.toList());
        System.out.println(sqaureOfEvenNumbers);
        List<Integer> sqaureOfOddNumbers = numbers.stream().filter(x -> x % 2 != 0).map(number -> number * number).collect(Collectors.toList());
        System.out.println(sqaureOfOddNumbers);

        List<Integer> lengthOfCorses = courses.stream().map(courseLength -> courseLength.length()).collect(Collectors.toList());
        System.out.println(lengthOfCorses);

    }
}
