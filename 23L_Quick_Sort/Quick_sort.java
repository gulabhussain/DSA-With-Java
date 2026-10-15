public class Quick_sort {

public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;

            // Swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    i++;

    // Correct pivot swap
    int temp = arr[i];
    arr[i] = arr[high];
    arr[high] = temp;

    return i;
}

public static void main(String[] args) {
    int[] arr = {38, 27, 43, 3, 9, 82, 10};
    int n = arr.length;

    System.out.println("Original array:");
    for (int num : arr) {
        System.out.print(num + " ");
    }

    System.out.println();

    quickSort(arr, 0, n - 1);

    System.out.println("Sorted array:");
    for (int num : arr) {
        System.out.print(num + " ");
    }
}


}
