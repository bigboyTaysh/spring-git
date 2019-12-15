package pl.patryk.gitspring.lambda;



public class LambdaExample {
    public static void main(String[] args) {
        //dodawanie
        System.out.println(performCalculations(1, 2, (a, b) -> a + b));

        //mnozenie
        System.out.println(performCalculations(1, 2, (a, b) -> a * b));
    }

    private static int performCalculations(int first,
                                           int second,
                                           Calculations calculations){
        return calculations.calc(first, second);
    }


}
