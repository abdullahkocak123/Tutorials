//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        int[] tripleInput = new int[] {4,3,5};
        int tripleResult = triangle.pythagoreanTriple (tripleInput);
        //System.out.println(tripleResult);

        Maskinglast4 maskinglast4 = new Maskinglast4();
        String maskingResult = maskinglast4.maskify("İbrahim");
        //System.out.println(maskingResult);

        SumNoDuplicates sumNoDuplicates = new SumNoDuplicates();
        int[] sumNoDuplicatesInput = new int[] {1,1,2,3};
        int sumNoDuplicatesResult = sumNoDuplicates.sumNoDuplicates(sumNoDuplicatesInput);
        //System.out.println(sumNoDuplicatesResult);

        ShortLongShort shortLongShort = new ShortLongShort();
        String shortLongShortInput1 = "33";
        String shortLongShortInput2 = "2";
        String shortLongShortResult = shortLongShort.solution(shortLongShortInput1,shortLongShortInput2);
        //System.out.println(shortLongShortResult);

        VowelCount vowelCount = new VowelCount();
        String vowelCountInput = "deneme";
        int vowelCountResult = vowelCount.getVowelCount(vowelCountInput);
        //System.out.println(vowelCountResult);

        Polindrom polindrom = new Polindrom();
        String polindromInput = "küçük";
        boolean polindromResult = polindrom.isPolindrom(polindromInput);
        if (polindromResult){
            //System.out.println(polindromInput + " polindromdur");
        }else{
            //System.out.println(polindromInput + " polindrom değildir");
        }

        HumanReadableTime humanReadableTime = new HumanReadableTime();
        int humanReadableTimeInput = 359999;
        String humanReadableResult = humanReadableTime.execute(humanReadableTimeInput);
        //System.out.println(humanReadableResult);

        TalToAltay talToAltay = new TalToAltay();
        String talToAltayInput = "ali ata bak !";
        String talToAltayResult = talToAltay.execute(talToAltayInput);
        //System.out.println(talToAltayResult);

        RgbToHex rgbToHex = new RgbToHex();
        String rgbToHexResult = rgbToHex.getHex(-20,275,125);
        //System.out.println(rgbToHexResult);

        NextBiggerNumber nextBiggerNumber = new NextBiggerNumber();
        long x = nextBiggerNumber.getNextBiggerNumber(10990);
        System.out.println(x);
    }
}