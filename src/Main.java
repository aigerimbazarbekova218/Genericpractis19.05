import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Generic<String, Integer> nameAge = new Generic<>("Aigerim", 25);
        System.out.println(nameAge);
        ArrayList<String> integers = new ArrayList<>();
        integers.add("a");
        integers.add("b");
        nameAge.genericMethod(integers);


    }

    public <A> void method(ArrayList<A> list) {
        for (A a : list) {
            System.out.println(a);
        }




      Generic1.method1(new Number[]{1,2,3,4,5,6,7,8,9});
        System.out.println(Generic1.method2(new Comparable[]{1,2,3,4,5,6,7,8,9}));

    }


}