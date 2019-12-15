package pl.patryk.gitspring.lambda;



public class StringExample {
    public static void main(String[] args) {
        //dodawanie
        System.out.println(strMethod("Pat", "wol", "22", (imie, nazwisko, wiek) -> imie+":"+nazwisko+", w wieku " + wiek));

    }

    private static String strMethod(String first,
                           String second,
                           String third,
                                 StringInterface stringInterface){
        return stringInterface.strMethod(first, second, third);
    }
}
