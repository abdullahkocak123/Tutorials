import java.util.LinkedList;

public class SquareEveryDigit {
    public int execute (int number){
        //if (number==0){
        //    return 0;
        //}
        LinkedList <Integer> result = new LinkedList<>();
        while (number>0){
            result.push((number%10) * (number%10));
            number = number/10;
        }
        StringBuilder s = new StringBuilder();
        for (Integer i:result){
            s.append(i);
        }
        if (s.isEmpty()){
            return 0;
        }
        return Integer.parseInt(s.toString());
    }
}
