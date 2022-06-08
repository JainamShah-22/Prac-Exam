public class dikstra {

    static int minDist(int graph[][], int vertices, int dist[], boolean visited[]){
        int minVal = Integer.MAX_VALUE, minIndex = -1;
        for(int i=0;i<vertices;i++){
            if(visited[i] == false && dist[i] <= minVal){
                minVal = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    static void temp(int graph[][], int source, int vertices){
        boolean visited[] = new boolean [vertices];
        int dist[] = new int [vertices];
        for (int i=0;i<dist.length;i++){
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        dist[source] = 0;

        for(int i=0;i<vertices-1;i++){
            int u = minDist(graph, vertices, dist, visited);
            visited[u]=true;
            for(int j=0;j<vertices;j++){
                if((visited[j] == false) && (dist[u] + graph[u][j] <dist[j]) && (graph[u][j] != 0)){
                    dist[j] = dist[u] + graph[u][j];
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
        temp(graph, 0, vertices);
    }
}
