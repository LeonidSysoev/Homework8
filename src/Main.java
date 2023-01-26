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
}