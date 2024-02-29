package Gestion_Habitat;

/**
 * This class represents aquatic animals that live in a specific habitat.
 * It extends the habitat class.
 */
public class acuaticos extends habitat {

    boolean puedenadar;

    public acuaticos(int temperatura, int humedad, boolean limpieza, boolean puedenadar) {
        super(temperatura, humedad, limpieza);
        this.puedenadar = puedenadar;
        //TODO Auto-generated constructor stub
    }

    public boolean isPuedenadar() {
        return puedenadar;
    }

    public void setPuedenadar(boolean puedenadar) {
        this.puedenadar = puedenadar;
    }

    @Override
    public String toString() {
        return "acuaticos []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public int getHumedad() {
        // TODO Auto-generated method stub
        return super.getHumedad();
    }

    @Override
    public int getTemperatura() {
        // TODO Auto-generated method stub
        return super.getTemperatura();
    }

    @Override
    public boolean isLimpieza() {
        // TODO Auto-generated method stub
        return super.isLimpieza();
    }

    @Override
    public void setHumedad(int humedad) {
        // TODO Auto-generated method stub
        super.setHumedad(humedad);
    }

    @Override
    public void setLimpieza(boolean limpieza) {
        // TODO Auto-generated method stub
        super.setLimpieza(limpieza);
    }

    @Override
    public void setTemperatura(int temperatura) {
        // TODO Auto-generated method stub
        super.setTemperatura(temperatura);
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    

    
}
