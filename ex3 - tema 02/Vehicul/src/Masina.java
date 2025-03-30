public class Masina extends Vehicul{
    public String marca;
    public Masina( int vitezaMaxima, String marca) {
        super(vitezaMaxima);
        this.marca=marca;
    }
    public void afiseazaDetalii() {
        System.out.println("Marca: " + marca + ", Viteza maxima: " + vitezaMaxima + " km/h");
    }
}
