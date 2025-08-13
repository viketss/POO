package Prueba;

public class Productos {
    // atributos
    private float precio;
    private String nombre;
    private int codigoDeProducto;
    private String marca;

    // crear el constructor
    public Productos(float precio, String nombre, int codigoDeProducto, String marca) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigoDeProducto = codigoDeProducto;
        this.marca = marca;
    }

    // constructor prueba
    public Productos() {
        precio = 0;
        nombre = "ProductoX";
        codigoDeProducto = 0;
        marca = "Marca";
    }

    // SETTER

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigoDeProducto(int codigoDeProducto) {
        this.codigoDeProducto = codigoDeProducto;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // GETTER

    public float getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCodigoDeProducto() {
        return codigoDeProducto;
    }
    public String getMarca() {
        return marca;
    }
}
