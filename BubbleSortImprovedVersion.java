import java.util.Arrays;

public class BubbleSortImprovedVersion {
    public static void main(String[] str){
        int arr[] = {3,5,4,1,2};
        System.out.println("array element before sorting = " + Arrays.toString(arr));
        bubbleSortImprovedVersion(arr);
        System.out.println("array element after sorting = " + Arrays.toString(arr));
    }
    /*
    Bubble sort.
    Time complexity: O(n*n) // worst case, average case
    Time complexity: O(n) // if already sorted or nearly sorted
    Space complexity: O(1)
     */
    public static void bubbleSortImprovedVersion(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            boolean isAlreadySorted = true;
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    isAlreadySorted = false;
                    swap(arr,j,j+1);
                }
            }

            if(isAlreadySorted) break;
        }
    }

    public static void swap(int[] arr, int x, int y){
        arr[x] = arr[x] + arr[y];
        arr[y] = arr[x] - arr[y];
        arr[x] = arr[x] - arr[y];
    }
}
