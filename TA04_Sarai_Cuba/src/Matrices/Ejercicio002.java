
package Matrices;

import java.util.Scanner;

public class Ejercicio002 {
    public static void main( String[] args){
        
        //variables para el for
        int i,j;
        
        //variables para la matriz
        int filas = 4, columna=5;
        int sumaCol = 0, sumaFil = 0;
        int sumaTotal = 0;
        int sumaTotalM=0;
        int a = 0;
        int b = 0;
        
        //declarando matriz
        int[][] matriz;
        matriz = new int[filas][columna];
        
        //Scanner para poder ingresar o leer datos
        Scanner entrada = new Scanner(System.in);
        
        //llenado elementos de la matriz
        for(i=0;i<filas;i++){
            for(j=0;j<columna;j++){
                System.out.print("Ingrese elemento en la posición["+i+"]"+"["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        //imprimos la matriz
        System.out.println("\nLa matriz es: ");
        for(i=0;i<filas;i++){
            for(j=0;j<columna;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //Sumamos filas
        for(i=0;i<filas;i++){
            sumaFil = 0;
            for(j=0;j<columna;j++){
                sumaFil += matriz[i][j];
            }
            b += sumaFil;
            System.out.println("La suma de la fila["+(i+1)+"]es: "+sumaFil);
        }
        System.out.println("");
        
        //Sumamos columnas
        for(j=0;j<columna;j++){
            sumaCol = 0;
            for(i=0;i<filas;i++){
                sumaCol += matriz[i][j];
            }
            a += sumaCol;
            System.out.println("La suma de la columna["+(j+1)+"]es: "+sumaCol);
        }
        System.out.println("");
        
        //Suma de columnas y filas
        sumaTotal=b+a;
        
        
        //Suma total de la matriz
        for(i=0;i<filas;i++){
            for(j=0;j<columna;j++){
                sumaTotalM += matriz[i][j];
            }
        }
        System.out.println("La suma total de filas y columnas es: "+sumaTotal);
        System.out.println("La suma total de la matriz es: "+sumaTotalM);
    }
}
