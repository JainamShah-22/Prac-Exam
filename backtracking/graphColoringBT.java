import java.util.Arrays;

public class graphColoringBT {
    final int V = 4;
    int[] color;
    
    boolean isSafeToColor(int v, int[][] graphMatrix, int[] color, int c)
    {
        for (int i = 0; i < V; i++)
            if (graphMatrix[v][i] == 1 && c == color[i])
                return false;
        return true;
    }

    void graphColorUtil(int[][] graphMatrix, int m, int[] color, int v)
    {
        if (v == V){
            printColoringSolution(color);
        }    
        if(v<V){
            for (int i = 1;i <= m; i++) 
            {
                if (isSafeToColor(v, graphMatrix, color, i))
                {
                    color[v] =i;
                    graphColorUtil(graphMatrix, m, color, v + 1);
                    color[v] = 0;
                }
            }
        }
    }

    void printColoringSolution(int color[])
    {
        System.out.println("Color schema for vertices are: ");
        for (int i = 0; i < V; i++)
            System.out.print(color[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        graphColoringBT interviewBit 
               = new graphColoringBT();
        
        int graphMatrix[][] = {
            { 0, 1, 1, 1 },
            { 1, 0, 1, 0 },
            { 1, 1, 0, 1 },
            { 1, 0, 1, 0 },
        };
        int m = 3;
        int color[] = new int[graphMatrix.length];
        Arrays.fill(color, 0);
        interviewBit.graphColorUtil(graphMatrix, m, color, 0);
    }
}