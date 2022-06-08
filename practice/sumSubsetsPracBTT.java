public class sumSubsetsPracBTT{

    static boolean isPossible(int weights[], int target, int currentWeight, int weightLeft){
        if(currentWeight + weightLeft >=target){
            return true;
        }
        return false;
    }

    static void solns(int weights[], int target, int currentWeight, int weightLeft, int startingIndex, int soln[]){
        if(isPossible(weights, target, currentWeight, weightLeft)){
            if(currentWeight == target){
                printArr(soln);
            }else{
                if(startingIndex<weights.length){
                    soln[startingIndex] = 1;
                    solns(weights, target, currentWeight + weights[startingIndex], weightLeft-weights[startingIndex], startingIndex+1, soln);
                    soln[startingIndex] = 0;
                    solns(weights, target, currentWeight, weightLeft-weights[startingIndex], startingIndex+1, soln);
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
        int weights[] ={5, 7, 10, 12, 15, 18, 20};
        int target = 35;
        int weightLeft = 0;
        int currentWeight = 0;
        for (int i : weights) {
            weightLeft += i;
        }
        int soln[] = new int[weights.length];
        solns(weights, target, currentWeight, weightLeft, 0, soln);
        
    }
}