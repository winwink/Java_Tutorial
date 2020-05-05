package winwink.javaTutorial;

public class VectorTest {
    public static <E> void printArray(E[] inputArray)
    {
        for(E element : inputArray){
            System.out.println(element);
        }
        System.out.println();
    }
}
