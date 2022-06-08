public class fractionalKnapsackG {

    static void sort(int profit[], int weight[]){
        int ratio[] = new int[profit.length];
        for(int i=0;i<profit.length;i++){
            ratio[i] = profit[i]/weight[i];
        }
        for(int i=0;i<ratio.length-1;i++){
            for(int j =i+1;j<ratio.length;j++){
                if(ratio[j]>ratio[i]){
                    swap(ratio, i, j);
                    swap(profit, i, j);
                    swap(weight, i, j);
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

    static void optimalSoln(int profit[], int weight[], int sackWeight){
        sort(profit, weight);
        int finalProfit = 0;
        int i;
        for(i=0;i<weight.length;i++){
            if(sackWeight > weight[i]){
                sackWeight -= weight[i];
                finalProfit += profit[i];
                continue;
            }
            System.out.println(i);
            break;
        }
        while(sackWeight>0){
            finalProfit += profit[i]/weight[i];
            sackWeight--;
        }
        System.out.println(finalProfit);
    }

    public static void main(String[] args) {
        int profit[] = {280,100,120,120};
        int weight[] = {40,10,20,24};
        int sackWeight = 60; 
        optimalSoln(profit, weight, sackWeight);
    }
}
