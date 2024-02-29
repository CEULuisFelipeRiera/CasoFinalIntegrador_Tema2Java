package Animales;

public class animal_terrestres extends animal{
    boolean patas;
    boolean cola;
    boolean pelaje;
    String tipo;

    public animal_terrestres(String especie, String nombre, String alimentacion, String habitat, String comportamiento, String salud, String id, String tipo, int edad, double peso) {
        super(especie, nombre, alimentacion, habitat, comportamiento, salud, id);
        this.tipo = tipo;
        this.edad = edad;
        this.peso = peso;
    }
}
