public class jobSequencingG {

    static void sort(int profit[], int deadline[], int jobid[]){
        for(int i=0;i<profit.length-1;i++){
            for(int j =i+1;j<profit.length;j++){
                if(profit[j]>profit[i]){
                    swap(deadline, i, j);
                    swap(profit, i, j);
                    swap(jobid, i, j);
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

    static int min(int a, int b){
        return a>b?b:a;
    }

    static void sequence(int profit[], int deadline[], int jobid[], int maxDeadline){
        sort(profit, deadline, jobid);
        int time[] = new int[maxDeadline];
        for(int i=0;i<profit.length;i++){
            for(int j=deadline[i]-1;j>=0;j--){
                if(time[j]==0){
                    time[j] = jobid[i];
                    break;
                }
            }
        }
        printArr(time);
    }

    public static void main(String[] args) {
        int jobid[] = {1,2,3,4,5};
        int profit[] = {100,19,27,25,15};
        int deadline[] = {2,1,2,1,3};
        sequence(profit, deadline, jobid, 3);
    }
}
