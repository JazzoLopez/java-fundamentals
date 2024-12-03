package variables;

public class ProductDetail {
    public static void main(String[] args) {
        String productName = "Paps";
        float price = 19.99F;
        int stock = 20;
        boolean isAvailable = true;

        System.out.println("*** Tienda de productos ***");
        System.out.println("productName = " + productName);
        System.out.println("price = " + price);
        System.out.println("stock = " + stock);
        System.out.println("isAvailable = " + isAvailable);

        productName = "Papas";
        price = 20.01F;
        stock = 15;
        isAvailable = false;

        System.out.println("\n*** Tienda de productos ***");
        System.out.println("productName = " + productName);
        System.out.println("price = " + price);
        System.out.println("stock = " + stock);
        System.out.println("isAvailable = " + isAvailable);
    }

}
