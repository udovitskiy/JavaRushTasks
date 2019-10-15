package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        equalPairOfNumbers(i1, i2, i3);
    }

    public static void equalPairOfNumbers(int i1, int i2, int i3) {
        if (i1 == i2) {
            System.out.print(i1 + " " + i2);
            if (i1 == i3)
                System.out.print(" " + i3);
        } else {
            if (i1 == i3)
                System.out.print(i1 + " " + i3);
            if (i2 == i3)
                System.out.print(i2 + " " + i3);
        }
    }
}