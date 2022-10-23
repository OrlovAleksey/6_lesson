package demoqa.tests;

import com.github.javafaker.Faker;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.Random;

public class TestData {


    static Random random = new Random();

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        int randomIndex = random.nextInt(genders.length);
        return genders[randomIndex];
    }
    static String UserGender = getRandomGender();

}
