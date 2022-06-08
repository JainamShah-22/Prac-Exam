public class minMax
{
    static int min(int a[], int low, int high){
        if(low==high){
            return a[low];
        }
        else{
            int x =(low+high)/2;
            int val1 = min(a, low, x);
            int val2 = min(a, x+1, high);
            if(val1>val2){
                return val2;
            }else{
                return val1;
            }
        }
    }
    static int max(int a[], int low, int high){
        if(low==high){
            return a[low];
        }
        else{
            int x =(low+high)/2;
            int val1 = max(a, low, x);
            int val2 = max(a, x+1, high);
            if(val1<val2){
                return val2;
            }else{
                return val1;
            }
        }
    }
	public static void main(String[] args) {
		int a[] = {7,6,2,9,12,15,-5,1};
        int b = max(a, 0, a.length-1);
        int c = min(a, 0, a.length-1);
        System.out.println("Max Value : "+b);
        System.out.println("Min Value : " + c);
	}
}
