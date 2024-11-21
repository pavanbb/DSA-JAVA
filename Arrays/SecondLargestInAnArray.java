package Arrays;

public class SecondLargestInAnArray {

    public static void main(String[] args) {

        // Create an array
        int[] arr = {1, 2, 2, 4, 5, 7};
        SecondLargestInAnArray secondLargestInAnArray = new SecondLargestInAnArray();
        // Directly call the static method
        int ans = secondLargestInAnArray.getSecondLargest(arr);

        // Output the result
        System.out.println(ans);

    }

    public int getSecondLargest(int[] arr) {
        // Check if the array has fewer than 2 elements
        if (arr.length < 2) {
            return -1;
        }

        // Initialize max and secondMax with the smallest possible integer value
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                // Update secondMax before max
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        // If secondMax was never updated, return -1
        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }

    @Override
    public String toString() {
        return "SecondLargestInAnArray []";
    }
}
