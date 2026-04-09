public class SingleNumber {
  // Brute force
  // public static int singleNumber(int[] nums) {
  // int n = nums.length;

  // for (int i = 0; i < n; i++) {
  // int num = nums[i];
  // int count = 0;

  // for (int j = 0; j < n; j++) {
  // if (nums[j] == num) {
  // count++;
  // }
  // }

  // if (count == 1) {
  // return num;
  // }
  // }

  // return -1;
  // }

  // optimize aaproach
  public static int singleNumber(int[] nums) {

    int n = nums.length;
    int xor = 0;
    for (int i = 0; i < n; i++) {
      xor = xor ^ nums[i];
    }
    return xor;
  }

  public static void main(String[] args) {
    int[] nums = { 1,1,556, 2, 2, 3, 3 };
    System.out.println(singleNumber(nums));

  }
}
