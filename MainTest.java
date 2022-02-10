import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String str;
        while (!(str = keyboard.nextLine()).equals("quit")) {
            try {
                long number = new Long(str);
                if (number > 7) {
                    System.out.println("Привет");
                }
            } catch (Exception e) {
                System.out.println(str + " -  не число");
            }
        }
    }
}
