 abstract class FlipKart
 {
   public abstract  void purchase(String brand);
}
abstract class Paytm extends FlipKart
{
    public abstract void pay(int amount);
}
class Customer extends Paytm
    {
    @Override
   public void purchase(String brand) {
        System.out.println("tom is purchasing the laptop"+brand);
    }

    @Override
    public void pay(int amount){
        System.out.println("tom is paying the amount "+amount);
    }
    }
public class AbstractionExample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.purchase("laptop");
        customer.pay(20000);
    }
}
