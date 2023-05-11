package JavaAbstraction;

abstract class Sample {
     abstract void add();
}

class addition extends Sample{
    private int num1 = 5;
    private int num2 = 10;
     @Override

     void add() {
          int add = num1+num2;
          System.out.println("Ans is : " + add);
     }
}

class Main{
     public static void main(String[] args) {
          addition myobj = new addition();

          myobj.add();
     }
}
