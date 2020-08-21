import java.util.Arrays;

/*
Question: how to rotate the array k times?
 */
public class RotateTheArray {
    public static void main(String[] str){
        int arr[] = {1,2,3,4,5,6};
        System.out.println("array before rotation" + Arrays.toString(arr));
        rotateArrayBruteForce(arr,2);
        System.out.println("array after rotation (brute force)" + Arrays.toString(arr));

        int anotherArr[] = {1,2,3,4,5,6};
        rotateArrayOptimalSolution(anotherArr,1);
        System.out.println("array after rotation (optimal solution)" + Arrays.toString(anotherArr));
    }
    /*
    Brute force approach.
    Time complexity: O(n*k)
    Space complexity: O(1)
     */
    public static void rotateArrayBruteForce(int[] arr, int k){
        for(int i=0; i<k; i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }

    /*
    Optimal solution.
    1. there are two sub-array. in first sub array reverse first n-k element.
    and in second sub array reverse last k elements (use two pointer approach by swapping)
    2. reverse entire array.
    Time complexity: O(n)
    Space complexity: O(1)
     */
    public static void rotateArrayOptimalSolution(int[] arr,  int k){
        // reverse first n-k element
        reverseFun(arr, 0, arr.length-k-1);

        // reverse last k element
        reverseFun(arr, arr.length-k, arr.length-1);

        // reverse entire array
        reverseFun(arr, 0, arr.length-1);
    }

    public static void swap(int[] arr, int x, int y){
        arr[x] = arr[x] + arr[y];
        arr[y] = arr[x] - arr[y];
        arr[x] = arr[x] - arr[y];
    }

    public static void reverseFun(int[] a, int left, int right){
        while(left<right){
            swap(a,left,right);
            left++;
            right--;
        }
    }
}
