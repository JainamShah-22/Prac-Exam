public class nQueenBT {

    static int n =5;
    
    static boolean isPossible(int col, int row, int board[][]){
        
        for(int i=0;i<col;i++){
            if(board[row][i]==1){
                return false;
            }
        }
        for(int i=row, j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row, j=col;i<n && j>=0;i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        return true;
    }
    static boolean solveNQ(int board[][], int col){
        if(col>=n){
            print2D(board);
            System.out.println();
            System.out.println();
        }else{
           for(int i=0;i<n;i++){
                if(isPossible(col, i, board)){
                    board[i][col] = 1;
                    solveNQ(board, col+1);
                    board[i][col] = 0;
                }
            }
        }   
        return false;
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
        int board[][] = new int[n][n];
        solveNQ(board, 0); 
    }
}
