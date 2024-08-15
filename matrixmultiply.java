public class matrixmultiply{
    public static void main(String[] args){


        int[][] matrixA = {
            {1,2,2},{3,6,2}
        };

         int[][] matrixB = {
            {1,3},{3,3},{1,3}
        };


         int rowsA = matrixA.length;
        int colsA = matrixA[0].length;

        int colsB = matrixB[0].length;

        int[][] result= new int[rowsA][colsB];

        for(int i=0;i<rowsA;i++){
            for(int j=0;j<colsB;j++){
                result[i][j]=0;
                for( int k=0;k<colsA;k++){
                    result[i][j]+=matrixA[i][k]*matrixB[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
