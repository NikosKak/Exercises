import java.util.*;
public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("Give number of steps");
            num = sc.nextInt();
            if (num<=0){
                System.out.println("Number os steps must be positive please try again");
            }else{
                break;
            }
        }
        printStair(num);
    }
    public static void printStair(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}