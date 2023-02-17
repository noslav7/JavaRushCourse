package a_javasyntax.task.jdk13.task06.task0632.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = " любит меня.";
        String name = scanner.nextLine();
        int i = 0;
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }
    }
}
