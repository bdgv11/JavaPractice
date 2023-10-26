package Basics;

public class DataTypesDemos {
    public static void main(String[] args) {
        byte myByte = 50;
        short myShort = 3000;
        int myInt = 200000000;
        long myLong = 30000000000000L;
        float myFloat = 3.14f;
        double myDouble = 3.14;
        char myChar = 'S';

        int newInt = myByte;
        System.out.println(newInt);

        int newIntFromDouble = (int) myDouble;
        System.out.println(newIntFromDouble);
    }
}
