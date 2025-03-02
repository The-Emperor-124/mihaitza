 class Patrat {
    private int l;
    public Patrat(){
        this.l = 10;
    }
public Patrat(int l){
    this.l=l;
}

public int calculeazaAria(){
    return l*l;
}
public void afiseazaAria() {
    System.out.println("Aria: " + calculeazaAria());
}

}
