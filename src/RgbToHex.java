public class RgbToHex {
    public String getHex(int r, int g, int b){
        int validR = convertTOValidNumber(r);
        int validG = convertTOValidNumber(g);
        int validB = convertTOValidNumber(b);
        String hexr = String.format("%02X", validR);
        String hexg = String.format("%02X", validG);
        String hexb = String.format("%02X", validB);
        return hexr+hexg+hexb;
    }

    private int convertTOValidNumber(int x){
        int converted = x;
        if (x<0){
            converted = 0;
        }else if(x>255){
            converted = 255;
        }
        return converted;
    }
    private int convertTOValidNumber2(int x){

        if (x<0){
            return 0;
        }else if(x>255){
            return 255;
        }
        return x;
    }
}
