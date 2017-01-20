package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

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
        String s_d = reader.readLine();
        int d = Integer.parseInt(s_d);
        int max = a;
        for (int i=0; i<=2; i++)
        {
            if (i == 0)
                if (max < b)
                    max = b;
            if (i == 1)
                if (max < c)
                    max = c;
            if (i == 2)
                if (max < d)
                    max = d;
        }
        System.out.print(max);
    }
}
