package a_javasyntax.task.jdk13.task06.task0632.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
