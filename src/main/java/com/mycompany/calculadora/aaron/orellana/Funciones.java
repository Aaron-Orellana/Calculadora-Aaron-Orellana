
package com.mycompany.calculadora.aaron.orellana;

import java.util.*;

public class Funciones {

    Scanner leer = new Scanner(System.in);
    private int n1;
    private int n2;

    public Funciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int Excepcion() {
        int n = 0;
        int bandera;
        do {
            try {
                System.out.print("Ingrese un numero: ");
                n = leer.nextInt();
                if (n >= 0) {
                    bandera = 1;
                } else {
                    System.out.println("Ingrese un numero positivo");
                    bandera = 0;
                }
            } catch (Exception e) {
                leer.next();
                System.out.println("No ingreso un numero o es muy largo");
                bandera = 0;
            }

        } while (bandera == 0);
        return n;
    }

    public int Validar() {
        if (n1 != n2) {
            return 1;
        } else {
            return 0;
        }
    }

    public int Suma() {
        int suma = n1 + n2;
        return suma;
    }

    public int Resta() {
        int resta = n1 - n2;
        return resta;
    }

    public int Multi() {
        int multi = n1 * n2;
        return multi;
    }

    public void Division() {
        int division;
        try {
            division = n1 / n2;
            System.out.println("El resultado es: " + division);
        } catch (Exception e) {
            System.out.println("No se puede dividir por 0");
        }
    }
    public void Palindrome(String s, int inicio, int fin ){
        if (inicio >= fin){ //si son iguales, quiere decir que corresponde a un palindrome
            System.out.println("Es un palindrome");
        }else if (s.charAt(inicio) == s.charAt(fin)){
            Palindrome(s, inicio + 1 , fin - 1);
        } else{
            System.out.println("No es Palindrome");
        }
    }
}
