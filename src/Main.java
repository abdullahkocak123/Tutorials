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
        System.out.println(sumNoDuplicatesResult);
    }
}