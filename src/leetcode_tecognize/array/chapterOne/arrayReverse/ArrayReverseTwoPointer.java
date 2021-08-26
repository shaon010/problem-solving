package leetcode_tecognize.array.chapterOne.arrayReverse;

public class ArrayReverseTwoPointer {
    public char[] reverseArray(char[] charArray) {
        int length = charArray.length;
        int j = length - 1;
        for (int i = 0; i < j; i++) {
            char iChar = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = iChar;
            j--;
        }
        return charArray;
    }
    public static void main(String[] args) {
        ArrayReverseTwoPointer arrayReverseTwoPointer = new ArrayReverseTwoPointer();
        String input = "Hello";
        String input2 = "Amir";
        System.out.println(arrayReverseTwoPointer.reverseArray(input.toCharArray())); // olleH
        System.out.println(arrayReverseTwoPointer.reverseArray(input2.toCharArray())); // rimA
    }
}
