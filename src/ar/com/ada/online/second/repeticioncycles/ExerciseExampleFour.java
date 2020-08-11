package ar.com.ada.online.second.repeticioncycles;

import java.util.Scanner;

public class ExerciseExampleFour {
    public static void main(String[] args) {
        //Cierta empresa requiere controlar la existencia de diez productos,
        // los cuales se almacenan en un vector A, mientras que los pedidos
        // de los clientes de estos productos se almacenan en un vector B.
        // Se requiere generar un tercer vector C con base en los anteriores que
        //represente lo que se requiere comprar para mantener el stock de inventario,
        // para esto se considera lo siguiente: si los valores correspondientes de los vectores A
        // y B son iguales se almacena este mismo valor, si el valor de B es mayor que el de A
        // se almacena el doble de la diferencia entre B y A, si se da el caso de que A es mayor que B,
        // se almacena B, que indica lo que se requiere comprar para mantener el stock de inventario.

        int[] arrayProducts;
        int[] arrayOrders;
        int[] arrayRequirements;

        Scanner keyboard = new Scanner(System.in);

        //inicializo las variables
        arrayProducts = new int[10];
        arrayOrders = new int[10];
        arrayRequirements = new int[10];

        for (int i = 0; i < arrayProducts.length; i++) {
            System.out.print("ingrese el stock del producto" + i +" ");
            arrayProducts[i] = keyboard.nextInt();

            System.out.print("ingrese la cantidad de pedidos para el producto " + i + " ");
            arrayOrders[i] = keyboard.nextInt();
        }

        for (int i = 0; i < arrayProducts.length; i++) {
            if (arrayProducts[i] == arrayOrders[i]){
                arrayRequirements[i] = arrayProducts[i];
            } else if (arrayOrders[i] > arrayProducts[i]){
                        arrayRequirements[i] = (arrayOrders[i] - arrayProducts[i])*2;
            } else {
                arrayRequirements[i] = arrayOrders[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("\nSe requiere comprar: " + arrayRequirements[i] + " del producto " + arrayProducts[i] + " ");
        }


    }
}
