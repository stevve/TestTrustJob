package day430;

import java.util.*;

public class leetcode2248 {
    public static void main(String[] args) {
        int[][] array = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(array));
    }

    public static List<Integer> intersection(int[][] nums) {
        int row = nums.length;
        int col = nums[0].length;
        Map<Integer,Integer> counts = new HashMap<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0;j < nums[i].length; j++){
                if (counts.containsKey(nums[i][j])) {
                    counts.put(nums[i][j], counts.get(nums[i][j])+1);
                } else {
                    counts.put(nums[i][j], 1);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> res : counts.entrySet()) {
            if(res.getValue() == row) {
                result.add(res.getKey());
            }
        }

        Collections.sort(result);
        return result;

    }
}
