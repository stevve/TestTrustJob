package day430;

import java.util.*;

public class leetcode347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i],1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();


        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((o1, o2) -> o1.getValue() - o2.getValue());

        for (Map.Entry<Integer, Integer> entry : entries) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        for (int i = 0; i < pq.size(); i++){
            result[i] = pq.poll().getKey();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k =2;
        leetcode347 lt = new leetcode347();

        int[] res = lt.topKFrequent(nums, k);

        System.out.println(Arrays.toString(res));

    }
}
