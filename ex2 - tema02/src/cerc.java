class Cerc extends Forma{
private double raza;
public Cerc(double raza, String culoare) {
    super(culoare);
    this.raza = raza;
}
public double arie() {
    return Math.PI * raza * raza; 

}
public void afisareDetalii() {
    descriere();
    System.out.println("Aria cercului este: " + arie());
}
}
