public class Product {
/*
    Stwórz klasę przechowującą informacje o produkcie - jego nazwę, opis, cenę netto i kategorię.
    Klasa powinna być zgodna z konwencją JavaBeans.
    Stwórz przynajmniej dwa produkty o różnych kategoriach.
    W osobnej klasie stwórz metodę, która będzie przyjmowała produkt i na podstawie jego kategorii obliczy cenę brutto.
    Załóż, że każda kategoria produktów ma inną stawkę VAT.

    Wykorzystaj instrukcję switch.
    */

    private String name;
    private String Description;
    private double price;
    private ProductCat category;

    public Product() {
    }

    public Product(String name, String description, double price, ProductCat category) {
        this.name = name;
        Description = description;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductCat getCategory() {
        return category;
    }

    public void setCategory(ProductCat category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
