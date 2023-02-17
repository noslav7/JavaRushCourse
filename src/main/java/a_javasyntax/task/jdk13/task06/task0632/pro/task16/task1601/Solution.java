package a_javasyntax.task.jdk13.task06.task0632.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(20, Calendar.SEPTEMBER, 1982);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int i = date.getDay();
        String res = switch (i){
            //switch (i) {
            case 0 -> "воскресенье";
            case 1 ->  "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            default -> null;};
        return res;
    }
}
