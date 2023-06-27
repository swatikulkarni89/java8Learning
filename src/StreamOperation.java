import java.util.List;

import static java.lang.Long.sum;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,5,7,3,9,8);
        int sumOfSquers =numbers.stream().map(x->x*x).reduce(0,Integer::sum);
        System.out.println(sumOfSquers);
        int sumOfEvenNumbersSquere =numbers.stream().filter(x->x%2==0).map(x->x*x).reduce(0,Integer::sum);
        System.out.println(sumOfEvenNumbersSquere);
        int sumOfOddNumbersSquere =numbers.stream().filter(x->x%2!=0).map(x->x*x).reduce(0,Integer::sum);
        System.out.println(sumOfOddNumbersSquere);
    }
}
