package JavaPolymorphism.ProductProgram;

 class Product {
    public void Price(){
        System.out.println("Pricing of all products");
    }
}

class Maggie extends Product {
    public void Price(){
        System.out.println("Maggie: 12Rs/Packet");
    }
}

class Pepsi extends Product {
    public void Price(){
        System.out.println("Pepsi : 60Rs/Bottle");
    }
}

class Chips extends Product {
    public void Price(){
        System.out.println("Chips : 5Rs/Packet");
    }
}

class Main{
    public static void main(String[] args) {
        Product myProduct = new Product();
        Product myMaggie = new Maggie();
        Product myPepsi = new Pepsi();
        Product myChips = new Chips();

        myProduct.Price();
        myMaggie.Price();
        myPepsi.Price();
        myChips.Price();

    }
}