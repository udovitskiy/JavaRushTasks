package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        checkNumber(i);
    }

    public static void checkNumber(int i) {
        String s = i % 2 == 0 ? "четное " : "нечетное ";

        if (i >= 1 && i <= 999) {
            if (i < 10)
                System.out.println(s + "однозначное число");
            if (i >= 10 && i < 100)
                System.out.println(s + "двузначное число");
            if (i >= 100)
                System.out.println(s + "трехзначное число");
        }
    }
}
