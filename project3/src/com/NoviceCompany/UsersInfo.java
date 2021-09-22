package com.NoviceCompany;

/*




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
        ProfessionalData.howLongWorking();
    }
}
