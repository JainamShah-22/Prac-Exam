public class containerLoadingG {
    
    static void sort(int items[], int weight[]){
        for(int i=0;i<weight.length-1;i++){
            for(int j =i+1;j<weight.length;j++){
                if(weight[j]<weight[i]){
                    swap(items, i, j);
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
    
    static void fill(int items[], int weight[], int totalWeight){
        sort(items, weight);
        int i=0;
        while(weight[i]<totalWeight){
            totalWeight -= weight[i];
            i++;
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {
        int totalWeight = 400;
        int items[] = {1,2,3,4,5,6,7,8};
        int weight[] = {100,200,50,150,90,50,20,80};
        fill(items, weight, totalWeight);
    }
}