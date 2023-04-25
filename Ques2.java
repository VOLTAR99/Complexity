public class Ques2 {
    public static void main(String[] args) {
        int i,j,N=5;
        //analyse from here
        int a = 0;
        for (i = 0; i < N; i++) {
            for (j = N; j > i; j--) {
                a = a + i + j;                 //Ultimately complexity is O(N*N)
            }
        }
    }
}
