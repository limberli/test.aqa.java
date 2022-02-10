import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest3 {
    public static void main(String[] args) {
        List<Long> array = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String str;
        while (!(str = keyboard.nextLine()).equals("quit")) {
            try {
                array.add(Long.parseLong(str));
            } catch (NumberFormatException e) {
                System.out.println(str + " -  не число");
            }
        }
        for (long number : array) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
