import java.util.*;
//Small script that the user gives a number and gets the sequence up to the nth number in the fibonacci sequence
public class Fibonacci {
    public static void main(String[] args) {
    System.out.println("Please give number");
    Scanner sc = new Scanner(System.in);
    Integer num =sc.nextInt();
    for(int i=0;i<=num;i++){
        System.out.print(fibonacci(i)+" ");
    }
    }
    public static int fibonacci(int n) {
        int a = 0;int b = 1;int fibo = 1;
        if (n < 0) throw new IllegalArgumentException("N cannot be negative");
        if (n == 0) return a;
        if (n == 1) return b;
        for (int i = 2; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }
        return fibo;
    }

}
