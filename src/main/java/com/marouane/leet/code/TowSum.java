package com.marouane.leet.code;

import java.util.HashMap;

public class TowSum {


    public static int[] twoSum(int[] nums, int target) {
        var result  = new int[]{0,0};
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (map.containsKey(n)){
                result = new int[]{map.get(n), i};
                break;
            }
            map.put(nums[i], i );
        }
        return result;
    }
}
