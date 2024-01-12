import java.util.Map;
import java.util.Collections;
import java.util.List;

public class App {

    /**
     * A shocking quiz.
     */
    public static void main(String[] args) {
        System.out.println("What is the minimum of the following doubles? Can you guess!");
        List<Double> doubleList = List.of(Double.NaN, 1D, 2D, 3D, -1D, -2D);
        System.out.println("The minimum element - as returned by Collections.min() method - is " + Collections.min(doubleList));
        System.out.println("Did you correctly anticipate the actual result? Did you find the actual result awkward or unexpected?");
    }

    /**
     * For a certain user input(s) the function/method enters an infinite loop.
     * This is an intentional bug, do not fix it.
     * Instead, write a *failing* junit test case to demonstrate the bug.
     *
     * @param input a double value
     */
    public static void infiniteLoop(double input) {
        if (Double.isInfinite(input)) {
            for (; ; ) ; // this is dangerous
        }
    }

    /**
     * Increment the frequency of a given key by one in a count/frequency map using wildcards.
     *
     * @param map the frequency map, keys can be any Enum (built-in or custom), values are Integer.
     * @param key any Enum type should work.
     */
    static void incrementCountMapWildcards1(Map<Enum<?>, Integer> map, Enum<?> key) {
        map.merge(key, 1, Integer::sum);
    }

    static <E extends Enum<E>> void incrementCountMapGenerics1(Map<Enum<E>, Integer> map, Enum<E> key) {
        map.merge(key, 1, Integer::sum);
    }


    static void incrementCountMapWildcards2(Map<Enum<?>, Integer> map, Enum<?> key) {
        // Implement the method using wildcards
    }

    static <E extends Enum<E>> void incrementCountMapGenerics2(Map<Enum<E>, Integer> map, Enum<E> key) {
        // Implement the method using type parameters
    }

    static void incrementCountMapWildcards3(Map<Enum<?>, Integer> map, Enum<?> key) {
        // Implement the method using wildcards
    }

    static <E extends Enum<E>> void incrementCountMapGenerics3(Map<Enum<E>, Integer> map, Enum<E> key) {
        // Implement the method using type parameters
    }

    static void incrementCountMapWildcards4(Map<Enum<?>, Integer> map, Enum<?> key) {
        // Implement the method using wildcards
    }

    static <E extends Enum<E>> void incrementCountMapGenerics4(Map<Enum<E>, Integer> map, Enum<E> key) {
        // Implement the method using type parameters
    }

    static void methodName1() {
        // Implement the method
    }

    static void methodName2() {
        // Implement the method
    }

    static void methodName3() {
        // Implement the method
    }

    static void methodName4() {
        // Implement the method
    }
}

