package dz_patterns.Strategy;

public class Client {

    DiscountStrategy discountStrategy;

    public void buy() {
        System.out.println(String.format("Товар куплен со скидкой %d процентов", discount()));
    }

    public int discount() {
        return discountStrategy != null ? discountStrategy.discount() : 0;
    }

    public static class RegularClient extends Client {
        public RegularClient (){
            this.discountStrategy = new RegularClientStrategy();
        }
    }

    public static class DiscountCardHolderClient extends Client {
        public DiscountCardHolderClient(){
            this.discountStrategy = new DiscountCardHolderClientStrategy();
        }
    }

    public static class VIPClient extends Client {
        public VIPClient (){
            this.discountStrategy = new VIPClientStrategy();
        }
    }

    public static void main(String[] args) {
        Client regular = new RegularClient();
        Client discountCardHolder = new DiscountCardHolderClient();
        Client vip = new VIPClient();

        regular.buy();
        discountCardHolder.buy();
        vip.buy();
    }
}