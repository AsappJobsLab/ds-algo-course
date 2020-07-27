import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] str){
        int arr[] = {3,5,4,1,2};
        System.out.println("array element before sorting = " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("array element after sorting = " + Arrays.toString(arr));
    }
    /*
    Bubble sort.
    Time complexity: O(n*n) // worst case, average case, best case
    Space complexity: O(1)
     */
    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]) swap(arr,j,j+1);
            }
        }
    }

    public static void swap(int[] arr, int x, int y){
        arr[x] = arr[x] + arr[y];
        arr[y] = arr[x] - arr[y];
        arr[x] = arr[x] - arr[y];
    }
}
