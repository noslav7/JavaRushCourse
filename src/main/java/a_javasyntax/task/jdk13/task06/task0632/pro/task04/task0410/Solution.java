package a_javasyntax.task.jdk13.task06.task0632.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int countInts = 0;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            countInts++;
            if (x < min) {
                min = x;
            } else if (x < min2 && x > min) {
                min2 = x;
            }
        }
        if (countInts < 2) {
            System.exit(400);
        }
        System.out.println(min2);
    }
}