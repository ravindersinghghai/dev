import java.util.ArrayList;
import java.util.List;


public class DiamondOperatorTypeInference {

    public static void main(String[] args) throws Exception {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(Integer.valueOf(3));
        integers.add(Integer.valueOf(4));
        List<String> list = new ArrayList(integers);
        System.out.println(list);
    }
}

// Ref: http://stackoverflow.com/questions/14909875/why-diamond-operator-is-used-for-type-inference-in-java-7
/*
This is part of an improvement to Java Generics in Java 7.
Before you would have had to write

final List<String> list = new ArrayList<String>();
Now you can write

final List<String> list = new ArrayList<>();
Which is equivalent - the compiler will work it out for you. This is not the same as

final List list = new ArrayList();
Which is an untyped List.

* */