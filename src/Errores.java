import java.util.Scanner;

public class Errores {

    double valorNuevo = 0;

    public void primerCaso(double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();

        System.out.println("Escribe la cantidad de Dolares a convertir");
        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("USD", "ARS", valor);
        } catch (Exception i) {
            System.out.println("El valor solicitado es numérico. Escribe un valor numérico para continuar");
            primerCaso(valorNuevo);
        }
    }

    public void segundoCaso(double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();

        System.out.println("Escribe la cantidad de Pesos Argentinos a convertir");
        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("ARS", "USD", valor);
        } catch (Exception i) {
            System.out.println("El valor solicitado es numérico. Escribe un valor numérico para continuar");
            segundoCaso(valorNuevo);
        }
    }

    public void tercerCaso(double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();

        System.out.println("Escribe la cantidad de Dolares a convertir");
        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("USD", "BRL", valor);
        } catch (Exception i) {
            System.out.println("El valor solicitado es numérico. Escribe un valor numérico para continuar");
            tercerCaso(valorNuevo);
        }
    }

    public void cuartoCaso (double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();

        System.out.println("Escribe la cantidad de Reales Brasileños a convertir");
        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("BRL", "USD", valor);
        } catch (Exception i) {
            System.out.println("El valor solicitado es numérico. Escribe un valor numérico para continuar");
            cuartoCaso(valorNuevo);
        }
    }

    public void quintoCaso (double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();

        System.out.println("Escribe la cantidad de Dolares a convertir");
        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("USD", "COP", valor);
        } catch (Exception i) {
            System.out.println("El valor solicitado es numérico. Escribe un valor numérico para continuar");
            quintoCaso(valorNuevo);
        }
    }

    public void sextoCaso (double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();

        System.out.println("Escribe la cantidad de Pesos Colombianos a convertir");
        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("COP", "USD", valor);
        } catch (Exception i) {
            System.out.println("El valor solicitado es numérico. Escribe un valor numérico para continuar");
            sextoCaso(valorNuevo);
        }
    }
}

