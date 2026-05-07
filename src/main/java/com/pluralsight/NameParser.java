package com.pluralsight;

public class NameParser {

    //private constructor that will not allow me to create an instance to the class
    //essential to keeping the class static
    private NameParser(){}

    //this is the first format method that only deals with a first and last name
    public static String format(String firstName, String lastName) {
        //if the input was adrian rodriguez the output should be "rodriguez, adrian"
        return lastName + ", " + firstName;
    }

    public static String format2(String prefix, String firstName, String middleName, String lastName, String suffix) {

        //expected format LastName, Prefix FirstName MiddleName, Suffix
        StringBuilder result = new StringBuilder();

        //let's just handle the last name because we always get it
        result.append(lastName).append(", ");

        //if the prefix is not empty, let's include it
        if(!prefix.isEmpty()){
            result.append(prefix).append(" ");
        }

        result.append(firstName);

        if(!middleName.isEmpty()){
            result.append(" ").append(middleName);
        }

        if(!suffix.isEmpty()){
            result.append(", ").append(suffix);
        }

        //return the string from the stringbuilder
        return result.toString();
    }


}
