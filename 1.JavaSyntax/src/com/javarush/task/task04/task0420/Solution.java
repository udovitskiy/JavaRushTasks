package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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
        sort(i1, i2, i3);
    }

    public static void sort(int a, int b, int c) {
        int a1 = a;
        int b1 = b;
        int c1 = c;
        int temp;

        for (int i = 0; i < 2; i++) {
            if (a1 < b1) {
                temp = a1;
                a1 = b1;
                b1 = temp;
            }
            if (b1 < c1) {
                temp = b1;
                b1 = c1;
                c1 = temp;
            }
        }

        System.out.println(a1 + " " + b1 + " " + c1);
    }
}
