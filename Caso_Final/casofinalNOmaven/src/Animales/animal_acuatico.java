package Animales;

public class animal_acuatico extends animal {

    boolean aletas;
    boolean branquias;
    boolean escamas;
    string tipo_agua;

    public animal_acuatico(String especie, String nombre, String alimentacion, String habitat, String comportamiento, String salud, String id, boolean aletas, boolean branquias, boolean escamas, String tipo_agua) {
        super(especie, nombre, alimentacion, habitat, comportamiento, salud, id);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.tipo_agua = tipo_agua;
    }

    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public boolean isBranquias() {
        return branquias;
    }

    public void setBranquias(boolean branquias) {
        this.branquias = branquias;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public string getTipo_agua() {
        return tipo_agua;
    }

    public void setTipo_agua(string tipo_agua) {
        this.tipo_agua = tipo_agua;
    }

    @Override
    public String toString() {
        return "animal_acuatico [aletas=" + aletas + ", branquias=" + branquias + ", escamas=" + escamas
                + ", tipo_agua=" + tipo_agua + "]";
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

    @Override
    public String getAlimentacion() {
        // TODO Auto-generated method stub
        return super.getAlimentacion();
    }

    @Override
    public String getComportamiento() {
        // TODO Auto-generated method stub
        return super.getComportamiento();
    }

    @Override
    public String getEspecie() {
        // TODO Auto-generated method stub
        return super.getEspecie();
    }

    @Override
    public String getHabitat() {
        // TODO Auto-generated method stub
        return super.getHabitat();
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return super.getNombre();
    }

    @Override
    public String getSalud() {
        // TODO Auto-generated method stub
        return super.getSalud();
    }

    @Override
    public void setAlimentacion(String alimentacion) {
        // TODO Auto-generated method stub
        super.setAlimentacion(alimentacion);
    }

    @Override
    public void setComportamiento(String comportamiento) {
        // TODO Auto-generated method stub
        super.setComportamiento(comportamiento);
    }

    @Override
    public void setEspecie(String especie) {
        // TODO Auto-generated method stub
        super.setEspecie(especie);
    }

    @Override
    public void setHabitat(String habitat) {
        // TODO Auto-generated method stub
        super.setHabitat(habitat);
    }

    @Override
    public void setNombre(String nombre) {
        // TODO Auto-generated method stub
        super.setNombre(nombre);
    }

    @Override
    public void setSalud(String salud) {
        // TODO Auto-generated method stub
        super.setSalud(salud);
    }

}
