public class sumOfSubsetsBT {

    static boolean feasible(int weights[], int startingIndex, int target,int currentSum, int totalWeight){
        if((currentSum + totalWeight >= target)){
            return true;
        }
        return false;
    }

    static void subset(int weights[], int soln[], int startingIndex, int target, int currentSum, int totalWeight){
        if(feasible(weights, startingIndex, target, currentSum, totalWeight)){
            if(currentSum == target){
                printArr(soln);
            }else{
                if(startingIndex < weights.length){
                    soln[startingIndex]=1;
                    subset(weights, soln, startingIndex+1, target, currentSum+weights[startingIndex], totalWeight-weights[startingIndex]);
                    soln[startingIndex] = 0;
                    subset(weights, soln, startingIndex+1, target, currentSum, totalWeight-weights[startingIndex]);
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
        int weights[] ={5, 7, 10, 12, 15, 18, 20}; //c
        int totalWeight = 0; //total
        for (int i : weights) {
            totalWeight+=i;
        }
        int target = 35; //m
        int currentSum =0; //
        int soln[] = new int[weights.length+1]; //soln
        subset(weights, soln, 0, target, currentSum, totalWeight);
    }
}
