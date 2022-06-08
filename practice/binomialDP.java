public class binomialDP {
    
    static void calc(int a, int b){
        int dp [][] = new int[a+1][b+1];
        for(int i=0;i<=a;i++){
            for(int j=0;j<=Math.min(i, b);j++){
                if(j==0 || i ==1){
                    dp[i][j]=1;
                }else{
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }
        print2D(dp);
    }


    public static void print2D(int mat[][])
    {
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        calc(10, 5);
    }
}
