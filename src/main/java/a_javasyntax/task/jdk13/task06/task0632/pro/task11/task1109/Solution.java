package a_javasyntax.task.jdk13.task06.task0632.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
