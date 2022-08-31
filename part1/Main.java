package untitled15.src.main.part1;

public class Main {

    public static void main(String[] args) {

        SimpleSubject productInfo = new SimpleSubject();

        SimpleObserver charlie = new SimpleObserver("Charlie");
        SimpleObserver dave = new SimpleObserver("Dave");
        productInfo.registerObserver(charlie);
        productInfo.registerObserver(dave);
        productInfo.removeObserver(dave);

        SimpleSubject promoOffers = new SimpleSubject();
        SimpleObserver alice = new SimpleObserver("Alice");
        SimpleObserver bob = new SimpleObserver("Bob");
        promoOffers.registerObserver(alice);
        promoOffers.registerObserver(bob);

        System.out.println("Product Info Message by subject1\n");
        productInfo.setMessage(": Interest rate being increased...\n");

        System.out.println();

        System.out.println("Promotional Info Message by subject2\n");
        promoOffers.setMessage(": New products for Auto Loans...\n");
    }
}
