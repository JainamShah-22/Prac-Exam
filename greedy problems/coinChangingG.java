public class coinChangingG {
    
    static void sort(int coins[]){
        for(int i=0;i<coins.length-1;i++){
            for(int j =i+1;j<coins.length;j++){
                if(coins[j]>coins[i]){
                    swap(coins, i, j);
                }
            }
        }
    }

    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printArr(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void numOfCoins(int coins[], int amount){
        sort(coins);
        int x =0;
        while(amount!=0){
            for(int i=0;i<coins.length;i++){
                if(coins[i]<=amount){
                    amount -= coins[i];
                    System.out.print(coins[i] + " ");
                    x++;
                    break;
                }
            }
        }
        System.out.println();
        System.out.println(x);
    }

    public static void main(String[] args) {
        int coins[]= {1,2,5,10,20,50,100,500,1000};
        int amount = 93;

        numOfCoins(coins, amount);
    }
}
