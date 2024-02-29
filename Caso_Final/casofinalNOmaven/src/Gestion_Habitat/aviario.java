package Gestion_Habitat;

public class aviario {

    boolean puedenVolar;

    public aviario(int temperatura, int humedad, boolean limpieza, boolean puedeVolar) {
        super(temperatura, humedad, limpieza);
        this.puedenVolar = puedenVolar;
        //TODO Auto-generated constructor stub
    }

    // Super method
    public void superMethod() {
        super.superMethod();
    }

    // Clone method
    public aviario clone() {
        return (aviario) super.clone();
    }

    // toString method
    @Override
    public String toString() {
        return "aviario []";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    
}
