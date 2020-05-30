package ru.gb.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        invertArray();
        System.out.println();
        fillArray();
        System.out.println();
        changeArray();
        System.out.println();
        fillDiagonal();
        System.out.println();
        minAndMax();
        System.out.println();
        System.out.println(checkBalance(new int[]{1, 2, 0, 9,}));

    }

    // Задание 1
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            //1 способ
            /*if(arr[i] == 0){
                arr[i]=1;
            }else {
                arr[i]=0;
            }*/

            arr[i] = (arr[i] == 0) ? 1 : 0;// 2 способ
            System.out.print(arr[i]);
        }
    }


    //Задание 2
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j = j + 3) {
            arr[i] = j;
            System.out.print(arr[i]);
        }
    }


    //Задание 3
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
            System.out.print(w[i]);
        }
    }


    //Задание 4
    public static void fillDiagonal() {
        int counter = 1;
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j) || (i == arr.length - 1 - j)) {
                    arr[i][j] = counter;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 5
    public static void minAndMax() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = min < arr[i] ? min : arr[i];
            max = max > arr[i] ? max : arr[i];
        }
        System.out.print("min" + min + " " + "max" + max);
    }

    //Задание 6
    public static boolean checkBalance(int[] array) {


        System.out.println(Arrays.toString(array));

        int left = 0, right = 0;

        for (int i : array) {
            right += i;
        }

        for (int i = 0; i < array.length; i++) {
            if (left == right) {
                return true;
            }
            left += array[i];
            right -= array[i];
        }
        return false;
    }
}
//7 задание не смог