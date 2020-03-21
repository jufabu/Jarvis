package model;

import java.util.Date;
import java.util.List;

public class Gastos {

    private String id;
    private Date fecha;
    private Integer importe;
    private List<Rubro> rubro;
    private List<Descripciones> descripciones;

    public Gastos(String id, Date fecha, Integer importe, List<Rubro> rubro, List<Descripciones> descripciones) {
        this.id = id;
        this.fecha = fecha;
        this.importe = importe;
        this.rubro = rubro;
        this.descripciones = descripciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public List<Rubro> getRubro() {
        return rubro;
    }

    public void setRubro(List<Rubro> rubro) {
        this.rubro = rubro;
    }

    public List<Descripciones> getDescripciones() {
        return descripciones;
    }

    public void setDescripciones(List<Descripciones> descripciones) {
        this.descripciones = descripciones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
