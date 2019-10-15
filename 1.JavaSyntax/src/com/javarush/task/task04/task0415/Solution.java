package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        isTriangle(a, b, c);

    }

    public static void isTriangle(int a, int b, int c) {
        String mes = "Треугольник существует.";
        if (a >= (b + c))
            mes = "Треугольник не существует.";
        if (b >= (a + c))
            mes = "Треугольник не существует.";
        if (c >= (a + b))
            mes = "Треугольник не существует.";
        System.out.println(mes);
    }
}