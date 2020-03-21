package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JarvisData {

    private List<Gastos> gastos;
    private List<Descripciones> descripciones;
    private List<Rubro> rubros;


    public List<Gastos> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gastos> gastos) {
        this.gastos = gastos;
    }

    public List<Descripciones> getDescripciones() {
        return descripciones;
    }

    public void setDescripciones(List<Descripciones> descripciones) {
        this.descripciones = descripciones;
    }

    public List<Rubro> getRubros() {
        return rubros;
    }

    public void setRubros(List<Rubro> rubros) {
        this.rubros = rubros;
    }

    public JarvisData() {
        this.gastos = new ArrayList<>();
        this.descripciones = initDescripciones();
        this.rubros = initRubros();
    }

    private List<Descripciones> initDescripciones(){
        List<Descripciones> lp = new ArrayList<>();
        Descripciones p1 = new Descripciones(1, "Alimentos");
        Descripciones p2 = new Descripciones(2, "Limpieza");
        Descripciones p3 = new Descripciones(3, "Pagos");
        Descripciones p4 = new Descripciones(4, "Nafta");
        Descripciones p5 = new Descripciones(5, "Otros");

        lp.add(p1);
        lp.add(p2);
        lp.add(p3);
        lp.add(p4);
        lp.add(p5);

        return  lp;
    }

    private List<Rubro> initRubros(){
        List<Rubro> lr = new ArrayList<>();
        Rubro r1 = new Rubro(1,"Ancap");
        Rubro r2 = new Rubro(2,"Ute");
        Rubro r3 = new Rubro(3,"Super");
        Rubro r4 = new Rubro(4,"Restaurante");
        Rubro r5 = new Rubro(5,"Otros");

        lr.add(r1);
        lr.add(r2);
        lr.add(r3);
        lr.add(r4);
        lr.add(r5);

        return lr;
    }

}
