import javax.swing.JOptionPane;
 
public class sumaFila_Columna_Matriz {
    static int m, n, M[][];  /* Declaramos como variables globales m = fila, n = columna y la 
                                Matriz M*/
 
    public static void main(String args[]){
 
 
        m = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero filas Matriz. "));
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero columnas Matriz. "));
 
        M = new int[m][n];
 
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite dato [" + i + "] [" + j + "]"));
            }
        }
 
       // Invocamos los diferentes Métodos
       sumaFila();
       sumaColumna();
       printMatriz();
 
    }
 
     // Calcular la suma de los elementos de cada fila
     static void sumaFila(){
        int j, sumaF = 0;
        boolean sw = true;
        for(int i = 0; i < M.length; i++){
            j = 0;
            while ((j < M[i].length) && (sw == true)){
               sumaF = sumaF + M[i][j];
               if(j == M[i].length){
                   sw = false;
               }
              j++;
           }
            System.out.println("La suma de la fila " + i + " es: " + sumaF);
            sumaF = 0;
        }
   }
     
    // Calcular la suma de los elementos de cada columna
    static void sumaColumna(){
        int i, j, sumaC;
        for(i = 0; i < M.length; i++){
           sumaC = 0;
            for(j = 0; j < M[i].length; j++){
               sumaC = sumaC + M[j][i];
           }
           System.out.println("La suma de la columna " + i + " es: " + sumaC);
       }
    }
 
      // Imprimimos la Matriz
      static void printMatriz(){
        for(int i = 0; i < M.length; i++){
            for(int j = 0;j < M[i].length;j++)
  System.out.print("[" + M[i][j] + "]");
  System.out.println(" ");
            }
    }
}