package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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
        if (a != b && b == c)
            System.out.println(1);
        if (a != b && a == c)
            System.out.println(2);
        if (a != c && b == a)
            System.out.println(3);
    }
}
