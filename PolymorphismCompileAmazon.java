public class PolymorphismCompileAmazon {

    public void purchase(int cost) {
        System.out.println("cost of the product:" + cost);
    }

    public void purchase(int cost, String name) {
        System.out.println("cost  and name of the product:" + cost + " and " + name);
    }

    public void purchase(String name) {
        System.out.println("name of the product:" + name);
    }

    public void purchase(String name, int cost) {
        System.out.println("cost  & name of the product:" + cost + " " + name);
    }

    public static void main(String[] args) {
        PolymorphismCompileAmazon amazon = new PolymorphismCompileAmazon();
        amazon.purchase(100);
        amazon.purchase("laptop",20000);
        amazon.purchase("mobile");
        amazon.purchase(1900,"charger");
    }
}
