public class quickSortPracDAC {

    static void swap(int a[], int i, int j){
        int temp =a[j];
        a[j] = a[i];
        a[i] = temp;
    }
    
    static int partition(int a[], int min, int max){
        int pivot= a[min];
        int i=min+1, j=max;
        while(i<j){
            do{
                i++;
            }while(a[i]<=pivot);
            do{
                j--;
            }while(a[j]>pivot);

            if(i<j){
                swap(a, i, j);
            }
        }
        swap(a, min, j);
        return j;
    }

    static void quickSort(int a[], int min, int max){
        if(min<max){
            int j = partition(a, min, max);
            quickSort(a, min, j-1);
            quickSort(a, j+1, max);
        }
    }
    
    static void printArr(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {10, 8, 80, 30, 90, 40, 50, 70};
            quickSort(a, 0, a.length-1);
            printArr(a);
    }
}
