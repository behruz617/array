public class Main {
    public static void main(String[] args) {
        int [] A={5,6,0,4,6,0,9,0,8};
        int  n=A.length;
        int j=0;
        for (int i = 0; i <n ; i++) {
            if (A[i]!=0){
                //Swap -A[j], A[i]
                swapp(A,j,i);
                j++;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(A[i]+" "); //Print array
        }

    }

    static void swapp(int []A,int a,int b){
        int temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
}
