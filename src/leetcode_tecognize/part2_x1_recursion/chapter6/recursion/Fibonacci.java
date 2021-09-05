package leetcode_tecognize.part2_x1_recursion.chapter6.recursion;

public class Fibonacci {
    int number = 0;
    int prevNumber = 0;
    boolean firstNumber = true;
    private int printFibonacciForLength(int maxLength) {
        int currentFibonacciNumber = 0;
        if (firstNumber) {
            System.out.print(currentFibonacciNumber);
            prevNumber = number;
            number = 1;
            --maxLength;
            if (maxLength >= 2) {
                System.out.print(1);
                --maxLength;
            }
            firstNumber = false;
        }
        if (maxLength >= 1) {
            currentFibonacciNumber = number + prevNumber;
            System.out.print(currentFibonacciNumber);
            prevNumber = number;
            number = currentFibonacciNumber;
            return printFibonacciForLength(--maxLength);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        new Fibonacci().printFibonacciForLength(5);
    }
}
