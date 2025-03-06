package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       int soma = add(1, 2);
         System.out.println("Soma: " + soma);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
