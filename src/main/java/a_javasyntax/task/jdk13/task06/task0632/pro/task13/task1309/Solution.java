package a_javasyntax.task.jdk13.task06.task0632.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
       grades.put("Ярочкин", 4.5);
       grades.put("Малков", 4.8);
       grades.put("Шилков", 4.5);
       grades.put("Яна", 3.5);
       grades.put("Староста", 4.5);
    }
}
