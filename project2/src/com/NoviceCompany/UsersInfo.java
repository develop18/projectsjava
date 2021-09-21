package com.NoviceCompany;

/*
    - Which is the only class I can run in all this project? Why? How do you know that from the project panel?
    - Why my phoneNumber doesn't work?
    - What is the problem with the city?
    - What is the problem with the Marital status?
    - What is the problem with ProfessionalData?
    - I need to print how long the user has been working including the company name

 */
public class UsersInfo {
    public static void main(String[] args) {
        System.out.println("Detailed information of the user .- ");
        System.out.println("----------------------------------------");
        System.out.println("**********   Personal information: ");
        PersonalData.name();
        PersonalData.phoneNumber();
        PersonalData.age();
        PersonalData.maritalStatus();
        System.out.println("----------------------------------------");
        System.out.println("**********   Professional information: ");
        ProfessionalData.profession();
        ProfessionalData.studied();
    }
}
