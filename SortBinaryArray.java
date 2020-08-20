/*
We are given an array of 0s and 1s in random order. Segregate 0s on the left side and 1s on the right side of the array. Traverse array only once.
Examples:
Input :  arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
Output : arr[] = [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

Input :  arr[] = [1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1]
Output : arr[] = [0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1]

 */
import java.util.Arrays;

public class SortBinaryArray {
    public static void main(String[] str){
        int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        System.out.println("array before sorting = " + Arrays.toString(arr));
        sortBinaryArray(arr);
        System.out.println("array after sorting = " + Arrays.toString(arr));
    }

    /*
    Efficient Solution
    Time complexity: O(n)
    Space complexity: O(1)
     */
    public static void sortBinaryArray(int[] a){
        int leftIndex = 0;
        int rightIndex = a.length - 1;
        while(leftIndex < rightIndex){
            while(a[leftIndex] != 1) leftIndex++;
            while(a[rightIndex] != 0) rightIndex--;
            if(leftIndex < rightIndex){
                // swap values
                a[leftIndex] = a[leftIndex] + a[rightIndex];
                a[rightIndex] = a[leftIndex] - a[rightIndex];
                a[leftIndex] = a[leftIndex] - a[rightIndex];
            }
        }
    }
}
