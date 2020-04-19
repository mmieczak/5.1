public class Tester {
    public static void main(String[] args) {

        //Initialize Productc Category container
        ProductCat[] productCategoryArray = new ProductCat[3];
        productCategoryArray[0] = new ProductCat("Category I", 8);
        productCategoryArray[1] = new ProductCat("Category II", 23);
        productCategoryArray[2] = new ProductCat("Category III", 5);

        //Initialize Product Catalog container
        Product[] prodCatalogArray = new Product[10];
        prodCatalogArray[0] = new Product("Wieniec", "Kwiaty ciete", 180, productCategoryArray[0]);
        prodCatalogArray[1] = new Product("Buty dzieciece", "Ubrania dzieciece", 250, productCategoryArray[1]);
        prodCatalogArray[2] = new Product("Ksiazka JavaStart", "Ksiązki", 25, productCategoryArray[2]);

        //New class with VAT calculation and display to console function
        Utils utils = new Utils();
        utils.displayProductCatalog(prodCatalogArray);


    }
}
