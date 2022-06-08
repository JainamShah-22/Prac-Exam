public class djikstraAlgoG {

    static int minDistance(int[] dist, Boolean[] isIncluded, int vertices) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for(int i=0;i<vertices;i++) {
            if(isIncluded[i] == false && dist[i]<=min){
                min = dist[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);
        return minIndex;
    }

    static void djikstra(int graph[][], int src, int vertices){
        int dist[] = new int[vertices];
        Boolean isIncluded[] = new Boolean[vertices];

        for(int i=0;i<vertices;i++){
            dist[i] = Integer.MAX_VALUE;
            isIncluded[i] = false;
        }

        dist[src] = 0;

        for(int i =0;i<vertices-1;i++){
            int u = minDistance(dist, isIncluded, vertices);
            isIncluded[u]= true;
            for(int j=0;j<vertices;j++){
                if((isIncluded[j] == false) && (dist[u] + graph[u][j] < dist[j]) && graph[u][j]!=0){
                    dist[j] = dist[u] + graph[u][j];
                    // System.out.println("J : " + j +" " +dist[j]);
                }
            }
        }
        printSolution(dist, vertices);

    }

    static void printSolution(int dist[], int vertices)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < vertices; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        int vertices = graph.length;
        djikstra(graph, 0, vertices);

        
    }
}
