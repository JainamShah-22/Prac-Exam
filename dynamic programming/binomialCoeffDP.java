public class binomialCoeffDP {

    static int calc(int n, int k){
        int a[][] = new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=min(i, k);j++){
                if(i==j || j==0){
                    a[i][j]=1;
                }else{
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
            }
        }
        return a[n][k];
    }

    static int min(int a, int b){
        return a>b?b:a;
    }

    public static void main(String[] args) {
        System.out.println(calc(10, 5));
    }
}
