/*
Question 5:
There are two sorted arrays. The first one is of size m+n containing only m
elements. Another one is of size n and contains n elements. Merge these two
arrays into the first array of size m+n such that the output is sorted.
Input: array with m+n elements (mPlusN[]).
NA => Value is not filled/available in array mPlusN[]. There should be n such array
blocks.
Input: array with n elements (N[]).
Output: N[] merged into mPlusN[] (Modified mPlusN[])

For Example:
Input: A1: {1,3,5,7,-1,-1,-1} A2:{2,4,6}
Output A1: {1,2,3,4,5,6,7}
 */
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] str){
        int a1[] = {1,3,5,7,-1,-1,-1};
        int a2[] = {2,4,6};
        System.out.println("array a1 before merging = " + Arrays.toString(a1));
        mergeTwoSortedArray(a1,a2);
        System.out.println("array a1 after merging with a2 = " + Arrays.toString(a1));
    }

    /*
    Efficient Solution
    Time complexity: O(n)
    Space complexity: O(1)
     */
    public static void mergeTwoSortedArray(int[] arrA, int[] arrB){
        // reach till last element of arrA
        int indexA = 0;
        int indexB = arrB.length-1;
        int arrAIndex = arrA.length-1;
        for(int i=0; i<arrA.length; i++){
            if(arrA[i] == -1){
                indexA = i-1;
                break;
            }
        }

        while(indexB >= 0){
            if(arrA[indexA] > arrB[indexB]){
                arrA[arrAIndex] = arrA[indexA];
                indexA--;
            }else{
                arrA[arrAIndex] = arrB[indexB];
                indexB--;
            }
            arrAIndex--;
        }
    }
}
