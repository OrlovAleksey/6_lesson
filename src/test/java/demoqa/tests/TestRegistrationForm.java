package demoqa.tests;


import org.junit.jupiter.api.Test;
import pages.RegistrationPages;
import static demoqa.tests.TestData.*;

public class TestRegistrationForm extends TestBase {



    RegistrationPages registrationPages = new RegistrationPages();
    @Test

    void simpleTest(){

        registrationPages.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(UserGender)
                .setPhone(phone)
                .setBirthDate(day,month,year)
                .setSubjects(subjects)
                .setHobbies(UserHobbies)
                .uploadFile()
                .setAddress(streetAddress)
                .setStateAndCity(state,city)
                .submitForm();

        registrationPages.checkResultsTableVisible()
                .checkResultTable("Student Name", firstName + " " + lastName)
                .checkResultTable("Student Email", email)
                .checkResultTable("Gender", UserGender)
                .checkResultTable("Mobile", phone)
                .checkResultTable("Date of Birth", day + " "+ month +","+year)
                .checkResultTable("Subjects", subjects)
                .checkResultTable("Hobbies", UserHobbies)
                .checkResultTable("Picture", picture)
                .checkResultTable("Address", streetAddress)
                .checkResultTable("State and City", state + " " + city);
    }
}