package com.javarush.test.level04.lesson10.task02;

import java.io.*;

/* 10 чисел наоборот
Вывести на экран числа от 10 до 1 используя цикл while.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 10;
        boolean while_true = true;
        while (while_true)
        {
            System.out.println(i);
            i -= 1;
            if (i == 0)
                while_true = false;
        }

    }
}
