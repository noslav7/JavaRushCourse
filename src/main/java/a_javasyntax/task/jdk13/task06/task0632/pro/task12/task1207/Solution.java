package a_javasyntax.task.jdk13.task06.task0632.pro.task12.task1207;

/* 
Какое число меньше
*/

public class Solution {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (Boolean.TRUE.equals(isLess)) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Первое число больше или равно второму числу");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second;
    }
}
