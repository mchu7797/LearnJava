package lesson42;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {
        System.out.println("2020E8534 �߹μ�");
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit�� �Է��ϸ� �����մϴ�.");
        while (true) {
            System.out.print(">>");
            String text = scanner.nextLine();

            if (text.equals("exit")) {
                break;
            }
        }

        System.out.println("�����մϴ�...");

        scanner.close();
    }

}
