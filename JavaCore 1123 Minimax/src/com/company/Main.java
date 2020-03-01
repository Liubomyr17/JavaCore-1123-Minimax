package com.company;

/*

1123 Minimax
Write a method that returns the minimum and maximum numbers in the array.

Requirements:
1. The program should not read data from the keyboard.
2. Add the implementation of the getMinimumAndMaximum method, it should return a pair of minimum and maximum.
3. The main method should not be changed.
4. The program should output the correct result.
5. The main method should call the getMinimumAndMaximum method.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        //создаем массив, в который вносим числа
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        //максимальное 77, минимальное -8 - для проверки

        //создаем Pair (пару значений), в которой будет храниться миним и максм значение
        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x); //печатаем первую цифру в паре
        System.out.println("Maximum is " + result.y); //печатаем вторую цифру в паре
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array)
    {
        //вычисляем значения для пары

        //если массив пустой или длина массива равна 0
        if (array == null || array.length == 0)
        {
            //возвращаем null null
            return new Pair<Integer, Integer>(null, null);
        }

        int min=array[0];
        int max=array[0];
        for (int i = 0; i < array.length ; i++)
        {
            if (min>array[i]) min=array[i]; //если минимум больше, чем текущая позиция
            if (max<array[i]) max=array[i]; //если максимум меньше, чем текущая позиция
        }

        return new Pair<Integer, Integer>(min, max); //выдаем на-гора готовую пару
    }

    //создаем собственный класс пары
    public static class Pair<X, Y>
    {
        public X x; //переменная х типа Х
        public Y y; //переменная y типа Y

        //конструктор для инициализации значений в виде X, Y
        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}

