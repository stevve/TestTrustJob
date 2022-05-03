package SortDemon;

public class Example {
    int[] array = new int[]{};
    private static void sort(Comparable[] a) {
    }
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }




    public static void main(String[] args) {

    }
}
