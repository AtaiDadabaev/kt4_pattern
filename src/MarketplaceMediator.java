import java.util.ArrayList;
import java.util.List;

public class MarketplaceMediator implements Mediator {
    private List<Buyer> buyers;
    private List<Seller> sellers;

    public MarketplaceMediator() {
        buyers = new ArrayList<>();
        sellers = new ArrayList<>();
    }

    @Override
    public void registerBuyer(Buyer buyer) {
        buyers.add(buyer);
    }

    @Override
    public void registerSeller(Seller seller) {
        sellers.add(seller);
    }

    @Override
    public void sendMessage(String message, Participant sender) {
        if (sender instanceof Buyer) {
            for (Seller seller : sellers) {
                seller.receiveMessage(message);
            }
        } else if (sender instanceof Seller) {
            for (Buyer buyer : buyers) {
                buyer.receiveMessage(message);
            }
        }
    }
}
