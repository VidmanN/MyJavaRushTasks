package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int num,sum =0;
        String s_num;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<=2;i++)
        {
            s_num = reader.readLine();
            num = Integer.parseInt(s_num);
            if (num >= 0)
                sum += 1;
        }
        System.out.println(sum);
    }
}
