/*
Question: find out how many times a sorted array has been rotated?
 */

public class RotationalSearch {
    public static void main(String[] str){
        int arr[] = {5,6,7,8,1,2,3,4};
        System.out.println("How many times rotated? (linear way) = " + findHowManyTimesRotatedLinearWay(arr));
        System.out.println("How many times rotated? (binary search way) = " + findHowManyTimesRotatedBinaryWay(arr));
    }
    /*
    Linear Way (Not an optimal solution).
    Time complexity: O(n)
    Space complexity: O(1)
     */
    public static int findHowManyTimesRotatedLinearWay(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return i+1;
            }
        }
        return -1;
    }

    /*
    Binary Search Way(optimal solution).
    Time complexity: O(log(n))
    Space complexity: O(1)
     */
    public static int findHowManyTimesRotatedBinaryWay(int[] arr){
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while(leftIndex <= rightIndex){
            int midIndex = leftIndex + (rightIndex - leftIndex)/2;
            if(arr[midIndex] < arr[midIndex-1] && arr[midIndex] < arr[midIndex+1]){
                return midIndex;
            }else if(arr[midIndex] > arr[0]){
                leftIndex = midIndex + 1;
            }else{
                rightIndex = midIndex - 1;
            }
        }

        return -1;
    }
}
