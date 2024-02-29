package Gestion_Habitat;

import Gestion_Habitat.habitat;

public class terrestres extends habitat {

    boolean puedeCaminar;

    public terrestres(int temperatura, int humedad, boolean limpieza, boolean puedeCaminar) {
        super(temperatura, humedad, limpieza);
        this.puedeCaminar = puedeCaminar;
        //TODO Auto-generated constructor stub
    }

    
    public boolean isPuedeCaminar() {
        return puedeCaminar;
    }


    public void setPuedeCaminar(boolean puedeCaminar) {
        this.puedeCaminar = puedeCaminar;
    }

    public void agregarHabitat() {
        // TODO implement here
    }

    @Override
    public String toString() {
        return "terrestres []";
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    

}
