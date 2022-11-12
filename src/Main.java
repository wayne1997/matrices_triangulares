import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SquareMatrix sqm = new SquareMatrix();
        boolean isExecuting = true;
        int[][] matrizSimetrica = {{3,1,2},{1,6,0},{2, 0, 4}};
        int[][] matrizNoSimetrica = {{8,1,0},{1,7,0},{2, 1, 4}};
        while(isExecuting){
            int filas = 0;
            int columnas = 0;
            int[][] matrix = null;
            System.out.println("Trabajo de matrices. Para ver el ejercicio ingrese la opcion 1(T. Superior), 2(T. inferior), 3(Simetrica), 4(No simetrica) y 5 para terminar.");
            var opt = sc.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Generar matriz triangular superior, ingresa la cantidad de filas y columnas:");
                    filas = sc.nextInt();
                    columnas = sc.nextInt();
                    matrix = sqm.generaMatrizTriangularSuperior(new int[filas][columnas]);
                    sqm.printMatrix(matrix);
                    System.out.println("Es una matriz triangular superior:  " + sqm.isTriangularSuperior(matrix));
                    break;
                case 2:
                    System.out.println("Generar matriz triangular inferior, ingresa la cantidad de filas y columnas:");
                    filas = sc.nextInt();
                    columnas = sc.nextInt();
                    matrix = sqm.generaMatrizTriangularInferior(new int[filas][columnas]);
                    sqm.printMatrix(matrix);
                    System.out.println("Es una matriz triangular inferior:  " + sqm.isTriangularInferior(matrix));
                    break;
                case 3:
                    System.out.println("Este ejercicio presenta la verificacion de una matriz simétrica");
                    boolean isSimetrica = sqm.evaluaSimetrica(matrizSimetrica);
                    System.out.println("La matriz es simétrica: " + isSimetrica);
                    break;
                case 4:
                    System.out.println("Este ejercicio presenta la verificacion de una matriz simétrica");
                    boolean notSimetrica = sqm.evaluaSimetrica(matrizNoSimetrica);
                    System.out.println("La matriz es simétrica: " + notSimetrica);
                    break;
                case 5:
                    System.out.println("Terminado");
                    isExecuting = false;
                    break;
                default:
                    isExecuting = false;
                    System.out.println("Terminado");
                    break;
            }
        }
    }
}
