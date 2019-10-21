package zk.questionOne;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * @author zhukangrong
 * @date 2019-10-09
 */
public class SumTwoNumber {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffs = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(null != diffs.get(diff)){
                return new int[]{diffs.get(diff), i};
            }else {
                diffs.put(nums[i], i);
            }
        }
        throw new RuntimeException("没有找到符合条件的数");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 11};
        int target = 9;
        System.out.println(Arrays.toString(new SumTwoNumber().twoSum(nums, target)));
    }
}
