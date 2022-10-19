package demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPages;
public class TestRegistrationForm {

    String firstName = "Alex";
    String lastName = "Orlov";
    String email = "aorlov@site.com";
    String phone = "9777742959";
    String day = "12";
    String month = "October";
    String year = "1996";

    RegistrationPages registrationPages = new RegistrationPages();
    @BeforeAll
    static void setUp(){
        Configuration.holdBrowserOpen = true; //Делаем чтобы браузер оставался открытым
        Configuration.baseUrl = "https://demoqa.com"; //Добавляем настройку стандартного урла
    }
    @Test

    void simpleTest(){
        registrationPages.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender("Male")
                .setPhone(phone)
                .setBirthDate(day,month,year)
                .setSubjects("Hindi")
                .setHobbies("Music")
                .uploadFile()
                .setAddress("Moskva, Krasnopresnenskaya nab., 12-17")
                .setStateAndCity("NCR","Noida")
                .submitForm();

        registrationPages.checkResultsTableVisible()
                .checkResultTable("Student Name", firstName +" "+ lastName)
                .checkResultTable("Student Email", email)
                .checkResultTable("Gender", "Male")
                .checkResultTable("Mobile", phone)
                .checkResultTable("Date of Birth", day + " "+ month +","+year)
                .checkResultTable("Subjects", "Hindi")
                .checkResultTable("Hobbies", "Music")
                .checkResultTable("Picture", "CKtO-Q6I1ks.jpg")
                .checkResultTable("Address", "Moskva, Krasnopresnenskaya nab., 12-17")
                .checkResultTable("State and City", "NCR Noida");
    }
}