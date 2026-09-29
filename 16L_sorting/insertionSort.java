public class insertionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {7, 8, 3, 1, 2};

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;

            // Shift elements greater than current
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place current at correct position
            arr[j + 1] = current;
        }

        printArray(arr);
    }
}