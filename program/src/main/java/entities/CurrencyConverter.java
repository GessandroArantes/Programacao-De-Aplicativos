package entities;

import java.util.Scanner;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dolarParaReal(double quantia, double cotacaoDolar) {
        return quantia * cotacaoDolar * (1.0 + IOF);
    }
}


        
