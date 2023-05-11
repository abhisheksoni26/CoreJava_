package JavaArrays;

public class CopyingArrayToNewArray {

    public static void main(String[] args) {

        char[] copyFrom = { 'd', 'e', 'v', 'a', 's', 'y', 'e', 'r', 'p', 'q', 'f' };


        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);

        System.out.println(String.valueOf(copyTo));
        System.out.println(copyTo.length);

    }

}
