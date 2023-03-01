public class Main {
    public static void main(String[] args) {
        System.out.println("GUIA CLASE 1");
        int numIn = 5;
        int numFn = 14;
        int iNpar = 13;
        System.out.println("Ejercicio 1A");
        while (numIn <= numFn) {
            System.out.println(numIn);
            numIn = numIn + 1;
        }
        System.out.println("Ejercicio 1B");
        for (int numPar = 6; numPar <= numFn;){
            System.out.println(numPar);
            numPar = numPar + 2;
        }
        System.out.println("Ejercicio 1C");
        while (iNpar >= 4){
            System.out.println(iNpar);
            iNpar = iNpar - 2;
        }
        System.out.println("Ejercicio 1D");
        for (int reves = 14; reves >= 6;){
            System.out.println(reves);
            reves = reves - 2;
        }
        System.out.println("Ejercicio 2");
        int ingresos = 489083;
        int autos0km = 3;
        int casas = 3;
        boolean capEc = true;

        if ((ingresos >= 489083) &&
                (autos0km >= 3) &&
                (casas >= 3) && (capEc)) {
            System.out.println("pertenece al segmento de ingresos altos");
        } else if ((ingresos <= 489083) &&
                (autos0km <= 3) &&
                (casas <= 3) && (capEc = false)) {
            System.out.println("no pertenece al segmento de ingresos altos");
        }

    }
}