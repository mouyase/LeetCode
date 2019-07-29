package tech.yojigen.leetcode.Problem0001;

import java.util.HashMap;
import java.util.Map;

public class Problem {
    public static void main(String[] args) {
        new Solution().twoSum(new int[]{2, 7, 11, 15,}, 9);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("没有结果");
    }
}