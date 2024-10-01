public class Selectionsort {

    // Selection sort algorithm
    public int[] selectionSortnumbers(int values[]) {
        for (int i = 0; i < values.length - 1; i++) {
            int minValue = i;  // Assume the current index is the minimum

            for (int j = i + 1; j < values.length; j++) {  // Find the actual minimum in the unsorted part
                if (values[j] < values[minValue]) {
                    minValue = j;  // Update the index of the minimum value
                }
            }

            // Swap the minimum value with the current element
            int temp = values[minValue];
            values[minValue] = values[i];
            values[i] = temp;
        }

        return values;  // Return the sorted array
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Selectionsort sorter = new Selectionsort();  // Create an instance of the Main class
        
        // Example array to sort
        int[] array = {64, 25, 12, 22, 11,100};
        
        // Call the selectionSort method
        int[] sortedArray = sorter.selectionSortnumbers(array);
        
        // Print the sorted array
        System.out.println("Sorted Array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
