
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] stringArray = {"banana", "apple", "pear"};

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(1);
        intList.add(9);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("zebra");
        stringList.add("dog");
        stringList.add("cat");

        sort(array);
        sort(stringArray);
        sortIntegers(intList);
        sortStrings(stringList);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(intList);
        System.out.println(stringList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
