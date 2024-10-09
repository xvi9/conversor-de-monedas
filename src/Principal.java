import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        EXTERNA:
        while (true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - peso ARS a USD\n" +
                    "2 - peso BOB a USD\n" +
                    "3 - peso BRL a USD\n" +
                    "4 - peso CLP a USD\n" +
                    "5 - peso COP a USD\n" +
                    "6 - peso RD a USD\n" +
                    "7 - peso MXN a USD\n" +
                    "8 - !SALIENDO DEL PROGRAMA¡");
            System.out.println("!INGRESE UNA OPCION¡: ");
            Scanner lectura = new Scanner(System.in);
            char opcion = lectura.next().charAt(0);

            switch (opcion){
                case '1':
                    convertir(974.26, "pesos Argentinos");
                    break;
                case '2':
                    convertir(762.20, "pesos Bolivianos");
                    break;
                case '3':
                    convertir(5.54, "real Brasileño");
                    break;
                case '4':
                    convertir(934.58, "pesos Chilenos");
                    break;
                case '5':
                    convertir(4220.74, "pesos Colombianos");
                    break;
                case '6':
                    convertir(60.20, "pesos dominicanos");
                    break;
                case '7':
                    convertir(19.36, "pesos mexicanos");
                    break;
                case '8':
                    System.out.println("¡CERRANDO EL PROGRAMA! " +
                            "GRACIAS POR UTLIZAR NUESTROS SERVIVIOS!");
                    break EXTERNA;
                default:
                    System.out.println("OPCION INCORRECTA!");
                    break;

            }
        }
    }

    static void convertir(double valorDolar, String pais){
        Scanner lectura =  new Scanner(System.in);
        System.out.println("Ingrese la cantidad de $ : " + pais);
        double cantidadMoneda = lectura.nextDouble();

        double dolares = cantidadMoneda / valorDolar;
        dolares = (double) Math.round(dolares * 100)/100;

        System.out.println("********************************");
        System.out.println("|  Tienes $ "+dolares+" Dolares  |");
        System.out.println("********************************");

    }
}
