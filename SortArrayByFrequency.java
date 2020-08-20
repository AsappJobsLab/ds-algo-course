/*
Print the elements of an array in the decreasing frequency if 2 numbers have the same frequency then print the one which came first.
Note: You are allowed to use only array data structure
Examples:
Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}

 */
import java.util.Arrays;

public class SortArrayByFrequency {
    public static void main(String[] str){
        int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
        System.out.println("array before sorting = " + Arrays.toString(arr));
        sortArrayByFrequency(arr);
        System.out.println("array after sorting = " + Arrays.toString(arr));
    }

    /*
    Efficient Solution
    Time complexity: O(n*log(n))
    Space complexity: O(n)
     */
    public static void sortArrayByFrequency(int[] a){
        if(a.length == 0 || a.length == 1) return;

        // first sort the array
        Arrays.sort(a);

        // scan the sorted array and constructed the 2D array
        int uniqueElementCount = 1;
        int counter = 1;
        for(int i=0;i<a.length-1;i++){
            if(a[i] != a[i+1]) uniqueElementCount++;
        }

        int auxArray[][] = new int[uniqueElementCount][2];
        for(int i=0,j=0;i<a.length-1;i++){
            if(a[i] == a[i+1]) counter++;
            else{
                auxArray[j][0] = a[i];
                auxArray[j][1] = counter;
                counter = 1;    
                j++;
            }
        }
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
