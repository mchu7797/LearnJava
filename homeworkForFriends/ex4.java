package homeworkForFriends;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input an integer: ");
        String abc = scanner.nextLine();
        byte[] data = abc.getBytes();
        
        int digits = 0;
        
        for (int i = 0; i < data.length; i++)
        {
            digits += data[i] - 48;
        }
        
        System.out.println("The sum of the digits is: " + digits);
        
        scanner.close();
    }
}