package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());
        int i3 = Integer.parseInt(reader.readLine());
        int i4 = Integer.parseInt(reader.readLine());
        max(i1, i2, i3, i4);

    }

    public static void max(int a, int b, int c, int d) {
        int max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        if (max < d)
            max = d;

        System.out.println(max);

    }
}
