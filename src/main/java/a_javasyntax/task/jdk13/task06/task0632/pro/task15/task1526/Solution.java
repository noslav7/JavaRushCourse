package a_javasyntax.task.jdk13.task06.task0632.pro.task15.task1526;

import java.io.FileReader;
import java.util.Scanner;

/* 
task1526
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
        FileReader reader = new FileReader(scanner.nextLine())) {
            while (reader.ready()) {
                char ch = (char) reader.read();
                if (ch != ' ' && ch != '.' && ch != ',') {
                    System.out.print(ch);
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
