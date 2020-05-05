package winwink.javaTutorial;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        Dog dog = new Dog("kelly");
        dog.barking();

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        VectorTest.printArray(list.toArray());
    }
}
