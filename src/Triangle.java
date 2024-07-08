public class Triangle {
    public int pythagoreanTriple(int[] triple){
        if(triple[0]*triple[0]==triple[1]*triple[1]+triple[2]*triple[2]){
            return 1;
        }else if(triple[1]*triple[1]==triple[0]*triple[0]+triple[2]*triple[2]){
            return 1;
        }else if(triple[2]*triple[2]==triple[0]*triple[0]+triple[1]*triple[1]){
            return 1;
        }else
            return 0;

    }
}
