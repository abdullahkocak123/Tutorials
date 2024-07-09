import java.util.ArrayList;

public class SumNoDuplicates {
    public int sumNoDuplicates (int[] arr){
        int result=0;
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i=0; i< arr.length;i++) {
            boolean match = false;
            for (int j=0; j< arr.length; j++) {
                if (i != j && arr[i]==arr[j]) {
                    match = true;
                    break;
                }

            }
            if (!match) {
                newList.add(arr[i]);
            }
        }
        for (Integer integer : newList) {
            result = result + integer;
        }

        return result;
    }
}
