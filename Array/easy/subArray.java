public class subArray {
    public static void subArray(int arr[]) {
        // 2, 4, 6, 8, 10
        // 2
        // 2,4
        // 2,4,6
        // 2,4,6,8
        // 2,4,6,8,10
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currSum = 0;
                System.out.print("(");

                 for (int k = i; k <= j; k++) {
                    currSum = currSum + arr[k];
                    System.out.print(arr[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                }

                System.out.print(")");
                System.out.print(" Sum = " + currSum);
                System.out.println();

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum Sum = " + maxSum);
    }


    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        subArray(arr);
    }
}
