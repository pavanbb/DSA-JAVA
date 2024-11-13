
import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {

        FindTheDuplicateNumber duplicateFinder = new FindTheDuplicateNumber();
        // Example array
        int[] array = {64, 25, 25, 22, 11, 100};
        duplicateFinder.findDuplicate(array);

    }

    public int findDuplicate(int[] nums) {
        Set<Integer> newArrayDetails = new HashSet<>();
        for (int i : nums) {
            if (!newArrayDetails.add(i)) {
                return i;
            }

        }
        return 0;
    }
}
