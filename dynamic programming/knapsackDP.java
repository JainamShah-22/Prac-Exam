public class knapsackDP {

    static void knapsack(int totalWeight, int profit[], int weight[]){
        int dp[][] = new int[profit.length][totalWeight+1];
        for(int i=1;i<profit.length;i++){
                        for(int j =0;j<=totalWeight;j++){
                if(j==0){
                    continue;
                }else{
                    if(j<weight[i]){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j], profit[i] + dp[i-1][j-weight[i]]);
                        if(dp[i-1][j]< profit[i] + dp[i-1][j-weight[i]]){
                        }
                    }
                }
            }
        }
        // print2D(dp);
        System.out.println(dp[profit.length-1][totalWeight]);
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
        int totalWeight = 50;
        int profit[] = {0, 60, 100, 120};
        int weight[] = {0, 10, 20, 30};
        knapsack(totalWeight, profit, weight);
    }
}
