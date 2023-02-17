package a_javasyntax.task.jdk13.task06.task0632.pro.task15.task1528;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/* 
task1528
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileOutputStream output = new FileOutputStream(scanner.nextLine())) {
            byte[] bytes = new byte[]{106, 97, 118, 97};
            output.write(bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}