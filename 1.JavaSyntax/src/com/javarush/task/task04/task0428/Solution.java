package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        countPositive(i1, i2, i3);

    }

    public static void countPositive(int i1, int i2, int i3) {
        int count = 0;
        if (i1 > 0) count++;
        if (i2 > 0) count++;
        if (i3 > 0) count++;
        System.out.println(count);
    }
}
