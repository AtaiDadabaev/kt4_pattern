public class Seller implements Participant {
    private Mediator mediator;
    private String name;

    public Seller(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.registerSeller(this);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " received message: " + message);
    }
}
