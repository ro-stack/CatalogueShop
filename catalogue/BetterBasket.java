package catalogue;
import java.io.Serializable;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
    private static final long serialVersionUID = 1L;
    /*
     * The add method overrides the add method within basket
     * I was going to include the sorting method within the add
     * so it automatically sorted them but I decided to seperate them
     */
    @Override 
    public boolean add(Product pr)
    {
        for(int i = 0; this.size() > i; i++)
        { 
            if(get(i).getProductNum().equals(pr.getProductNum()))
            { 
                get(i).setQuantity(get(i).getQuantity() + pr.getQuantity());
                return true; 
            }
        }
        super.add(pr);
        Collections.sort(this, BetterBasket::sort);
        return true; 
    }

    /*
     * The sort method sorts the product via its
     * product number
     */
    public static int sort(Product a, Product b)
    {
        return a.getProductNum().compareTo(b.getProductNum());
    }
}
