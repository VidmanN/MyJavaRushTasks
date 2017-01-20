package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_a = reader.readLine();
        int a = Integer.parseInt(s_a);
        String s_b = reader.readLine();
        int b = Integer.parseInt(s_b);
        String s_c = reader.readLine();
        int c = Integer.parseInt(s_c);
        int min = a;
        if (b < a)
        {
            min = b;
            b = a;
            a = min;
        }
        if (c < a)
        {
            min = c;
            c = a;
            a = min;
        }
        if (b > c)
        {
            min = c;
            c = b;
            b = min;
        }
        System.out.println(c+" "+b+" "+a);
    }
}
