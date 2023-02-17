package b_javacore.task34.task3411;

import java.lang.reflect.Field;

/* 
Приватный родитель
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Child child = Child.class.getDeclaredConstructor().newInstance();
        System.out.println(child.getPrivateField());
        setPrivateParentField(child, "privateField", "новая строка");
        System.out.println(child.getPrivateField());
    }

    public static void setPrivateParentField(Object childObject, String fieldName, Object value) throws Exception {
        Field privateField = childObject.getClass().getSuperclass().getDeclaredField(fieldName);
        privateField.setAccessible(true);
        privateField.set(childObject, value);
    }
}
