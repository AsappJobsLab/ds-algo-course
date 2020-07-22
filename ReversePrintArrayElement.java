public class ReversePrintArrayElement {

    public static void main(String[] str){
        int[] arr = {10, 33, 144, 2, 9, 84};
        int size = arr.length;
        printReverse(arr, size);
    }

    public static void printReverse(int[] input, int size){
        // crossed the first element of an array
        // or array is empty
        if(size == 0) return;

        System.out.print(input[size - 1] + " ");

        printReverse(input, size-1);
    }
}
