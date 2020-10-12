package lesson43;

public class ReturnArray {
    static int[] makeArray() {
        int[] temp = new int[4];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println("2020E8534 추민석");

        int intArray[];
        intArray = makeArray();

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
