package com.Learning;

public class LearningVariables {

    public static void main(String[] args) {
	// write your code here

        // Enteros
        int age;
        int population = 1800;          // 4B
        short anotherIJnteger;               // 2B
        long longerInteger;             // 8 B
        int sumAges;

        age = 35;
        System.out.println("La edad es: " + "age");           // No es suma sino concatenación

        age = 1;
        System.out.println("Ahora la nueva edad es: " + age);

        System.out.println("Y la población: " + population);

        sumAges = age + 45;
        System.out.println("Sumando a la edad 45, tengo: " + sumAges);

        System.out.println("Disparate, multiplicando la edad por 2: " + (sumAges * 2));

        //-------------------------------
        // Punto flotante

        double humidity;
        humidity = 0.34;
        System.out.println("La humedad es :" + humidity);

        //--------------------------------
        // Character

        char miLetra;
        miLetra = 'B';
        System.out.println("Mi letra favorita es: " + miLetra);


        boolean A, B, C, D, E, F;
        A = 2 < 3;        // true              // Operaciones lógicas: <, > == , <=, >= , !
        B = 2 > 3;          // false
        C = 4 <= 3;         // false
        D = 10 >= 1;        // true
        E = false;
        F = true;
        System.out.println("A : " + A);
        System.out.println("B : " + B);
        System.out.println("C : " + C);
        System.out.println("D : " + D);
        System.out.println("E : " + E);
        System.out.println("F : " + F);

    }
}
