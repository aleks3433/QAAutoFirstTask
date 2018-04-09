package java_tasks;

public class EvenNumbers {

    public static int number;

    public static void main(String args[]) {
        printEvenNumbers();
    }

    public static void printEvenNumbers() {
        for (number = 1; number <= 100; ++number) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

    }
}
