package com.javarush.task.task04.task0424;

/* 
Три числа
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
        getNumber(i1, i2, i3);

    }

    public static void getNumber(int a, int b, int c) {
        if (a == b) {
            System.out.println(3);
        } else {
            if (a == c)
                System.out.println(2);
            if (b == c)
                System.out.println(1);
        }

    }
}
