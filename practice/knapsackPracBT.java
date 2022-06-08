public class knapsackPracBT {
    
    static boolean isPoss(int maxWeight, int currentWeight, int totalWeightLeft){
        if(currentWeight + totalWeightLeft >= maxWeight){
            return true;
        }
        return false;
    }

    static void knap(int weight[], int value[], int maxWeight, int currentWeight, int soln[], int startingIndex, int profit, int totalWeightLeft){
        if(isPoss(maxWeight, currentWeight, totalWeightLeft)){
            if(currentWeight == maxWeight){
                printArr(soln);
                System.out.println(profit);
            }else{
                if(startingIndex<weight.length){
                    soln[startingIndex] = 1;
                    knap(weight, value, maxWeight, currentWeight + weight[startingIndex], soln, startingIndex+1, profit + value[startingIndex], totalWeightLeft - weight[startingIndex]);
                    soln[startingIndex] = 0;
                    knap(weight, value, maxWeight, currentWeight, soln, startingIndex+1, profit, totalWeightLeft - weight[startingIndex]);
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
        int currentWeight =0;
        int totalWeightLeft = 0;
        for (int i : weight) {
            totalWeightLeft += i;
        }
        int soln[] = new int[weight.length];
        knap(weight, value, maxWeight, currentWeight, soln, 0, 0, totalWeightLeft);
        
    }
}
