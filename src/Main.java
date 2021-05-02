import java.util.Scanner;

import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(in)) {

            System.out.println("Введите число:   ");
            int a = scanner.nextInt();
            out.println("Введите сравниваемое число:   ");
            int b = scanner.nextInt();


            double mn = 0;
            double m = 0;

            mn = a - (a*0.1);
            m = a + (a*0.1);
            if (b >= mn && b <= m) {
                out.println("Сравниваемое число в пределах 10%:  ");
            } else {
                out.println("Сравниваемое число не в пределах 10%:  ");
            }
        }
    }
}
