/*
You have given an array which contains 1 to n element, your task is to sort this
array in an efficient way and without replacing with 1 to n numbers.
Examples :
Input : arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
Output : 1 2 3 4 5 6 7 8 9 10
 */
import java.util.Arrays;

public class SortFirstNNaturalNumber {
    public static void main(String[] str){
        int arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
        System.out.println("array before sorting = " + Arrays.toString(arr));
        sortNNaturalNumber(arr);
        System.out.println("array after sorting = " + Arrays.toString(arr));
    }

    /*
    Efficient Solution
    Time complexity: O(n)
    Space complexity: O(1)
     */
    public static void sortNNaturalNumber(int[] a){
        for(int i=0; i<a.length; i++){
            a[i] = i+1;
        }
    }
}
