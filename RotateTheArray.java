import java.util.Arrays;

/*
Question: how to rotate the array k times?
 */
public class RotateTheArray {
    public static void main(String[] str){
        int arr[] = {1,2,3,4,5,6};
        System.out.println("array before rotation" + Arrays.toString(arr));
        rotateArrayBruteForce(arr,3);
        System.out.println("array after rotation (brute force)" + Arrays.toString(arr));

        int anotherArr[] = {1,2,3,4,5,6};
        rotateArrayOptimalSolution(anotherArr,3);
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
        int i = 0;
        int j = arr.length-k-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        i = arr.length-k;
        j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }

        // now reverse the entire array
        i = 0;
        j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void swap(int[] arr, int x, int y){
        arr[x] = arr[x] + arr[y];
        arr[y] = arr[x] - arr[y];
        arr[x] = arr[x] - arr[y];
    }
}
