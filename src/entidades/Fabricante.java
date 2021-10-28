package entidades;

public class Fabricante {

    private Integer id;
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
