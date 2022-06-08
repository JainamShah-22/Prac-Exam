public class mergeSortCode {

    static void merge(int a[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int l[] = new int[n1];
        int h[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            l[i] = a[low + i];
        }
        for (int i = 0; i < n2; i++) {
            h[i] = a[mid + 1 + i];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (l[i] <= h[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = h[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = l[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = h[j];
            j++;
            k++;
        }
    }

    static void printArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void mergeSort(int a[], int low, int high) {
        if (low < high) {
            int n = (low + high) / 2;
            mergeSort(a, low, n);
            mergeSort(a, n + 1, high);
            merge(a, low, n, high);
        }
    }

    public static void main(String[] args) {
        int a[] = { 17, 14, 15, 12, 18, 4, 16, 12, 0, 123 };
        mergeSort(a, 0, a.length - 1);
        printArr(a);
    }
}
