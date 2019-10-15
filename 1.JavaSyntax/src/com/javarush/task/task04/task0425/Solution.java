package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(getQuadrant(a, b));
    }

    public static int getQuadrant(int a, int b) {
        if (a > 0 && b > 0)
            return 1;
        else if (a < 0 && b > 0)
            return 2;
        else if (a < 0 && b < 0)
            return 3;
        else
            return 4;
    }
}
