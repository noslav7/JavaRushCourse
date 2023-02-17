package a_javasyntax.task.jdk13.task06.task0632.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        String letter = "Q";
        int height = 0;
        int width = 0;
        while (height < 5) {
            while (width < 10) {
                System.out.print(letter);
                width++;
            }
            System.out.println();
            height++;
            width = 0;
        }
    }
}