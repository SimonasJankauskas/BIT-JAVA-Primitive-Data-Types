package lt.simonasjankauskas.app;

public class PrimityvusDuomenuTipai {
    public static void main (String[] args) {

        // 1. Min ir Max int reikšmės:
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Maximum int value:" + max);
        System.out.println("Minimum int value:" + min);

        // Kiti atsakymai
        // a) Taip, būtų galima sutalpinti visų žemėje gyvenančių žmonių skaičių į int.
        // b) Asmens kodą neišeitų patalpinti int kintamajame, todėl reikėtų naudoti "long":
        long asmensKodas = Long.MAX_VALUE;
        System.out.println("Maximum long value:" + asmensKodas);
        // PVZ
        long aK = 39011223344L;
        System.out.println("Asmens kodas:" +aK);


        //2. Pridėjus 1 prie max int value, gauname neigiamą min int value, jeigu pridėtume 1 prie min int value, gautume max int value. Dėl pavadinimo nesu tikras, bet radau tokį - Integer overflow.
        int maxPliusVienas = Integer.MAX_VALUE;
        System.out.println(maxPliusVienas + 1);

    }
}
