package lesson42;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {
        System.out.println("2020E8534 占쌩민쇽옙");
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit占쏙옙 占쌉뤄옙占싹몌옙 占쏙옙占쏙옙占쌌니댐옙.");
        while (true) {
            System.out.print(">>");
            String text = scanner.nextLine();

            if (text.equals("exit")) {
                break;
            }
        }

        System.out.println("占쏙옙占쏙옙占쌌니댐옙...");

        scanner.close();
    }

}
