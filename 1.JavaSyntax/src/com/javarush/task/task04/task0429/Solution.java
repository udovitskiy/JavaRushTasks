package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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
        countPositiveNegative(i1, i2, i3);

    }

    public static void countPositiveNegative(int i1, int i2, int i3) {
        int countP = 0;
        int countN = 0;

        if (i1 > 0) countP++;
        else if (i1 < 0) countN++;

        if (i2 > 0) countP++;
        else if (i2 < 0) countN++;

        if (i3 > 0) countP++;
        else if (i3 < 0) countN++;

        System.out.println("количество отрицательных чисел: " + countN);
        System.out.println("количество положительных чисел: " + countP);
    }
}
