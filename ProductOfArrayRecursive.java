import java.util.Arrays;
public class ProductOfArrayRecursive {
    public static void main(String[] str){
        int arr[] = {1,2,3,4,5};
        System.out.println("array element before method call = " + Arrays.toString(arr));
        findProduct(arr, 1, 0);
        System.out.println("array element after method call = " + Arrays.toString(arr));
    }
    /*
    Brute force approach.
    Time complexity: O(n)
    Space complexity: O(n) // due to recursive call
     */
    public static int findProduct(int[] arr, int prodLeft, int index){
        if( index >= arr.length) {
            return 1;
        }

        int currentValue = arr[index];
        int productTillCurrentIndex = currentValue * prodLeft;
        int productOfElementsRightOfCurrentIndex = findProduct(arr, productTillCurrentIndex, index + 1);

        arr[index] = prodLeft * productOfElementsRightOfCurrentIndex;
        return currentValue * productOfElementsRightOfCurrentIndex;
    }
}
