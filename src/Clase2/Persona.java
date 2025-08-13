package Prueba;

public class Persona { //superclase
    // variables: definir atributos
    private String nombre; // atributo privado --> no se permite acceder/usar desde otra clase
    public int edad;

    // definir constructor 1
    public Persona(){ //mismo nombre de la clase
        // persona "base"
        nombre = "";
        edad = 0;
    }
    // definir constructor 2
    public Persona(String nombre, int edad) { //pasar los valores que va a recibir como parametros
        this.nombre = nombre; // this --> refiere a pasar lo que esta en el parametro
        this.edad = edad;
    }

    // ATAJO: click derecho - generate - setter/getter/constructor
    // SET:
    public void setNombre(String nombre) { // asignar valor a un atributo privado
        this.nombre = nombre;
    }
    // GET:
    public String getNombre() {
        return nombre;
    }
}
