public class color {
    
    static boolean isPossible(int graphMatrix[][], int soln[], int startingIndex, int i){
        for(int j=0;j<graphMatrix.length;j++){
            if(graphMatrix[startingIndex][j] == 1 && soln[j] == i){
                return false;
            }
        }
        return true;
    }

    static void fillColor(int graphMatrix[][], int colors, int soln[], int startingIndex){
        if(startingIndex == soln.length){
            printColoringSolution(soln, graphMatrix.length);
        }else{
            for(int i=1;i<=colors;i++){
                if(isPossible(graphMatrix, soln, startingIndex, i)){
                    soln[startingIndex] = i;
                    fillColor(graphMatrix, colors, soln, startingIndex+1);   
                    soln[startingIndex] = 0; 
                }

            }
        }
    }

    static void printColoringSolution(int color[], int V)
    {
        System.out.println("Color schema for vertices are: ");
        for (int i = 0; i < V; i++)
            System.out.print(color[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int graphMatrix[][] = {
            { 0, 1, 1, 1 },
            { 1, 0, 1, 0 },
            { 1, 1, 0, 1 },
            { 1, 0, 1, 0 },
        };
        int colors = 3;
        int soln[] = new int[graphMatrix.length];
        fillColor(graphMatrix, colors, soln, 0);
    }
}
