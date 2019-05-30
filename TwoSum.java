import java.util.*;
public class TwoSum {
    public static void main(String[] args) {

    int[] a=new int[]{5,12,6,8,1,3};
    int[] arr=twoSum(a,13);
    System.out.println(arr[0]+","+arr[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
}