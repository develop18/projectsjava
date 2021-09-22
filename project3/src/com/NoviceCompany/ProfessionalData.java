package com.NoviceCompany;

public class ProfessionalData {
    public static void profession() {
        System.out.println("I am an architect");
    }

    public static void studied() {
        System.out.println("I studied Arts at University");
    }

    public static void howLongWorking() {
        System.out.println("I have been working for 10 years at:");
        companyName();
    }

    private static void companyName() {
        System.out.println("... Ericsson");
    }

}
