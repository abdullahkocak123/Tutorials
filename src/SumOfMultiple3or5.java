import java.util.HashSet;
import java.util.Set;

public class SumOfMultiple3or5 {
    public int execute (int number){
        Set<Integer> numberSet = new HashSet<>();

        for (int i=1; 3*i<number;i++){
            numberSet.add(3*i);
        }
        for (int i=1; 5*i<number;i++){
            numberSet.add(5*i);
        }
        return numberSet.stream().reduce(0,(a,b) -> a+b);
    }
}
