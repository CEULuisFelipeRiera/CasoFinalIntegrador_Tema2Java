package Animales;

public class animal {
    String especie;
    String nombre;
    String alimentacion;
    String habitat;
    String comportamiento;
    String salud;
    string id;


    public animal(String especie, String nombre, String alimentacion, String habitat, String comportamiento, String salud, string id) {
        this.especie = especie;
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.comportamiento = comportamiento;
        this.salud = salud;
        this.id = id;
    }

    //Desarrollar funciones para registrar la alimentación, salud y comportamiento de los animales, asegurando que se cumplan todas sus necesidades.

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }
    
    @Override
    public String toString() {
        return "animales []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    
}
