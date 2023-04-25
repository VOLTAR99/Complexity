public class Ques1 {
    public static void main(String[] args) {
        int i,j,N=5,M=5;
        //from here
        int a = 0, b = 0;
        for (i = 0; i < N; i++) {
            a = a + i;                             //operations = 3N+3, which is N
        }
        for (j = 0; j < M; j++) {
            b = b + j;                             //operations = 3M+1, which is M
        }
    }
}
//Ultimately time complexity is O(N+M) and space is O(1)