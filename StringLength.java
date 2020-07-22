public class StringLength {
    public static void main(String[] str){
        String word = "hello";
        System.out.print("length of string = " + stringLength(word));
    }

    public static int stringLength(String input){
        // when we reach end of the string
        if(input.equals("")) return 0;

        // next call we have to drop the current letter
        return 1 + stringLength(input.substring(1));
    }
}
