import java.util.Scanner;

public class ToyShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        String name;
        double price;
        ToyShop toyShop = new ToyShop();
        do {
            System.out.println("-------- Toy Shop --------");
            System.out.println("1 - add bear");
            System.out.println("2 - add car");
            System.out.println("3 - add book");
            System.out.println("4 - add Puzzle");
            System.out.println("5 - display all");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine(); // \n

            switch (option) {
                case 1:
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // \n

                    System.out.println("Material: ");
                    String material = scanner.nextLine();

                    Bear bear = new Bear(name, price, material);
                    toyShop.addBear(bear);
                    break;
                case 2:
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // \n

                    System.out.println("Type: ");
                    String type = scanner.nextLine();

                    Car car = new Car(name, price, type);
                    toyShop.addCar(car);
                    break;
                case 3:
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // \n

                    System.out.println("Number of pages: ");
                    int numberOfPages = scanner.nextInt();

                    System.out.println("Number of pages: ");
                    int childrenAge = scanner.nextInt();

                    Book book = new Book(name, price, numberOfPages, childrenAge);
                    toyShop.addBook(book);
                    break;
                case 4:
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // \n

                    System.out.println("Number of elements: ");
                    int numberOfElements = scanner.nextInt();

                    Puzzle puzzle = new Puzzle(name, price, numberOfElements);
                    toyShop.addPuzzle(puzzle);
                    break;
                case 5:
                    toyShop.displayAll();
                    break;
            }
        } while(option != 0);


        scanner.close();
    }
}
