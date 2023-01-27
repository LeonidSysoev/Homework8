import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array = generateRandomArray();
        int expense = 0;
        for (int i : array) {
            expense += i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма трат за месяц составила " + expense + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array = generateRandomArray();
        int maxExpense = -1;
        int minExpense = 2000001;
        for (final int current : array) {

            if (maxExpense < current) {
                maxExpense = current;
            }
            if (minExpense > current) {
                minExpense = current;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальная трата за день составила " + maxExpense + " рублей. " +
                "Минимальная трата за день составила " + minExpense + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array = generateRandomArray();
        int expense = 0;
        for (int i : array) {
            expense += i;
        }
        float mediumExpense = (float) expense / array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("Средняя сумма трат за месяц составила " + mediumExpense + " рублей.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}