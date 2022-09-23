package PredicateFunctionalInterfaces;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String args[])
    {
        String str = "I am Sarthak Pal Sharma";

        Predicate<String> checkLength = s -> s.length()>=5;
        System.out.println(checkLength.test(str));

        Predicate<String> checkEvenLength = s -> s.length()%2==0;
        System.out.println(checkLength.test(str));

        System.out.println("after merging with and "+checkLength.and(checkEvenLength).test(str));
        System.out.println("after merging with or "+checkLength.or(checkEvenLength).test(str));
    }

}
