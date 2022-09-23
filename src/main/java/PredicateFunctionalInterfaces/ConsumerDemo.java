package PredicateFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String args[])
    {
        ConsumerDemo consumerDemo = new ConsumerDemo();
        consumerDemo.squareInt(5);

        Consumer<Integer> squareMe = i ->  System.out.println("Square : "+i*i);
        squareMe.accept(5);
    }

    public void squareInt(int i)
    {
        int square = i*i;
        System.out.println("Squared no is:"+square);
    }

}
