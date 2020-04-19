public class Utils {

    //IMPORTANT! switch used with no better purpose, could be implemented using below 2 lines of code
    private double getFinalPrice(Product product) {
        int a = product.getCategory().vat;
        return switch (product.getCategory().vat) {
            case 23 -> 1.23 * product.getPrice();
            case 8 -> 1.08 * product.getPrice();
            case 5 -> 1.05 * product.getPrice();
            default -> product.getPrice();
        };
        //double grossFactor = (double) (product.getCategory().vat) / 100 + 1;
        //return product.getPrice() * grossFactor;
    }

    public void displayProductCatalog(Product[] prodCatalog) {
        for (Product product : prodCatalog) {
            if (product != null) {
                System.out.println(product);
                System.out.println("\tNew price including VAT: " + getFinalPrice(product));
            }
        }
    }
}
