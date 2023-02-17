package a_javasyntax.task.jdk13.task06.task0632.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int height = 0;
        int width = 0;
        while (height < 11) {
            while (width < 20 && height == 0) {
                System.out.print("Б");
                width++;
            }
            width = 0;
            while (width < 20 && height > 0 && height < 10) {
                if (width == 0) {
                    System.out.print("Б");
                }
                if (width > 0 && width < 19) {
                    System.out.print(" ");
                }
                if (width == 19) {
                    System.out.println("Б");
                }
                width++;
            }
            width = 0;
            while (width < 20 && height == 10) {
                System.out.print("Б");
                width++;
            }
            width = 0;
            height++;
        }
    }
}