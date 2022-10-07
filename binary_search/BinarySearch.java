package binary_search;

public class BinarySearch {

    private static int[] numberArray = {1, 2, 3, 5, 7, 9, 12, 15, 22, 25, 29, 34, 36, 38, 42, 47, 48, 51, 52, 53, 58, 60};
    private static int target = 12;

    public static void main(String[] args) {
        findTargetNumber(numberArray, target);
    }

    public static void findTargetNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int middle = (int) Math.floor((start + end) / 2);
            if(target == arr[middle]) {
                System.out.println("Found target at index " + middle);
                return;
            }
            if(target < arr[middle]) {
                System.out.println("Searching left side of Array");
                end = middle - 1;
            }
            if(target > arr[middle]) {
                System.out.println("Searching right side of array");
                start = middle + 1;
            }
        }
        System.out.println("Did not find target number " + target + " in Array.");
    }
}
