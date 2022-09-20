package lambdaPOC;

public class Lambda {

    public static void main(String[] args) {
        int width=10;

        //with lambda
        Drawable d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();

        Addable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

    }

}
