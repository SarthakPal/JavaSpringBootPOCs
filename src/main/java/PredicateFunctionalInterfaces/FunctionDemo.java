package PredicateFunctionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String args[])
    {
        Function<Integer, Integer> sqaure = i -> i*i;
        System.out.println("Square of 5:"+sqaure.apply(5));
    }

}
