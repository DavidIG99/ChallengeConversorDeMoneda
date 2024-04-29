import java.util.Scanner;

public class Opciones {

    double valorAConvertir = 0;
    Errores caso = new Errores();
    int opcionDelUsuario = 0;

    String menu = """
                ********************************************************
                Sea bienvenido al conversor de moneda =)
                                
                1) Dolar =>> Peso Argentino
                2) Peso Argentino =>> Dolar
                3) Dolar =>> Real Brasileño
                4) real Brasileño =>> Dolar
                5) Dolar =>> Peso Colombiano
                6) Peso Colombiano =>> Dolar
                7) Salir
                Digite una opción del 1 al 6 para continuar, si desea finalizar la aplicación digite la opción 7
                                
                ********************************************************
                """;

    public void opcionesElegibles() {

        Scanner lectura = new Scanner(System.in);

        while (opcionDelUsuario != 7) {

            System.out.println(menu);

            try {
                opcionDelUsuario = lectura.nextInt();
            } catch (Exception e) {
                System.out.println("Opcion invalida. por favor digite una opción del 1 al 6 o si desea finalizar la aplicación digite la opción 7");
                opcionesElegibles();
            }
            switch (opcionDelUsuario) {

                case 1:
                    caso.primerCaso(valorAConvertir);
                    break;

                case 2:

                    caso.segundoCaso(valorAConvertir);
                    break;

                case 3:

                    caso.tercerCaso(valorAConvertir);
                    break;

                case 4:

                    caso.cuartoCaso(valorAConvertir);
                    break;

                case 5:

                    caso.quintoCaso(valorAConvertir);
                    break;

                case 6:

                    caso.sextoCaso(valorAConvertir);
                    break;

                case 7:

                    System.out.println("Finalizando aplicación. Gracias por utilizar nuestros servicios");
                    break;

                default:

                    System.out.println("Esta opción no esta disponible, por favor digite una opción del 1 al 6 o si desea finalizar la aplicación digite la opción 7");
                    break;

            }
        }
    }
}

