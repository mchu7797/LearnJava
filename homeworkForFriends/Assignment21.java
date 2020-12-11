package homeworkForFriends;

import java.util.Scanner;

public class Assignment21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int word = 0;
        int isWord = 0;

        System.out.print("Input the string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                if (isWord == 0) {
                    word++;
                    isWord = 1;
                }
            } else {
                if (isWord == 1) {
                    isWord = 0;
                }
            }
        }

        System.out.println("Number of words in the string: " + word);
        
        scanner.close();
    }
}
