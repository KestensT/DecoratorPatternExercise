public class Groepslessen extends Decorator {

    Lidkaart lidkaart;

    public Groepslessen(Lidkaart lidkaart) {
        this.lidkaart = lidkaart;
    }

    public int getPrice() {
        return lidkaart.getPrice() + 20;
    }

}
