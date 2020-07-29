import java.util.Arrays;

public class MergeSort {
    public static void main(String[] str){
        int arr[] = {3,5,4,1,2,6};
        System.out.println("array element before sorting = " + Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("array element after sorting = " + Arrays.toString(arr));
    }
    /*
    Merge sort.
    Time complexity: O(nlogn) // worst case, average case, best case
    Space complexity: O(n) // while merging we need to create temp array of size n
     */
    public static void mergeSort(int[] arr, int leftIndex, int rightIndex){
        if(leftIndex < rightIndex){
            int midIndex = leftIndex + (rightIndex - leftIndex)/2;
            mergeSort(arr, leftIndex, midIndex);
            mergeSort(arr, midIndex+1, rightIndex);
            merging(arr,leftIndex,midIndex,rightIndex);
        }
    }

    public static void merging(int[] arr, int left, int mid, int right) {
        // Step 1. find the size of the leftArray and rightArray
        int leftArraySize = mid - left + 1;
        int rightArraySize = right - mid;

        /* Step 2. Create 2 temp arrays */
        int leftTempArray[] = new int[leftArraySize];
        int rightTempArray[] = new int[rightArraySize];

        /* Step 3. Copy leftArray element to leftTempArray
        and rightArray element to rightTempArray */
        for (int i = 0; i < leftArraySize; ++i)
            leftTempArray[i] = arr[left + i];
        for (int j = 0; j < rightArraySize; ++j)
            rightTempArray[j] = arr[mid + 1 + j];

        /* Step 4. Merge the temp arrays */
        int i = 0, j = 0;
        int k = left;
        while (i < leftArraySize && j < rightArraySize) {
            if (leftTempArray[i] <= rightTempArray[j]) {
                arr[k] = leftTempArray[i];
                i++;
            }
            else {
                arr[k] = rightTempArray[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of leftTempArray if any */
        while (i < leftArraySize) {
            arr[k] = leftTempArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of rightTempArray if any */
        while (j < rightArraySize) {
            arr[k] = rightTempArray[j];
            j++;
            k++;
        }
    }
}
