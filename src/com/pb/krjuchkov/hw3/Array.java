package com.pb.krjuchkov.hw3;

public class Array {
    public static void main(String[] args){
        int summa = -1;
        int j;
        int counter = 0;
        int[] array = {-4, 55, 0, -100, 1, 2, -35, 74, -15, 6};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);
        System.out.println(array[8]);
        System.out.println(array[9]);

        for( int num : array) {
            summa = summa + num;
        }
        System.out.println("Сума элементов массива = "+summa);

        for (int i = 0; i < array.length; i++) {
           if (array[i] > 0) {
               counter ++;
            }
        }
        System.out.println("Количество положительных элементов массива = "+counter);

        for(int i = array.length - 1 ; i >= 0 ; i--){
            for(j = 0 ; j < i ; j++){
            if( array[j] < array[j+1] ){
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
            }

        }
            System.out.println(array[j]);
    }

    }
}
//Создайте класс Array в пакете hw3.Программа должна позволить пользователю ввести одномерный массив целых
// чисел размерностью 10 элементов.
//Вывести на экран введенный массив.
//Подсчитать сумму всех элементов массива и вывести ее на экран.
//Подсчитать и вывести на экран количество положительных элементов.
//Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)
//Вывести на экран отсортированный массив.