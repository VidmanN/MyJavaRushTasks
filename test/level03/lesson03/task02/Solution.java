package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        double us = convertEurToUsd(123, 24);
        System.out.println(us);
        us = convertEurToUsd(123, 24.58);
        System.out.println(us);
    }

    public static double convertEurToUsd(int eur, double course){
        double usd = eur * course;
        return usd;
    }
}
