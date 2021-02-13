package com.mycompany.pruebaclase;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */

public class NewClass {
    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java");
        
        String saludo="Saludar desde Java";
        System.out.println(saludo);
        
        //Concatenar - Diferencia?
        
        int i =1;
        int j =3;
        System.out.println(saludo+i+j); //Saludar desde Java13
        System.out.println(i+j+saludo); //4Saludar desde Java
        
        //Tipos de datos primitivos
        
        
        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);
        System.out.println("bits tipo byte:" + Byte.SIZE);
        System.out.println("bytes tipos byte:" + Byte.BYTES);
        System.out.println("valor minimo tipo byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte:" + Byte.MAX_VALUE);
        
        
        short shortVar = 32767;
        System.out.println("shortVar = " + shortVar);
        System.out.println("bits tipo short:" + Short.SIZE);
        System.out.println("bytes tipos short:" + Short.BYTES);
        System.out.println("valor minimo tipo short:" + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short:" + Short.MAX_VALUE);
        
        int intVar = 214748364;
        System.out.println("intVar = " + intVar);
        System.out.println("bits tipo int:" + Integer.SIZE);
        System.out.println("bytes tipos int:" + Integer.BYTES);
        System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);
        
        
        long longVar = 922337875;
        System.out.println("longVar = " + longVar);
        System.out.println("bits tipo long:" + Long.SIZE);
        System.out.println("bytes tipos long:" + Long.BYTES);
        System.out.println("valor minimo tipo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);
        
        
        //Captura de informacion
        
        //Scanner
        
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor 1");
        String valor = scanner.nextLine();
        System.out.println("El valor ingresado es: " +valor);
    }
}
