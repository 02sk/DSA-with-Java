public class LargestInArray {
    public static void largestNumber(int num[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < num.length; i++) {
           if(num[i]>largest ){
            largest = num[i];
           }
        }
        System.out.println("The largest number in the array is " + largest);
    }

    public static void main(String[] args) {
        int[] numbers = {23, 33, 12, 1, 233};  

        largestNumber(numbers);
    }

}
