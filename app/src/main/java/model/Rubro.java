package model;

public class Rubro {

    private Integer id;
    private String nombre;

    public Rubro(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Rubro() {

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
}
