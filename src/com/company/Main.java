package com.company;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(ageTemperature(generateRandomAge(), 27));
        System.out.println(ageTemperature(generateRandomAge(), 30));
        System.out.println(ageTemperature(15, -5));
        System.out.println(ageTemperature(17, 0));



    }

    public static String ageTemperature(int age, int temperature) {


        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайся дома";
        }


    }

    public static int generateRandomAge() {
        Random x = new Random();
        int k = x.nextInt(70);
        System.out.println(k);

        return k;

    }

}
