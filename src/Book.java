public class Book extends Toy {
    private int numberOfPages;
    private int childrenAge;

    public Book(String name, double price, int numberOfPages, int childrenAge) {
        super(name, price);
        this.numberOfPages = numberOfPages;
        this.childrenAge = childrenAge;
    }

    public void display() {
        super.display();
        System.out.println("number of pages: " + numberOfPages);
        System.out.println("children age:" + childrenAge);
    }
}
