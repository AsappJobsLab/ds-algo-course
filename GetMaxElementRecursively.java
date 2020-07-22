public class GetMaxElementRecursively {

    public static void main(String[] str){
        int[] arr = {10, 33, 144, 2, 9, 84};
        int size = arr.length;
        System.out.println("Max element = " + getMax(arr, size));
    }

    public static int getMax(int[] input, int size){
        // when only 1 element. its max element, return
        if(size == 1) return input[0];

        int maxValue = getMax(input, size - 1);

        return Integer.max(input[size - 1], maxValue);
    }
}
