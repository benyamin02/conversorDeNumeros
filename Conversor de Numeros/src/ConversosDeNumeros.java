import java.util.Scanner;

public class ConversosDeNumeros {
    public static void main(String[] args) {
        int menu = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("---CONVERSOR DE NUMEROS---");
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Seleccione la forma de conversion");
        System.out.println("1-Convertir de Arabigo a Romano");
        System.out.println("2-Convertir de Romano a Arabigo");
        menu = entrada.nextInt();
        switch(menu){
            case 1:
                //CONVERSOR DE ARABIGO A ROMANO
                ArabigoRomano();
                break;
            case 2:
                //CONVERSOR DE ROMANO A ARABIGO
                RomanoArabigo();
                break;
            default:
                System.out.println("Finalizo el programa");
                break;
        }
    }

    static void ArabigoRomano(){

        int u;//Unidades
        int d;//Decenas
        int c;//Centenas
        int temp = 0;
        int num;//Numero

        Scanner entrada = new Scanner(System.in);

        String[] unidad = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decena = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        //String centena = "C";

        //System.out.println("---------------------------------------");
        //System.out.println("-Ingrese el numero que desea convertir-");
        //System.out.println("---------------------------------------");

        do{
            System.out.println("---------------------------------------");
            System.out.println("-Ingrese el numero que desea convertir-");
            System.out.println("---------------------------------------");

            num = entrada.nextInt();
            if(num == 100){
                System.out.println("C");
                break;
            }

        }while(num < 0 || num > 101);


        u = num % 10;
        num /= 10;

        d = num % 10;
        num /= 10;


        for (int i=0;i < decena.length; i++){
            if (d == 9) {
                System.out.printf("%s", decena[8]);
                break;
            }else if (d == i && d != 0) {
                temp = i - 1;
                System.out.printf("%s", decena[temp]);
            }
        }

        for (int i=0;i < unidad.length; i++){
            if (u == 9) {
                System.out.printf("%s", unidad[8]);
                break;
            }else
            if (u == i && u != 0) {
                temp = i - 1;
                System.out.printf("%s", unidad[temp]);
            }
        }

    }

    static void RomanoArabigo(){

        String[] numRomanos =  {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI",
                "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI",
                "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI",
                "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII",
                "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
                "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV",
                "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV",
                "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String num;

        Scanner entrada = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("-Ingrese el numero que desea convertir-");
        System.out.println("---------------------------------------");

        num = entrada.nextLine();
        for(int i=0; i<100;i++){
            if(num.equalsIgnoreCase(numRomanos[i])){
                i+=1;
                System.out.println(i);
                break;
            }
        }
    }
}
