public class Marketplace {
    public static void main(String[] args) {
        Mediator mediator = new MarketplaceMediator();

        Buyer buyer1 = new Buyer(mediator, "Buyer1");
        Buyer buyer2 = new Buyer(mediator, "Buyer2");

        Seller seller1 = new Seller(mediator, "Seller1");
        Seller seller2 = new Seller(mediator, "Seller2");

        buyer1.sendMessage("Looking for a new laptop");
        seller1.sendMessage("Selling a brand new laptop");
    }
}
