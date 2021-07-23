public class Puzzle extends Toy {
    private int numberOfElements;

    public Puzzle(String name, double price, int numberOfElements) {
        super(name, price);
        this.numberOfElements = numberOfElements;
    }

    public void display() {
        super.display();
        System.out.println("umber of elements: " + numberOfElements);
    }
}
