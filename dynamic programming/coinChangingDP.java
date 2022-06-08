public class coinChangingDP {

    static void coinChange(int coins[], int amount){
        int dp[][] = new int [coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<amount+1;j++){
                if(i==0){
                    if(j!=0)
                    dp[i][j] = 9999;
                }
                else if(coins[i]>j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = min(dp[i-1][j],1+ dp[i][j-coins[i]]);
                }
            }
        }
        print2D(dp);
        System.out.println(dp[coins.length-1][amount] + " are the minimum number of req coins");
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

    static int min(int a, int b){
        return a>b?b:a;
    }

    public static void main(String[] args) {
        int coins[]= {0, 1,5,6,9};
        int amount = 10;
        coinChange(coins, amount);
    }
}
