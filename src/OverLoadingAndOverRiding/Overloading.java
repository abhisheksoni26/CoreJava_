package OverLoadingAndOverRiding;

public class Overloading {

    public static void add(int a, int b) {
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        add(a, b);
        add(a, b, c);

    }
}
