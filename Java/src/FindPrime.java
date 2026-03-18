import java.util.*;
//Small script where the user gives a number and learns if it is prime or not
public class FindPrime {
    public static void main(String[] args) {
        System.out.println("Give number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        System.out.printf("Num: %d, is %s", num, (isPrime(num) ? "prime" : "not prime\n" ));
        System.out.println("Do you want to continue? [y/n]");
        String answer = sc.next();
        while (answer.equals("y")){
            System.out.println("Give an another number");
            num=sc.nextInt();
            System.out.printf("Num: %d, is %s", num, (isPrime(num) ? "prime" : "not prime\n" ));
            System.out.println("Do you want to continue? [y/n]");
            answer = sc.next();
        }
    }
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
