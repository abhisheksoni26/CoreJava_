package JavaInterface;

class Bmw implements interfaceVehicle {

    @Override
    public void carName() {
        System.out.println("BMW");
    }

    @Override
    public void carPrice() {
        System.out.println("Price : 1.2 Cr");
    }
}

class Mercedes implements interfaceVehicle {

    @Override
    public void carName() {
        System.out.println("Mercedes");
    }

    @Override
    public void carPrice() {
        System.out.println("Price : 80 Lakhs");
    }
}

class Audi implements interfaceVehicle {

    @Override
    public void carName() {
        System.out.println("Audi");
    }

    @Override
    public void carPrice() {
        System.out.println("Price : 65 Lakhs");
    }
}

public class Vehicle {

    public static void main(String[] args) {

        Bmw myObj1 = new Bmw();
        Mercedes myObj2 = new Mercedes();
        Audi myObj3 = new Audi();

        myObj1.carName();
        myObj1.carPrice();

        myObj2.carName();
        myObj2.carPrice();

        myObj3.carName();
        myObj3.carPrice();


    }


}
