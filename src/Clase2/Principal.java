package Clase2;

public class Principal {
    public static void main(String[] args) { //psvm --> atajo para crear el main
        // tipo de dato: otra clase del paquete
        /*Persona laPersona = new Persona("Julieta", 22); // crear persona

        System.out.println("La persona se llama: " + laPersona.getNombre()); // acceder al atributo --> variable.atributo
        System.out.println("tiene: " + laPersona.edad);*/

        Empleado elEmpleado = new Empleado("Lautaro", 21, "Programador Backend"); // crear empleado
        System.out.println("Nombre: " + elEmpleado.getNombre()); // privado
        System.out.println("Edad: " + elEmpleado.edad); // publico
        System.out.println("Puesto: " + elEmpleado.getPuesto()); // privado
    }
}
