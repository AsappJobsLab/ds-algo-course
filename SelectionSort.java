import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] str){
        int arr[] = {3,5,4,1,2};
        System.out.println("array element before sorting = " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("array element after sorting = " + Arrays.toString(arr));
    }
    /*
    Selection sort.
    Time complexity: O(n*n) // worst case, average case, best case
    Space complexity: O(1)
    Comparision: O(n)
     */
    public static void selectionSort(int[] arr){
        int minIndex;
        for(int i=0; i<arr.length; i++){
            minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            if(minIndex != i)
                swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int x, int y){
        arr[x] = arr[x] + arr[y];
        arr[y] = arr[x] - arr[y];
        arr[x] = arr[x] - arr[y];
    }
}
