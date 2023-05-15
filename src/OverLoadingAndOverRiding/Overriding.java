package OverLoadingAndOverRiding;

public class Overriding {

    public static void add(int a, int b) {
        System.out.println("Answer is " + a + b);
    }

    static class Method1 extends Overriding {
        public static void add(float a, float b) {
            System.out.println("Answer " + a + b);
        }
    }


        public static void main(String[] args) {

            int a = 10;
            int b = 10;

            Overriding oo = new Overriding();
            add(20, 30);

            Overriding op = new Overriding.Method1();
            add(30 ,20);
        }
    }

