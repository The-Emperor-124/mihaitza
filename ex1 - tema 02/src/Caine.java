public class Caine extends Animal {
    private String rasa;
    public Caine(String nume ,String rasa, int varsta){
        super( nume , varsta) ;
        this.rasa=rasa;
    }
    public void afisareDetalii(){
        System.out.println("Nume: " + getNume());
        System.out.println("Rasa: " + rasa);
        System.out.println("Varsta: " + getVarsta());
    }
}  
