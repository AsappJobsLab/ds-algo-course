/*
Given an array of integers, print the array in such a way that the first element is
first maximum, and second element is the first minimum and so on.
Examples :
Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
Output : 7 1 6 2 5 3 4
Input : arr[] = {1, 6, 9, 4, 3, 7, 8, 2}
Output : 9 1 8 2 7 3 6 4
 */

import java.util.Arrays;

public class ArrayRearrangement {
    public static void main(String[] str){
        int arr[] = {7, 1, 2, 3, 4, 5, 6, 9, 8};
        System.out.println("array element before rearrangement = " + Arrays.toString(arr));
        minMaxSortBruteForce(arr);
        System.out.println("array element after rearrangement = " + Arrays.toString(arr));

        int anotherArr[] = {7, 1, 2, 3, 4, 5, 6};

        System.out.println("array element before rearrangement = " + Arrays.toString(anotherArr));
        System.out.print("array element after rearrangement = ");
        minMaxSortBestApproach(anotherArr);
        System.out.println(" ");
    }
    /*
    Brute Force Approach
    Time complexity: O(n*n)
    Space complexity: O(1)
     */
    public static void minMaxSortBruteForce(int[] arr){
        int maxIndex, minIndex;

        for(int i=0; i<arr.length; i++){
            maxIndex = i;
            minIndex = i;
            for(int j=i; j<arr.length; j++){
                if(i%2 == 0){
                    if(arr[j] > arr[maxIndex]) maxIndex = j;
                }else{
                    if(arr[j] < arr[minIndex]) minIndex = j;
                }
            }

            if(i%2 == 0){
                if(arr[i] < arr[maxIndex]){
                    arr[i] = arr[i] + arr[maxIndex];
                    arr[maxIndex] = arr[i] - arr[maxIndex];
                    arr[i] = arr[i] - arr[maxIndex];
                }
            }else{
                if(arr[i] > arr[minIndex]){
                    arr[i] = arr[i] + arr[minIndex];
                    arr[minIndex] = arr[i] - arr[minIndex];
                    arr[i] = arr[i] - arr[minIndex];
                }
            }

        }
    }

    /*
    Optimal Approach
    Time complexity: O(n*log(n))
    Space complexity: O(1)
     */
    public static void minMaxSortBestApproach(int[] arr){
        // first sort the array
        // merge sort: time complexity n*log(n)
        Arrays.sort(arr);

        // use two pointer approach
        int j = arr.length - 1;
        int i = 0;

        while(i <= j){
            if(i == j) System.out.print(" " + arr[j--]);
            else System.out.print(" " + arr[j--] + " " + arr[i++]);
        }
    }
}
