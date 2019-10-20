
package Matrices;

import java.util.Arrays;
import java.util.Random;


public class Ejercicio001 {
    
    public static void main(String[] args){
        //varibles para la matriz
        int i,j;
        
        //variable para el maximo y minimo
        int mayor = 0;
        int minimo ;
        
        //variables para fila columna del matriz
        int fila = 6, columna=10;
        
        //variable para la posicion de maximo y minimo
        int posicion = 0, posicion2 = 0;
        int posicion3 = 0,posicion4 = 0;
        
        //declaramos matriz
        int[][] matriz;
        matriz = new int[fila][columna];//(fila-6;columnas-10);
        
        //Utilizamos random para tener los numeros del 0 a 1000 aleatoriamente
        Random aleatorio = new Random();
        
        //llenamos elementos de la matriz
        for(i=0;i<fila;i++){
            for(j=0;j<columna;j++){
                matriz[i][j] = aleatorio.nextInt(1001);//elementos llenados aleatoriamente
                System.out.println("Elemento en la posición "+"["+i+"]"+"["+j+"]"+" = "+matriz[i][j]);//mostrar matriz
            }
        }

        //Maximo de la matriz
        for(i=0;i<fila;i++){
            for(j=0;j<columna;j++){
                if(matriz[i][j]>mayor){
                    mayor = matriz[i][j];
                    posicion = i;
                    posicion2 = j;
                }  
            }
        }
        System.out.println("El numero mayor se encuentra en la posicion:"+" ["+posicion+"]"+"["+posicion2+"]");//mostrar posicion del numero  maximo
        
        //Minimo de la matriz
        minimo = matriz[0][0];
        for(i=0;i<fila;i++){
            for(j=0;j<columna;j++){
                if(matriz[i][j]<minimo){
                    minimo = matriz[i][j];
                    posicion3 = i;
                    posicion4 = j;
                }
            }
        }
        System.out.println("El numero menor se encuentra en la posicion:"+" ["+posicion3+"]"+"["+posicion4+"]");//mostrar posicion del numero    
    }
    
}
