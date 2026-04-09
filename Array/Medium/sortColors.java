public class sortColors {
  // Brute force
  public static void sort(int nums[]) {
  int c0 = 0;
  int c1 = 0;
  int c2 = 0;
  int n = nums.length;

  for (int i = 0; i < n; i++) {
  if (nums[i] == 0) {
  c0++;
  } else if (nums[i] == 1) {
  c1++;
  } else {
  c2++;
  }
  }
  
  int j = 0;
  while (c0 > 0) {
  nums[j] = 0;
  j++;
  c0--;
  }
  while (c1 > 0) {
  nums[j] = 1;
  j++;
  c1--;
  }
  while (c2 > 0) {
  nums[j] = 2;
  j++;
  c2--;
  }
  }

  // optimal approach
  // public static void sort(int nums[]) {

  // }

  public static void main(String[] args) {
    int nums[] = { 0, 2, 1, 1, 0 };
    sort(nums);
    for (int i : nums) {
      System.out.print(i + " ");
    }

  }
}
