package a_javasyntax.task.jdk13.task06.task0632.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String word = scanner.nextLine();
            if (word.equals("enough")) {
                break;
            }
            System.out.println(word);
            }
        }
    }