package PredicateFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateFunctionDemo {

    public static void main(String args[])
    {
        String str = "I am Sarthak Pal Sharma";
        PredicateFunctionDemo predicateFunctionDemo = new PredicateFunctionDemo();
        System.out.println(predicateFunctionDemo.testStringLength(str));

        Predicate<String> checkLength = s -> s.length()>=5;
        System.out.println(checkLength.test(str));
    }

    public boolean testStringLength(String s)
    {
        if(s.length()>=5)
        {
            return true;
        }
        else {
            return false;
        }
    }



}
