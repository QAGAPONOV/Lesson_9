import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void Stream() {
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> ALL = new ArrayList<String>();
        System.out.println("Введите имя: ");
        while (true) {
            System.out.print("имя = ");
            s = scanner.nextLine();
            if (s.equals("")==true)
                break;
            ALL.add(s);
        }
        System.out.println();
        System.out.println("ALL = " + ALL);
        System.out.println("count = ");
    }
    public static void main(String[] args) {
        Stream();
    }
}
