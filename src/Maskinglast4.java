public class Maskinglast4 {
    public String maskify(String str) {
        for (int i=0; i<str.length(); i++){
            if (i<str.length()-4){
                str=str.substring(0,i)+"#"+str.substring(i+1);
            }
        }
        return str;
    }
}
