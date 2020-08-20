/*
Given an array of n distinct elements and a number x, arrange array elements
according to the absolute difference with x, i. e., an element having a minimum
difference comes first, and so on.
Note: 1. If two or more elements are at equal distance arrange them in the same
sequence as in the given array.
2. You are allowed to use only array data structure.
Examples :
Input : arr[] : x = 7, arr[] = {10, 5, 3, 9, 2}
Output : arr[] = {5, 9, 10, 3, 2}
Explanation:
7 - 10 = 3(abs)
7 - 5 = 2
7 - 3 = 4
7 - 9 = 2(abs)
7 - 2 = 5
So according to the difference with X,
elements are arranged as 5, 9, 10, 3, 2.
Input : x = 6, arr[] = {1, 2, 3, 4, 5}
Output : arr[] = {5, 4, 3, 2, 1}
Input : x = 5, arr[] = {2, 6, 8, 3}
Output : arr[] = {6, 3, 2, 8}
 */
import java.util.Arrays;
import java.util.Comparator;

public class SortByAbsoluteDifference {
    public static void main(String[] str){
        int arr[] = {10, 5, 3, 9, 2};
        int x = 7;
        System.out.println("array element before rearrangement = " + Arrays.toString(arr));
        int twoDimensionArray[][] = absoluteDifferenceSort(arr, x);
        for(int i=0; i<twoDimensionArray.length; i++)
            System.out.print(" " + twoDimensionArray[i][0]);

        System.out.println(" ");
    }
    /*
    Efficient Solution
    Time complexity: O(n*log(n))
    Space complexity: O(n)
     */
    public static int[][] absoluteDifferenceSort(int[] arr, int x){
        // create 5*2 2D array
        int auxArray[][] = new int[arr.length][2];

        for(int i=0; i<arr.length; i++){
            auxArray[i][0] = arr[i];
            auxArray[i][1] = Math.abs(arr[i]-x);
        }

        // sort the array based on abs value
        sortByColumn(auxArray, 1);

        return auxArray;
    }

    public static void sortByColumn(int twoDArr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(twoDArr, new Comparator<int[]>() {

            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2) {

                // To sort in descending order revert
                // the '>' Operator
                if (entry1[col] > entry2[col])
                    return 1;
                else
                    return -1;
            }
        });  // End of function call sort().
    }
}
