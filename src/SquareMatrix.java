import java.util.Arrays;
import java.util.Random;

public class SquareMatrix {
    Random rand;
    SquareMatrix(){
        this.rand = new Random();
    }

    public int[][] generaMatrizTriangularSuperior( int[][] matrix)
    {
        if( matrix.length != matrix[0].length )
        {
            System.out.println("No es una matriz cuadrada.");
            return matrix;
        }
        for(int i = 0; i < matrix.length; i++)
            for( int j = i; j < matrix.length; j++ )
                matrix[i][j] = this.rand.nextInt(50);
        return matrix;
    }

    public boolean isTriangularSuperior( int [][] matrix){
        for(int i = 0; i < matrix.length; i++)
            for( int j = 0; j < i; j++ )
                if(matrix[i][j] != 0) return false;
        return true;
    }

    public int[][] generaMatrizTriangularInferior( int[][] matrix)
    {
        if( matrix.length != matrix[0].length )
        {
            System.out.println("No es una matriz cuadrada.");
            return matrix;
        }
        for(int i = 0; i < matrix.length; i++)
            for( int j = 0; j < i; j++ )
                matrix[i][j] = this.rand.nextInt(50);
        return matrix;
    }

    public boolean isTriangularInferior( int[][] matrix){
        for(int i = 0; i < matrix.length; i++)
            for( int j = i; j < matrix.length; j++ )
                if( matrix[i][j] != 0 ) return false;
        return true;
    }

    public boolean evaluaSimetrica( int[][] matrix){
        System.out.println("Matriz original: ");
        printMatrix( matrix );
        System.out.println("Matriz traspuesta: ");
        printMatrix(generaTraspuesta(matrix));
        if(Arrays.deepEquals(matrix, generaTraspuesta(matrix)))
            return true;
        return false;
    }

    private int[][] generaTraspuesta( int[][] matrix ){
        int[][] matrixTaspuesta = new int[matrix[0].length][matrix.length];
        for( int i = 0; i < matrix.length; i++)
        {
            for( int j = 0; j < matrix[0].length; j++ )
            {
                matrixTaspuesta[j][i] = matrix[i][j];
            }
        }
        return matrixTaspuesta;
    }
    public void printMatrix( int[][] matrix )
    {
        System.out.println("La matriz a mostrar es:");
        for( int i = 0; i < matrix.length; i++ )
        {
            for( int j = 0; j < matrix[0].length; j++ )
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
