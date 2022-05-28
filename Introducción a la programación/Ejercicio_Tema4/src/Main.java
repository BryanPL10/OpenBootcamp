public class Main {
    public static void main(String[] args) {
        //LLamo a las funciones en el main
        If();
        While();
        DoWhile();
        For();
        Switch();
    }
    //Condicionales if/else if/else
    public static void If() {
        System.out.println("1.-Condicionales if/else if/else");

        int numeroif = 1;

        if (numeroif > 0) {
            System.out.println("El numero"+" "+numeroif+" "+"es positivo");
        } else if (numeroif < 0) {
            System.out.println("El numero"+" "+numeroif+" "+"es negativo");
        } else {
            System.out.println("El numero"+" "+numeroif+" "+"es cero");
        }
    }
    //Bucle while
    public static void While() {
        System.out.println("\n"+"2.-Bucle while");
        int numeroWhile = 1;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor actual de la variable es"+" "+numeroWhile);
        }
    }
    //Bucle do while
    public static void DoWhile() {
        System.out.println("\n"+"3.-Bucle do while");
        int numeroDoWhile = 2;
        do {
            numeroDoWhile ++;
            System.out.println("El valor actual de la variable es"+" "+numeroDoWhile);
        }while (numeroDoWhile < 3);
    }
    //Bucle For
    public static void For() {

        System.out.println("\n"+"4.-Bucle For");

        for( int numeroFor= 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor actual de la variable es"+" "+numeroFor);
        }
    }
    //Bucle Switch
    public static void Switch() {
        System.out.println("\n"+"5.-Bucle Switch");
        String estacion ="Invierno";
        switch (estacion){

            case "Verano":
                System.out.println("La estacion es Verano");
                break;
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;
            case "Otoño":
                System.out.println("La estacion es Otoño");
                break;
            case "Invierno":
                System.out.println("La estacion es Invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }

}