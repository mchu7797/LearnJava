package lesson42;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {
        System.out.println("2020E8534 추민석");
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit을 입력하면 종료합니다.");
        while (true) {
            System.out.print(">>");
            String text = scanner.nextLine();

            if (text.equals("exit")) {
                break;
            }
        }

        System.out.println("종료합니다...");

        scanner.close();
    }

}
