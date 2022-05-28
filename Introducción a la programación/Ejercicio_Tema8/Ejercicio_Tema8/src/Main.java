public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(26);
        persona.setNombre("Bryan");
        persona.setTelefono(1245123451);

        System.out.println("Nombre:"+persona.getNombre());
        System.out.println("Edad:"+persona.getEdad());
        System.out.println("Telefono:"+persona.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private long telefono;

    //Se realizar la encapsulacion de las propiedades en la clase, mediante sets y gets.
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getTelefono() {
        return telefono;
    }

}