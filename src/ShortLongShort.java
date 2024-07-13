public class ShortLongShort {
    public String solution(String a, String b) {
        if (a.length()> b.length()){
            return b+a+b;
        }
        else {
            return a+b+a;
        }
    }
}
