package entidades;

public class Producto {

    private Integer id;
    private String nombre;
    private double precio;
    private Integer id_fabricante;

    public Producto() {
    }

    public Producto(Integer id, String nombre, double precio, Integer id_fabricante) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.id_fabricante = id_fabricante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(Integer id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", id_fabricante=" + id_fabricante + '}';
    }
    
   
}
