public class NextBiggerNumber {
    public long getNextBiggerNumber (long n){
        String strN = String.valueOf(n);
        int length = strN.length();
        long result = Long.MAX_VALUE;
        for (int i=0; i<length; i++){
            for (int j = 0; j < length; j++) {
               int newNumber = swap(strN,i,j);
               if (newNumber>n && newNumber<result){
                   result=newNumber;
               }
            }
        }
        if (result == Long.MAX_VALUE){
            return -1;
        }
        return result;
    }

    public int swap (String word, int index1, int index2){
        char[] newWordArray = word.toCharArray();
        char temp = newWordArray[index1];
        newWordArray[index1]=newWordArray[index2];
        newWordArray[index2]=temp;
        //System.out.println(index1);
        //System.out.println(index2);
        //System.out.println(Integer.valueOf(String.valueOf(newWordArray)));
        return Integer.valueOf(String.valueOf(newWordArray));

    }
}
