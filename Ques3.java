public class Ques3 {
    public static void main(String[] args) {
        int n=5;
        //analyse from here
        int i, j, k = 0;
        for (i = n / 2; i <= n; i++) {
            for (j = 2; j <= n; j = j* 2) {
                k = k + n / 2;            //for this loop (j) the complexity will be O(logn)
            }
        }                                //for this loop (i) the complexity will be (nlogn)
    }
}
//final complexity is (nlogn)