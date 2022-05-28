public class Main {

    public static void main(String[] args) {
        //Ejercicio1

        //Llamo la función suma y le doy 3 valores
        int resultado = suma(4, 5, 6);
        System.out.println("1.la suma de los tres numeros es:"+resultado);

        //Ejercicio2

        //Creación de un objeto de la clase Coche
        Coche miCoche = new Coche();
        //Uso mi objeto miCoche aplicando un método para aumentar una puerta al coche
        miCoche.AumentarPuertas();
        System.out.println("2.El coche tiene"+" "+miCoche.numpuertas+" "+"puerta(s)");
    }
    //Función Suma con 3 parámetros
    public  static int suma( int num1, int num2 , int num3) {
        // Retonarno de los valores dados con la opereacion suma
        return num1 + num2 + num3;
    }
}

//Clase Coche
class Coche{
        //Variable Numérica
        public int numpuertas =3;

        // Función AumentarPuertas
        public  void AumentarPuertas(){
            //Incremento a mi variable numerica
            this.numpuertas++;
    }
}