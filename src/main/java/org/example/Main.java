package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    //Metodo llenar matriz que toma como parametro una matriz bidimensional
    static void llenarMatriz(int[][] matriz){
        //Scanner lectura de entrada del usuario, bucle anidado que recorre fira y columna de la matriz,
        // por sultimo solicita al usuario que ingrese los valores para cada posicion de la matriz
        Scanner myScanner = new Scanner(System.in);
        System.out.println("ingresa valores para matris de 2x3");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.println("Fila " + (i+1) + ", Columna " + (j + 1) + ": ");
                matriz[i][j] = myScanner.nextInt();
            }
        }
    }

    //Metodo imprimirMatriz, toma como parametro una matriz bidimensional
    //bucle anidado que recorre filas y columnas de la matriz
    //Se imprime cada valor de la matriz en la misma linea concatenado con un espacio
    //despues de imprimir la fila completa se agrega un separador para la siguiente fila
    static void imprimirMatriz(int[][] matriz){
        System.out.println("Todos los valores de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println("------");
        }
    }

    //Metodo sumarContenidoMatriz toma como parametro dos matrices bidimencionales
    //se obtiene numero de filas y columnas
    //nueva matriz donde se almacena la suma del bucle anidado retornando la nueva matriz
    static int[][] sumarContenidoMatriz(int[][] matriz, int[][] matriz1){
            int fila = matriz.length;
            int columna = matriz[0].length;
            int [][] resultado = new  int[fila][columna];


        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                resultado[i][j] = matriz[i][j] + matriz1 [i][j];
            }

        }
        return resultado;
    }


    public static void main(String[] args) {
        //creacion de dos matrices y se imprime las 3 matrices
        int matriz1[][] = new int[2][3];
        int matriz2[][] = new int[2][3];

        llenarMatriz(matriz1);
        imprimirMatriz(matriz1);


        llenarMatriz(matriz2);
        imprimirMatriz(matriz2);
        int sumarMatriz[][] = sumarContenidoMatriz(matriz1, matriz2);
        imprimirMatriz(sumarMatriz);


    }

        /*double[] myArray = {2.3, 4.5, 5.7};
        //System.out.println(myArray[1]);

        int[][] miMatriz = {{1, 5, 7}, {5, 3, 2}, {8, 2, 1}, {8, 5, 7}, {7, 3, 2}, {5, 2, 1}};
        System.out.println(miMatriz[0][1]);
        System.out.println(miMatriz[1][0]);
        System.out.println(miMatriz[3][1]);
        System.out.println(miMatriz[5][0]);
         */
//        int[] myIntArray = new int[3]; // Array de enteros (int) de 3 posiciones
//        String[] myStringArray = new String[8]; // Array de cadenas de caracteres (String) de 9 posiciones

//        int matriz1[][] = new int[2][3];





        //------------------------------


 /*               // 1. Crear un array de cadenas llamado `nombres` con un tamaño de 5.
                String[] names = new String[10];

                // 2. Inicializar el array con los nombres "Ana", "Carlos", "Laura", "José" y "Sofía".
                names[0] = "Ana";
                names[1] = "Carlos";
                names[2] = "Laura";
                names[3] = "José";
                names[4] = "Sofía";
                names[5] = "Sebastian";
                names[6] = "Maria";
                names[7] = "Alejandra";
                names[8] = "Pedro";
                names[9] = "Luisa";
                // 3. Imprimir los elementos del array.
                System.out.print("Nombres: ");
                for (String name : names) {
                    System.out.print(names + " ");
                }
                System.out.println();

                // 4. Imprimir los nombres que empiezan con la letra "A".
                System.out.print("Nombres que empiezan con 'A': ");
                for (String name : names) {
                    if (name.startsWith("A")) {
                        System.out.print(name + " ");
                    }
                }
                System.out.println();

                // 5. Ordenar e imprimir los nombres en orden alfabético.
                Arrays.sort(names);
                System.out.print("Nombres ordenados alfabéticamente: ");
                for (String name : names) {
                    System.out.print(name + " ");
                }
                System.out.println();
            }*/
        }
