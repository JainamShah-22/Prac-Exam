public class quickSortCode {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int partition(int a[], int low, int high){
        int pivot = a[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int a[], int low, int high){
        if(low<high){
            int pivotIndex = partition(a, low, high);
            quickSort(a, low, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, high);
        }
    }

        static void printArr(int a[]){
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }

    public static void main(String[] args){
        int a[] = {10, 80, 30, 90, 40, 50, 70};
        quickSort(a, 0, a.length-1);
        printArr(a);
    }
}
