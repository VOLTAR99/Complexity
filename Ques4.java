public class Ques4 {
    public static void main(String[] args) {
        int N=5;
        //analyse form here
        int a = 0, i = N;
        while (i > 0) {
            a += i;
            i /= 2;          //the complexity here will be (logN)
        }
    }
}
//final complexity is O(logN)
