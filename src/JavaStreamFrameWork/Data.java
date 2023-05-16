package JavaStreamFrameWork;

public class Data
{
        int id;
        String productName;
        float price;

        public Data(int id, String ProductName, float price) {

            this.id = id;
            productName = ProductName;
            this.price = price;
        }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }
}
