class QuickSort {
  public static void main(String[] args) {
    int[] arr = {5, 2, 6, 1, 7, 4};
    quickSort(arr, 0, arr.length - 1);

    for (int e : arr) {
      System.out.print(e + " ");
    }
  }

  private static void quickSort(int[] arr, int left, int right) {
    // Do swaps around a partition and get the index partitioned around
    int index = partition(arr, left, right);

    // Sort the left half
    if (left < index - 1) {
      quickSort(arr, left, index - 1);
    }

    // Sort the right half
    if (right > index) {
      quickSort(arr, index, right);
    }
  }

  private static int partition(int[] arr, int left, int right) {
    // Get the pivot element
    int pivot = arr[(left + right) / 2];

    while (left <= right) {
      // Find an element on the left that should be on the right
      while (arr[left] < pivot) left++;

      // Find an element on the right that should be on the left
      while (arr[right] > pivot) right--;

      // Swap elements, and move left and right indices
      if (left <= right) {
        // Swap elements
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;

        // Move indices
        left++;
        right--;
      }
    }

    return left;
  }
}