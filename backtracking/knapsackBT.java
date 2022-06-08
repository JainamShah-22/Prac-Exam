public class knapsackBT {

    static int maxProfit =0;

    static boolean isFeasible(int weight[], int currentWeight, int startingIndex, int maxWeight, int totalWeightLeft){
        if(currentWeight + totalWeightLeft >= maxWeight){
            return true;
        }
        return false;
    }
    
    static void knapsack(int weight[], int value[], int maxWeight, int currentWeight, int soln[], int startingIndex, int totalWeightLeft, int profit, int maxProfitSoln[]){
        if(isFeasible(weight, currentWeight, startingIndex, maxWeight, totalWeightLeft)){
            if(currentWeight == maxWeight){
                System.out.print("Profit : " + profit + "\t");
                printArr(soln);
                if(profit > maxProfit){
                    maxProfit = profit;
                    for(int i=0;i<soln.length;i++){
                        maxProfitSoln[i] = soln[i];
                    }
                }
            }else{
                if(startingIndex < weight.length ){
                    soln[startingIndex] = 1;
                    knapsack(weight, value, maxWeight, currentWeight+weight[startingIndex], soln, startingIndex+1, totalWeightLeft-weight[startingIndex], profit + value[startingIndex], maxProfitSoln);
                    soln[startingIndex] = 0;
                    knapsack(weight, value, maxWeight, currentWeight, soln, startingIndex+1, totalWeightLeft-weight[startingIndex] , profit, maxProfitSoln);
                }
            }
        }
    }
    
    static void printArr(int arr[]){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int weight[] = {2, 3, 4, 5};
        int value[] = {3, 4, 5, 6};
        int maxWeight = 5;
        int currentWeight = 0;
        int soln[] = new int[weight.length];
        int totalWeightLeft =0;
        for (int i : value) {
            totalWeightLeft += i;
        }
        int maxProfitSoln[] = new int[weight.length];
        knapsack(weight, value, maxWeight, currentWeight, soln, 0, totalWeightLeft, 0, maxProfitSoln);
        System.out.print("\nMax Profit = " + maxProfit + "\nThe Objects used are : ");
        printArr(maxProfitSoln);
    }

}
