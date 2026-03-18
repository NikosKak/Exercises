//Small script that checks if a user given string is a palindrome
import java.util.Scanner;
public class Palindrome {
        public static void main(String[] args) {
            System.out.println("Please give a word");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            if(isPalindrome(s)){
                System.out.println("It is");
            }else{
                System.out.println("It isn't");
            }
        }
        public static boolean isPalindrome(String s) {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString().equals(s);
        }
}
