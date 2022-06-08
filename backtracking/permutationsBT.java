public class permutationsBT {
    
    static void permute(char a[], int i, int n){
        if(i == n){
            System.out.println(a);
        }else if(i<n){
            for(int j =i;j<n;j++){
                swap(a, i, j);
                permute(a, i+1, n);
                swap(a, i, j);
            }
        }
    }

    static void swap(char a[], int i, int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

     public static void main(String[] args) {
        String str = "abc";
        char a[] = str.toCharArray();
        int n = str.length();
        System.out.println(n);
        permute(a, 0, n);
    }

}
