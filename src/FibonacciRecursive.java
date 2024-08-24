public class FibonacciRecursive {
    //1, 1, 2, 3, 5
    public int execute (int number){

        if (number==1 || number==2){
            return 1;
        }

        return execute(number-1)+ execute(number-2);
    }
}
