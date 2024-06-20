public interface Mediator {
    void registerBuyer(Buyer buyer);
    void registerSeller(Seller seller);
    void sendMessage(String message, Participant sender);
}
