public class minMaxDAC {
    
    static int min(int a[], int low, int high){
        if(low == high){
            return a[low];
        }
        int mid = (low+high)/2;
        int x = min(a, low, mid);
        int y = min(a, mid + 1 , high);
        return x>y?y:x;
    }

    static int max(int a[], int low, int high){
        if(low == high){
            return a[low];
        }
        int mid = (low+high)/2;
        int x = max(a, low, mid);
        int y = max(a, mid + 1 , high);
        return x>y?x:y;
    }

    public static void main(String[] args) {
        int a[] = {123,15,24,2131,61,2};
        System.out.println(min(a, 0, a.length-1));
        System.out.println(max(a, 0, a.length-1));
        // max(a, 0, a.length-1);
    }
}
