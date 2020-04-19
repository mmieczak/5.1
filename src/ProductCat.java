public class ProductCat {
    String name;
    int vat;

    ProductCat(String name, int vat) {
        this.name = name;
        if (vat < 0) this.vat = 0;
        else this.vat = Math.min(vat, 100);
    }

    @Override
    public String toString() {
        return "ProductCat{" +
                "name='" + name + '\'' +
                ", vat=" + vat +
                '}';
    }
}
