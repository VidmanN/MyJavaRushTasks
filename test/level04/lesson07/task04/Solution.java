package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int num,sum_min =0,sum_pl =0;
        String s_num;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<=2;i++)
        {
            s_num = reader.readLine();
            num = Integer.parseInt(s_num);
            if (num >= 0)
                sum_pl += 1;
            else sum_min += 1;
        }
        System.out.println("количество отрицательных чисел: "+ sum_min);
        System.out.println("количество положительных чисел: "+sum_pl);
    }
}
