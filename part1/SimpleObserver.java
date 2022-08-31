package untitled15.src.main.part1;

public class SimpleObserver implements Observer {
    private final String name;
    private String message;


    public SimpleObserver(String name) {
        this.name = name;

    }

    public void update(String message) {
        this.message = message;
        display();
    }
        public void display(){
        System.out.print("Message received by "+ name + message);
    }
}
