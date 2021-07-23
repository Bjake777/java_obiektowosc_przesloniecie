public class ToyShop {
    private Bear[] bears = new Bear[10];
    private int indexBear = 0;

    private Car[] cars = new Car[10];
    private int indexCar = 0;

    private Book[] books = new Book[10];
    private int indexBook = 0;

    private Puzzle[] puzzles = new Puzzle[10];
    private int indexPuzzle = 0;

    public void addBear(Bear bear) {
        if (indexBear < bears.length) {
            bears[indexBear++] = bear;
        }
    }

    public void addCar(Car car) {
        if (indexCar < cars.length) {
            cars[indexCar++] = car;
        }
    }

    public void addBook(Book book) {
        if (indexBook < books.length) {
            books[indexBook++] = book;
        }
    }

    public void addPuzzle(Puzzle puzzle) {
        if (indexPuzzle < puzzles.length) {
            puzzles[indexPuzzle++] = puzzle;
        }
    }

    public void displayAll() {
        for (int i = 0; i < indexBear; i++) {
            bears[i].display();
            System.out.println("-----------------------");
        }
        for (int i = 0; i < indexCar; i++) {
            cars[i].display();
            System.out.println("-----------------------");
        }

        for (int i = 0; i < indexBook; i++) {
            books[i].display();
            System.out.println("-----------------------");
        }

        for (int i = 0; i < indexPuzzle; i++) {
            puzzles[i].display();
            System.out.println("-----------------------");
        }
    }


}
