public class knapsackPracDP {
    
    static void calc(int totalWeight, int profit[], int weight[]){
        int dp[][] = new int[weight.length][totalWeight+1];
        for(int i=0;i<weight.length;i++){
            for(int j=0;j<=totalWeight;j++){
                if(i==0 || j==0){
                    continue;
                }else{
                    if(weight[i]<=j){
                        dp[i][j] = Math.max(dp[i-1][j], profit[i] + dp[i-1][j-weight[i]]);
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
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
        int totalWeight = 50;
        int profit[] = {0, 60, 100, 120};
        int weight[] = {0, 10, 20, 30};
        calc(totalWeight, profit, weight);
    }
}
