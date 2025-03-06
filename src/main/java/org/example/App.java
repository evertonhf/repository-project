package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int sub = subtract(10, 5);
        System.out.println( "Subtract 10 - 5 = " + sub );
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
