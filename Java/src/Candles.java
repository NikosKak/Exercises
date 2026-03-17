import java.util.*;
//A small script where the user enters the height of
// each candle and gets a count of the tallest ones.
public class Candles {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Do you want to give numbers [y/n]");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        while (answer.equals("y")){
            System.out.println("Give number");
            int num = sc.nextInt();
            sc.nextLine();
            arr.add(num);
            System.out.println("Do you want to give an another number:[y/n];");
            answer = sc.nextLine().trim();
            if (answer.equals("n")){
                break;
            }
        }
        System.out.println(candlesCount(arr));
    }
    public static long candlesCount(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;
        int max = arr.stream().mapToInt(Integer::intValue).max().orElse(0);
        return arr.stream().filter(c -> c == max).count();
    }
}