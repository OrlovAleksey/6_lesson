package demoqa.tests;

import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.Random;

public class TestData {
    static Random random = new Random();
    private static final Faker faker = new Faker(new Locale("en-US"));

    public static String getRandomMonth() {
        String[] month = {"January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"};
        int randomIndex = random.nextInt(month.length);
        return month[randomIndex];
    }
    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        int randomIndex = random.nextInt(genders.length);
        return genders[randomIndex];
    }
    public static String getRandomHobbies() {
        String[] hobbies = {"Music", "Reading", "Music"};
        int randomIndex = random.nextInt(hobbies.length);
        return hobbies[randomIndex];
    }
    static String UserGender = getRandomGender(),
                UserHobbies = getRandomHobbies(),
                firstName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                streetAddress = faker.address().streetAddress(),
                email = faker.internet().emailAddress(),
                day = String.valueOf(faker.number().numberBetween(10, 27)),
                month =getRandomMonth(),
                year = String.valueOf(faker.number().numberBetween(1900, 2001)),
                phone = faker.phoneNumber().subscriberNumber(10),
                subjects = "Hindi",
                state = "NCR",
                city = "Noida",
                picture = "CKtO-Q6I1ks.jpg";

}
