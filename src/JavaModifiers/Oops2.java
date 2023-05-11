package JavaModifiers;

public class Oops2 {
    public static void main(String[] args) {
        Student myobj = new Student();

        System.out.println("Name: " + myobj.fName);
        System.out.println("Age: " + myobj.age);
        System.out.println("Graduation Year: " + myobj.graduationYear);
        myobj.study();
    }
}
