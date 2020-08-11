package ar.com.ada.online.second.repeticioncycles;

import java.util.Scanner;

public class ExerciseExampleThree {
    public static void main(String[] args) {
        // Se tienen los nombres de los N alumnos de una escuela, además de su promedio
        //general. Realice un algoritmo para capturar esta información, la cual se debe almacenar en
        //arreglos, un vector para el nombre y otro para el promedio, después de capturar la información
        //se debe ordenar con base en su promedio, de mayor a menor, los nombres deben corresponder
        //con los promedios.

        double[] arrayAverage;
        String[] arrayNames;
        int sizeArray;
        double auxiliaryAverage;
        String auxiliaryNames;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        sizeArray = keyboard.nextInt();

        arrayAverage = new double[sizeArray];
        arrayNames = new String[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Ingrese el nombre del alumno " + i + " :" );
            keyboard.nextLine();
            arrayNames[i] = keyboard.nextLine();

            System.out.print("\nIngrese el promedio para el alumno " + i + ": ");
            arrayAverage[i] = keyboard.nextDouble();
        }

        for (int i = 0; i < sizeArray ; i++) {
            for (int j = i + 1; j < sizeArray ; j++) {
                if (arrayAverage[j] > arrayAverage[i]) {

                    auxiliaryAverage = arrayAverage[i];
                    arrayAverage[i] = arrayAverage[j];
                    arrayAverage[j] = auxiliaryAverage;

                    auxiliaryNames = arrayNames[i];
                    arrayNames[i] = arrayNames[j];
                    arrayNames[j] = auxiliaryNames;
                }
            }
        }
        for (int i = 0; i < sizeArray ; i++) {
            System.out.print("El alumno " + arrayNames[i] + " tiene un promedio de " + arrayAverage[i] + " \n");
        }




    }
}
