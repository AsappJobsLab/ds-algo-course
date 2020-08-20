import java.util.Arrays;

public class QuickSort {
    public static void main(String[] str){
        int arr[] = {3,5,4,1,2,6};
        System.out.println("array element before sorting = " + Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("array element after sorting = " + Arrays.toString(arr));
    }
    /*
    Quick sort.
    Time complexity: O(nlogn) // average case, best case
    Time complexity: O(n*n) // worst case
    Space complexity: O(1) // in-place sorting
     */
    public static void quickSort(int[] arr, int leftIndex, int rightIndex){
        if(leftIndex < rightIndex){
            int pivotIndex = findPivot(arr, leftIndex, rightIndex);
            quickSort(arr, leftIndex, pivotIndex-1);
            quickSort(arr, pivotIndex+1, rightIndex);
        }
    }

    // 1. here we are taking the last element as pivot element.
    // 2. but performance could be O(n*n) in worse case.
    // 3. design a good algo to select pivot element (pivot element somewhere in
    // the middle of the array could have better performance).
    // 4. take all smaller element towards left side of the pivot element and
    // bigger one to the right.
    public static int findPivot(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left-1; // index of smaller element
        for (int j=left; j<right; j++){
            if (arr[j] < pivot){
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[right] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        return i+1;
    }
}
