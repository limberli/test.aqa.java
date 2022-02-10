import java.util.Locale;
import java.util.Scanner;
public class MainTest2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String str;
        while (!(str = keyboard.nextLine()).equals("quit")) {
            if(str.equals("Вячеслав")){
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("нет такого имени");
            }
        }
    }
}

