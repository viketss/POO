package Clase2;

public class Empleado extends Persona { //subclase de persona --> extends Clase: hereda de la clase Persona
    // protected --> herede la clase hija
    private String puesto;

    // atajo generate constructor
    public Empleado(String puesto) {
        this.puesto = puesto;
    }

    public Empleado(String nombre, int edad, String puesto) { // atributos propios y de la superclase
        super(nombre, edad); // super --> usa constructor de la clase padre (persona)
        this.puesto = puesto;
    }

    // GETTER Y SETTER
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }



}
