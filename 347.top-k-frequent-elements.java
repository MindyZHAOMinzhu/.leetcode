import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyNum = new HashMap<>();

        for(int num: nums){
            frequencyNum.put(num, frequencyNum.getOrDefault(num, 0) + 1);

        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int key: frequencyNum.keySet()){
            int frequency = frequencyNum.get(key);

            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        List<Integer> topK = new ArrayList<>();

        for(int i = buckets.length - 1;i>=0 && topK.size() < k;i--){

            // System.out.print(buckets);
            if(buckets[i] == null){
                continue;
            }

            if(buckets[i].size() <= (k - topK.size())){
                topK.addAll(buckets[i]);
            }else{
                topK.addAll(buckets[i].subList(0, k - topK.size()));
            }
        }

        int[] array = topK.stream().mapToInt(i->i).toArray();
        return array;
    }
}
// @lc code=end

