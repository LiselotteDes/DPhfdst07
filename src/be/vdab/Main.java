package be.vdab;
public class Main {
    public static void main(String[] args) {
        Tekening tekening = new Tekening();
        tekening.addFiguur(new Rechthoek(2,1));
        tekening.addFiguur(new Cirkel(3));
        Tekening subTekening = new Tekening();
        subTekening.addFiguur(new Rechthoek(3,2));
        subTekening.addFiguur((new Cirkel(4)));
        tekening.addFiguur(subTekening);
        System.out.println(tekening.getOppervlakte());
    }
    
}
