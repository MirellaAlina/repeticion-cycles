package ar.com.ada.online.second.repeticioncycles;

import java.util.Scanner;

public class ExerciseExampleFive {
    public static void main(String[] args) {
        int[] array = new int[6];
        int auxiliarSubscript;
        int auxArray;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Ingrese el valor para el elemento %d del arreglo: " , i);
            array[i] = keyboard.nextInt();
        }

        auxiliarSubscript = 0;

        for (int i = 0; i < 2; i++) {
            auxArray = array[i];
            array[i] = array[5 - auxiliarSubscript];
            array[5 - auxiliarSubscript] = auxArray;
            auxiliarSubscript = auxiliarSubscript + 1;
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print("\nEl orden del nuevo arreglo es  " + array[i] + " ");
        }

    }
}
