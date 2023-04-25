public class Ques5 {
    public static void main(String[] args) {
        int n=5,k=0;
        for(int i=0;i<n;i++){
            i*=k;        //incrementation will be of k^n for each iteration (such as k^0, k^1, k^2.....etc).
                         // when i*=a, a is any integer, then complexity always O(loga n) where base is a.
        }
    }
}
//hence the final complexity will be O(logk n)    here k is base.

