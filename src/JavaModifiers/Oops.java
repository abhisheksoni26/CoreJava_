package JavaModifiers;

abstract class Oops {
    String fName = "Abhishek";
    int age = 21;

    public abstract void study();

}

class Student extends Oops {

    public int graduationYear = 2023;
    @Override
    public void study() {
        System.out.println("Studying all day long");
    }
}
