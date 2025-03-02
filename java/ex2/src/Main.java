public class Main {
    public static void main(String[] args){
        Carte carte1 = new Carte(200);
        Carte carte2 = new Carte(300);
        Carte carte3 = new Carte(200);
        
    
    if(carte1.getNuamarPagini() == carte2.getNuamarPagini()){
        System.out.println("Cartile 1 si 2 sunt identice");
    }
    else {
 System.out.println("Cartile 1 si 2 nu sunt identice");
    }
    if(carte1.getNuamarPagini() == carte3.getNuamarPagini()) {
         System.out.println("Cartile 1 si 3 sunt identice");
    }
    else {
         System.out.println("Cartile 1 si 3 nu sunt identice");
    }

}
}
