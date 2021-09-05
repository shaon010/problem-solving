package leetcode_tecognize.part2_x1_recursion.chapter6.recursion;

public class Factorial {
    private int factorial(int number) {
        if (number < 2) {
            return number;
        }
        return number * factorial(number-1);
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().factorial(5));
    }
}
