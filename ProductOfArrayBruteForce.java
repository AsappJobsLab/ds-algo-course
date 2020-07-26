import java.util.Arrays;

public class ProductOfArrayBruteForce {
    public static void main(String[] str){
        int arr[] = {1,2,3,4,5};
        System.out.println("array element before method call = " + Arrays.toString(arr));
        arr = findProductBruteForce(arr);
        System.out.println("array element after method call = " + Arrays.toString(arr));
    }

    /*
    Brute force approach.
    Time complexity: O(n*n)
    Space complexity: O(n)
    method will be returning a new array;
     */
    public static int[] findProductBruteForce(int[] arr){
        int prod;
        int[] result = new int[]{0,0,0,0,0};
        for(int i=0; i<arr.length; i++){
            prod = 1;
            for(int j=0; j<arr.length; j++){
                if(j!=i) prod = prod * arr[j];
            }

            result[i] = prod;
        }

        return result;
    }
}
