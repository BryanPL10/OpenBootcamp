public class Main {
    public static void main(String[] args) {
        //Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Bryan");
        cliente.setEdad(26);
        cliente.setTelefono(1234512345);
        cliente.setCredito(5.525);

        System.out.println("---CLIENTE---");
        System.out.println("Nombre:"+cliente.getNombre());
        System.out.println("Edad:"+cliente.getEdad());
        System.out.println("Telefono:"+cliente.getTelefono());
        System.out.println("Credito:"+"$"+cliente.getCredito());

        //Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Alvaro");
        trabajador.setEdad(27);
        trabajador.setTelefono(1234554123);
        trabajador.setSalario(7.325);

        System.out.println("\n"+"---TRABAJADOR---");
        System.out.println("Nombre:"+trabajador.getNombre());
        System.out.println("Edad:"+trabajador.getEdad());
        System.out.println("Telefono:"+trabajador.getTelefono());
        System.out.println("Salario:"+"$"+trabajador.getSalario());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private long telefono;

    //Metodos de la clase Persona
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
     private double credito;

    //Metodos de la clase Cliente
    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends  Persona {
    private double salario;

    //Metodos de la clase Trabajador
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}