package Arrays;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        Sort sorting = new Sort();
        // Example array
        int[] array = {64, 25, 25, 22, 11, 100};
        sorting.sortColors(array);
        Arrays.stream(array)
                .forEach(System.out::println);

    }

    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) { // Correct the condition here
                    // Swap nums[i] and nums[j]
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }

}
