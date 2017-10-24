public class Zwembad extends Decorator {

    Lidkaart lidkaart;

    public Zwembad(Lidkaart lidkaart) {
        this.lidkaart = lidkaart;
    }

    public int getPrice(){
        return lidkaart.getPrice() + 50;
    }
}

