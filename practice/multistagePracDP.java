public class multistagePracDP {
    
    static int INF = Integer.MAX_VALUE;

    static void calc(int graph[][], int n){
        int dp[] = new int[n];
        for(int i=n-2;i>=0;i--){
            dp[i] = INF;
            for(int j=1;j<n;j++){
                if(graph[i][j] == INF){
                    continue;
                }
                dp[i] = Math.min(dp[i], graph[i][j] + dp[j]);
            }
        }
        System.out.println(dp[0]);
    }

    public static void main(String[] args) {
        int[][] graph = new int[][]{{INF, 1, 2, 5, INF, INF, INF, INF},
        {INF, INF, INF, INF, 4, 11, INF, INF},
        {INF, INF, INF, INF, 9, 5, 16, INF},
        {INF, INF, INF, INF, INF, INF, 2, INF},
        {INF, INF, INF, INF, INF, INF, INF, 18},
        {INF, INF, INF, INF, INF, INF, INF, 13},
        {INF, INF, INF, INF, INF, INF, INF, 2}};
        int n = graph.length;
        calc(graph, n+1);
        
    }
}
