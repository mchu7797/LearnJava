package middle_report;

public class MySort {
    public static void bubbleSort(int[] array) {
        int temp;

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != (array.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void showPhoneStats(int[] phoneArray) {
        int[] numbers = new int[10];

        for (int i = 0; i < phoneArray.length; i++) {
            numbers[phoneArray[i]]++;
        }

        System.out.println("-- 전화번호 분석 결과 --");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println("'" + i + "' : " + numbers[i] + "개");
            }
        }
    }

    public static void main(String[] args) {
        int[] myPhone = { 0, 1, 0, 3, 1, 6, 9, 8, 0, 7, 7 };

        System.out.println("-- 정렬 이전 --");
        printArray(myPhone);
        System.out.println("-- 정렬 이후 --");
        bubbleSort(myPhone);
        printArray(myPhone);
        showPhoneStats(myPhone);
        System.out.println("-- 2020E8534 추민석 --");
    }
}
