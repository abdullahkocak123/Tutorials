public class Fibonacci {
    //1, 1, 2, 3, 5
    public int execute (int number){
        int x=1;
        int y=1;
        for (int i=2; i<number; i++){
            int temp=x;
            x=y;
            y=temp+y;
        }
        return y;
    }
}
