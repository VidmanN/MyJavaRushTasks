package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_num;
        int num = 0, sum =0;
        while (num != -1)
        {
            s_num = reader.readLine();
            num = Integer.parseInt(s_num);
            sum += num;
        }
        System.out.println(sum);
    }
}
