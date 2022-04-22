package day423;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Component {
    static List<List<Integer>> result = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        help(4, 2, 1);
        System.out.println(result.toString());
    }

    private static void help(int n, int k,int step) {
        if (path.size() == k) {
            // 复制数组，不new的话为res添加为null
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = step; i <= n; i++) {
            path.add(i);
            help(n, k, i + 1);
            path.removeLast();
        }
    }
}
