package Lesson01.Homework_advanced;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework_advanced {
    public static void main(String[] args) {
// Объявляем переменные
        String stringNumbers = "234";
        String text = "some_text";
// переводим значения переменнных в числа
//        int intNumbers = Integer.valueOf(stringNumbers);
//        int textLenght = text.length();
// либо сразу можно высчитать и вывести результат
        System.out.println(Integer.valueOf(stringNumbers) + text.length());

//----------------------------------------------------------------------------
// Объявляем переменные
        int a = 3;
        int b = 5;
// Вычисляем и выодим результат
        int result2 = (a+b)*(a+b);
        System.out.println(result2);

//----------------------------------------------------------------------------
//  Создаем первый массив
        int[] firstArray = new int[5];
            firstArray[0] = 1;
            firstArray[1] = 2;
            firstArray[2] = 5;
            firstArray[3] = 7;
            firstArray[4] = 10;
//  Создаем второй массив
        int[] secondArray = new int[5];
            secondArray[0] = 2;
            secondArray[1] = 3;
            secondArray[2] = 2;
            secondArray[3] = 17;
            secondArray[4] = 15;
//  Создаем третий массив, заполняем и вычисляем его значения
        int[] resultArray = new int[15];
            resultArray[0] = firstArray[0];
            resultArray[1] = firstArray[1];
            resultArray[2] = firstArray[2];
            resultArray[3] = firstArray[3];
            resultArray[4] = firstArray[4];
            resultArray[5] = secondArray[0];
            resultArray[6] = secondArray[1];
            resultArray[7] = secondArray[2];
            resultArray[8] = secondArray[3];
            resultArray[9] = secondArray[4];
            resultArray[10] = firstArray[0] * secondArray[0];
            resultArray[11] = firstArray[1] * secondArray[1];
            resultArray[12] = firstArray[2] * secondArray[2];
            resultArray[13] = firstArray[3] * secondArray[3];
            resultArray[14] = firstArray[4] * secondArray[4];

// вывод значений третьего массива в строку
        System.out.println(Arrays.toString(resultArray));

//--------------------------------------------------------------
// исходная строка
        String text2 = "Hello world!";
// видоизменение и вывод
        System.out.println(text2.replaceAll("l" , "r").toUpperCase().substring(0,8));
            }
}
