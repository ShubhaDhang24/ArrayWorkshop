package org.example;

import javax.net.ssl.SSLContextSpi;
import java.util.Arrays;
import java.util.Scanner;

//PART 1
public class NameRepository {
    private static String name;
    private static String[] names = new String[0];//declaration of empty array


    public static void main(String[] args) {

        System.out.println("initial array size " + getSize());
        String[] names = {"Shu D", "Erik p", "Josef f", "Mike M"};
        setNames(names);
        String[] myArr = findAll(names);
        System.out.println(Arrays.toString(myArr));
        System.out.println("Size of array " + getSize());
        System.out.println(" Full name is : " + find("Sam"));
        System.out.println(" Add new name to existing array ");


        //System.out.println("Emptying array ");
       /* clear();
       // System.out.println("The size of array after emptying it "+getSize());
        System.out.println(" Enter the name to search in array");
        Scanner s1=new Scanner(System.in);
        String n1=s1.nextLine();*/


    }

    public static int getSize() {

        return names.length;
    }

    public static String[] setNames(String[] newNames) {
        names = Arrays.copyOf(newNames, newNames.length);
        return names;
    }

    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll(String[] newNames) {
        return newNames;
    }

    //PART 2
    public static String find(final String fullName) {
        for (String key : names) {
            if (key.equalsIgnoreCase(fullName)) {
                System.out.println("Full name found on " + key);
                return fullName;
            }
        }
        return null;
    }

    public static boolean add(String fullName) {

        if (find(fullName) != null) {
            return false;
        }
        String[] AddNameArr = Arrays.copyOf(names, names.length + 1);
        AddNameArr[AddNameArr.length - 1] = fullName;
        return true;
    }

    public static String findByFirstName(final String firstName) {
        String[] NewArray = new String[0];
        for (String key : names) {
            String[] FirstName = key.split(" ");
            String fn = FirstName[0];
            if (fn.equalsIgnoreCase(firstName)) {
                NewArray[NewArray.length - 1] = firstName;

            }

        }
        return firstName;

    }
}
