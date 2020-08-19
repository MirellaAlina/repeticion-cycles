package ar.com.ada.online.second.repeticioncycles;

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {
       // Se tiene en un arreglo cien elementos representando
        // calificaciones de los estudiantes de una escuela.
        // Realice un algoritmo que lea el arreglo y calcule la
        // calificación promedio del grupo, además, que cuente
        // los estudiantes que obtuvieron calificaciones arriba del
        //promedio del grupo.

        int[] arrayStudents = new int[10]; //van 100
        float average;
        int aboveAverageRating;
        int ratings;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < arrayStudents.length ; i++) {
            System.out.printf("Ingrese la nota del estudiante para la posición %d: " , i);
            arrayStudents[i] = keyboard.nextInt();
        }
        ratings = 0;

        for (int i = 0; i < arrayStudents.length ; i++) {
            ratings = ratings + arrayStudents[i];
        }
        average = (ratings / arrayStudents.length);
        System.out.printf("El promedio del grupo es de: %.2f" , average);

        aboveAverageRating = 0;
        for (int i = 0; i < arrayStudents.length ; i++) {
            if (arrayStudents[i] > average) {
                aboveAverageRating = aboveAverageRating + 1;
            }
        }

        System.out.print("\nLos estudiantes con nota por encima del promedio son: " + aboveAverageRating);

    }
}
