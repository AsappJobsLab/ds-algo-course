import java.util.Arrays;

public class ProductOfArrayImprovedVersion {
    public static void main(String[] str){
        int arr[] = {1,2,3,0,5};
        System.out.println("array element before method call = " + Arrays.toString(arr));
        findProductImprovedVersion(arr);
        System.out.println("array element after method call = " + Arrays.toString(arr));
    }

    /*
    Brute force approach.
    Time complexity: O(n)
    Space complexity: O(1)
     */
    public static void findProductImprovedVersion(int[] arr){
        int prod = 1;
        int countZero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                countZero++;
                continue;
            }
            prod = prod * arr[i];
        }


        for(int i=0; i<arr.length; i++){
            if(countZero > 1)
                arr[i] = 0;
            else if(countZero == 1)
                arr[i] = arr[i] == 0? prod: 0;
            else
                arr[i] = prod / arr[i];
        }

    }
}
