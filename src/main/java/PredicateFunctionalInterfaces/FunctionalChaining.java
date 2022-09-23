package PredicateFunctionalInterfaces;

import java.util.function.Function;

public class FunctionalChaining {

    public static void main(String args[])
    {
        Function<Integer, Integer> doubleIt = i->i*i;
        System.out.println("Double Function:"+doubleIt.apply(2));

        Function<Integer, Integer> cube =i->i*i*i;
        System.out.println("Double Function:"+cube.apply(2));

        System.out.println("First double using apply "+doubleIt.andThen(cube).apply(2));
        System.out.println("First cubing using compose "+doubleIt.compose(cube).apply(2));

    }

}
