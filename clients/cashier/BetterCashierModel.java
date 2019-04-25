package clients.cashier;
import middle.MiddleFactory;
import catalogue.BetterBasket;
import catalogue.Basket;

public class BetterCashierModel extends CashierModel
{    
    public BetterCashierModel(MiddleFactory mf) {
        super(mf);
    }    
    @Override 
    protected Basket makeBasket() {
        return new BetterBasket();
    }
}