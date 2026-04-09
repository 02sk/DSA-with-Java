import java.util.HashMap;

public class TwoSum {
  // BruteForce
  // public static int[] twoSum(int nums[], int k) {
  // int size = nums.length;
  // for (int i = 0; i < size; i++) {
  // for (int j = i + 1; j < size; j++) {
  // if (nums[i] + nums[j] == k) {
  // return new int[] { i, j };
  // }
  // }
  // }
  // return new int[] { -1, -1 };
  // }

  // optimal approach
  public static int[] twoSum(int nums[], int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int current = nums[i];
      int needed = k - current;

      if (map.containsKey(needed)) {
        return new int[] { map.get(needed), i };
      }
      else {
        map.put(current, i);
      }
    }
    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    int[] nums = { 3, 4, 2, 6 };
    int k = 8;
    int[] result = twoSum(nums, k);
    System.out.println(result[0] + "," + result[1]);
  }

}
