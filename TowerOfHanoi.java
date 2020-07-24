public class TowerOfHanoi {

    public static void main(String[] str){
        int coins = 3;
        moves(3, 'S', 'D', 'A');
    }

    public static void moves(int n, char s, char d, char a){
        if(n == 1) {
            System.out.println("move coin 1 from " + s + " to " + d);
            return;
        }

        moves(n-1, s, a, d);
        System.out.println("move coin " + n + " from " + s + " to " + d);
        moves(n-1, a, d, s);
    }
}
