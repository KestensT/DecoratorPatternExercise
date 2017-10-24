public class Klimmuur extends Decorator {

    Lidkaart lidkaart;

    public Klimmuur(Lidkaart lidkaart) {
        this.lidkaart = lidkaart;
    }

    public int getPrice(){
        return lidkaart.getPrice() + 15;
    }
}
