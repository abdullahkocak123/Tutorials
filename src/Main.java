//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        int[] triple = new int[] {4,3,5};
        int result = triangle.pythagoreanTriple (triple);
        //System.out.println(result);

        Maskinglast4 maskinglast4 = new Maskinglast4();
        String result2 = maskinglast4.maskify("İbrahim");
        System.out.println(result2);
    }
}