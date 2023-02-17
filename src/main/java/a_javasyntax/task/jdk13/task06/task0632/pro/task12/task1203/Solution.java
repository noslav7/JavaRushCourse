package a_javasyntax.task.jdk13.task06.task0632.pro.task12.task1203;

/* 
Сравнение чисел
*/

public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
