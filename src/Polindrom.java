public class Polindrom {
    public boolean isPolindrom (String str){
        char[] list = str.toCharArray();
        for (int i=0; i< list.length; i++){
            if (list[i]!=list[list.length - i-1]){
                return false;
            }
        }
        return true;
    }
}
