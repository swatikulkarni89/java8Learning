import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        List<Integer> numbers=List.of(10,11,45,72,63,8,6);
        System.out.println("even number");
        printEvenNumber(numbers);
        System.out.println("now odd number");
        printOddNumber(numbers);
        List<String> courses=List.of("java","angular",".net","spring","spring boot","c","c++");
       // printAllCourses(courses);
        courseHavingSpring(courses);
        courseHavingBigName(courses);
        cubeOfNumbers(numbers);
        nuberOfCharsInEachCourse(courses);
    }

    private static void nuberOfCharsInEachCourse(List<String> courses) {
        Consumer<Integer> println = System.out::println;
        Function<String, Integer> stringIntegerFunction = noOfChar -> noOfChar.length();
        courses.stream()
                .map(stringIntegerFunction)//
                .forEach(println);
    }

    private static void cubeOfNumbers(List<Integer> numbers) {
        numbers.stream()
                .map(number->number*number*number)
                .forEach(System.out::println);
    }

    private static void courseHavingBigName(List<String> courses) {
        courses.stream()
                .filter(course->course.length()>=4)
                .forEach(System.out::println);
    }

    private static void courseHavingSpring(List<String> courses) {
        String spring="Spring";
        courses.stream()
                .filter(course->course.contains("spring"))
                .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }


    private static void printOddNumber(List<Integer> numbers) {
        numbers.stream()
                .filter(number->number%2!=0)
                .forEach(System.out::println);

    }

    private static void printEvenNumber(List<Integer> numbers) {

        numbers.stream()
                .filter(number->number%2==0)
                .forEach(System.out::println);
    }

}