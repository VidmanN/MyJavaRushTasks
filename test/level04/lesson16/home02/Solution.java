package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_n1 = reader.readLine(), s_n2 = reader.readLine(), s_n3 = reader.readLine();
        int n1 = Integer.parseInt(s_n1), n2 = Integer.parseInt(s_n2), n3 = Integer.parseInt(s_n3);
        if ((n1<=n2 && n1>=n3)||(n1>=n2 && n1<=n3))
            System.out.print(n1);
        if ((n2<=n1 && n2>=n3)||(n2>=n1 && n2<=n3))
            System.out.print(n2);
        if ((n3<=n1 && n3>=n2)||(n3>=n1 && n3<=n2))
            System.out.print(n3);
    }
}
