package JavaEnum;

public class UsageOfEnum {

    public static void main(String[] args) {

        enumJava level = enumJava.MEDIUM;

        switch (level){
            case LOW :
                System.out.println("Low Level");
                break;

            case MEDIUM:
                System.out.println("Medium Level");
                break;

            case HIGH:
                System.out.println("High Level");
                break;
        }

    }

}
