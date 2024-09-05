package task4;

public class Task4C {
    public static void main(String[] args) {
        System.out.println(max(3213, 5323));
    }

    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}
