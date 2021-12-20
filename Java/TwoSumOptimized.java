import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSumArray = new int[2];
        HashMap<Integer, Integer> values = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (values.containsKey(key)) {
                twoSumArray[0] = values.get(key);
                twoSumArray[1] = i;
                break;
            } else {
                values.put(nums[i], i);
            }   
        }
        return twoSumArray;
    }
}