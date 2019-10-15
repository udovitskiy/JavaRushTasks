package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        isColor(t);
    }

    public static void isColor(double t) {
        int count = 0;
        while (true) {
            count += 3;
            if (count > t){
                System.out.println("зелёный");
                break;
            }
            count += 1;
            if (count > t){
                System.out.println("жёлтый");
                break;
            }
            count += 1;
            if (count > t){
                System.out.println("красный");
                break;
            }

        }
    }
}