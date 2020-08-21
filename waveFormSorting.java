/*
Given an unsorted array of integers, sort the array into a wave like array. An array
‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >=
.....
Examples:
Input: arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR
{20, 5, 10, 2, 80, 6, 100, 3} OR
any other array that is in wave form

Input: arr[] = {20, 10, 8, 6, 4, 2}
Output: arr[] = {20, 8, 10, 4, 6, 2} OR
{10, 8, 20, 2, 6, 4} OR
any other array that is in wave form

Input: arr[] = {2, 4, 6, 8, 10, 20}
Output: arr[] = {4, 2, 8, 6, 20, 10} OR

any other array that is in wave form

Input: arr[] = {3, 6, 5, 10, 7, 20}
Output: arr[] = {6, 3, 10, 5, 20, 7} OR

any other array that is in wave form
 */
import java.util.Arrays;
public class waveFormSorting {
    public static void main(String[] str){
        int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
        System.out.println("array element before rearrangement = " + Arrays.toString(arr));
        SimpleWaveFormSorting(arr);
        System.out.println("array element after rearrangement = " + Arrays.toString(arr));

        int anotherArr[] = {20, 10, 8, 6, 4, 2};
        System.out.println("array element before rearrangement = " + Arrays.toString(anotherArr));
        EfficientWaveFormSorting(anotherArr);
        System.out.println("array element after rearrangement = " + Arrays.toString(anotherArr));
    }

    /*
    Simple Solution
    Time complexity: O(n*log(n))
    Space complexity: O(1)
     */
    public static void SimpleWaveFormSorting(int[] tempArr){
        if(tempArr.length == 0 || tempArr.length == 1) return;

        // First sort the array
        Arrays.sort(tempArr);

        // swap all adjacent elements
        for(int i=0; i<tempArr.length-1; i=i+2){
            tempArr[i] = tempArr[i] + tempArr[i+1];
            tempArr[i+1] = tempArr[i] - tempArr[i+1];
            tempArr[i] = tempArr[i] - tempArr[i+1];
        }
    }

    /*
    Efficient Solution
    Time complexity: O(n)
    Space complexity: O(1)
     */
    public static void EfficientWaveFormSorting(int[] tempArr){
        if(tempArr.length == 0 || tempArr.length == 1) return;

        // check only in odd position and see the condition arr[i-1] >= arr[i] <= arr[i+1]
        // swap adjacent elements if not satisfying the condition
        for(int i=1; i<tempArr.length; i=i+2){
            if (i>0 && tempArr[i-1] < tempArr[i] ){
                tempArr[i-1] = tempArr[i-1] + tempArr[i];
                tempArr[i] = tempArr[i-1] - tempArr[i];
                tempArr[i-1] = tempArr[i-1] - tempArr[i];
            }

            if (i<tempArr.length - 1 && tempArr[i] > tempArr[i+1] ){
                tempArr[i] = tempArr[i] + tempArr[i+1];
                tempArr[i+1] = tempArr[i] - tempArr[i+1];
                tempArr[i] = tempArr[i] - tempArr[i+1];
            }
        }
    }
}
