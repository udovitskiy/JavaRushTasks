package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        printNumber(Integer.parseInt(reader.readLine()));
    }

    public static void printNumber(int i) {
        if (i > 0)
            System.out.println(i * 2);
        else if (i < 0)
            System.out.println(++i);
        else
            System.out.println(i);
    }
}