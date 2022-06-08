public class matrixChainDP {

    static void matrixMul(int matrixSize[]) {
        int dp[][] = new int[matrixSize.length][matrixSize.length];
        for(int g=1;g<matrixSize.length-1;g++){
            for(int i=1;i<matrixSize.length-g;i++){
                int j = g + i;
                int min = Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int c = dp[i][k] + dp[k+1][j] + matrixSize[i-1] * matrixSize[j] * matrixSize[k];
                    if(c<min){
                        min = c;
                    }
                }
                dp[i][j] = min;
            }
        }
        print2D(dp);
    }

    public static void print2D(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrixSize[] = { 3, 2, 4, 2, 5 };
        matrixMul(matrixSize);
    }
}
