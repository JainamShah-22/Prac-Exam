public class permBT {

    static void swap(char []a, int startingIndex, int end){
        char temp = a[end];
        a[end] = a[startingIndex];
        a[startingIndex] = temp;
    }
    
    static void temp(char a[], int startingIndex, int end){
        if(startingIndex == end){
            System.out.println(a);
        }else if(startingIndex < end){
            for(int i =startingIndex;i<end;i++){
                swap(a, startingIndex, i);
                temp(a, startingIndex+1, end);
                swap(a, startingIndex, i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        char a[] = str.toCharArray();
        int end = a.length;
        temp(a, 0, end);
    }
}
