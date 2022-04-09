package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
       int []nums = {2,11,8,15};
       int target = 9;
        Arrays.stream(getTwoSum(nums, target)).forEach(System.out::println);
    }
    public static int[] getTwoSum(int[]nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =   0; i <nums.length ; i++) {
            int delta = target-nums[i];
            if(map.containsKey(delta)){
                return new int[]{map.get(delta),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
