package a_javasyntax.task.jdk13.task06.task0632.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String exitWord;
        while (!(exitWord = scanner.nextLine()).equals("ENTER")) {
            int value = Integer.parseInt(exitWord);
            sum += value;
        }
        System.out.println(sum);
    }
}