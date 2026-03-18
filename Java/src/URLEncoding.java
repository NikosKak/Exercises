import java.util.Scanner;
//Small script that replaces every empty space
//in a user given string with "%20"
public class URLEncoding {
        public static void main(String[] args) {
            System.out.println("Please give a word");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(urlEncoding(s));
        }
        public static String urlEncoding(String s) {
            StringBuilder sb = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (ch == ' ') {
                    sb.append("%20");
                } else sb.append(ch);
            }

            return sb.toString();
        }
}
