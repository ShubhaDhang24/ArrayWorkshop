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
        String[] names = {"Magnus Sven", "Mila Magnus", "Peter Axelsson", "Erik Strom"};
        setNames(names);
        String[] myArr = findAll(names);
        System.out.println(Arrays.toString(myArr));
        System.out.println("Size of array " + getSize());
        System.out.println(" Full name is : " + find("Erik Strom"));
        System.out.println(" Add new name to existing array ");
        add("Shu D");
        //find("Erik Strom");

        System.out.println(" Name found = " + find("Magnus Sven"));

        update("Magnus Sven", "Angalina Kav");

        // clear();
        //System.out.println("The size of array after emptying it "+getSize());


    }

    public static String[] update(final String original, final String updatedName) {
        for (int n = 0; n < names.length; n++) {
            if (original.equalsIgnoreCase(Arrays.toString(names))) ;
            {
                names[n] = updatedName;
                System.out.println(Arrays.toString(names));
                break;
            }

        }


        return names;
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
                System.out.println("Full name found = " + key);
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
        System.out.println(Arrays.toString(AddNameArr));
        return true;
    }

    public static String findByFirstName(final String firstName) {
        String[] NewArray = new String[0];
        for (String key : names) {
            String[] FirstName = key.split(" ");
            String fn = FirstName[NewArray.length];
            if (fn.equalsIgnoreCase(firstName)) {
                NewArray[NewArray.length + 1] = firstName;

            }

        }
        return firstName;

    }

    public static String LastName(final String lastName) {
        String[] NewArr = new String[0];
        for (String key : names
        ) {
            String[] LastNam1 = key.split(" ");
            String ln = LastNam1[0];
            if (ln.equalsIgnoreCase((lastName))) {
                NewArr[NewArr.length - 1] = lastName;
            }

        }
        return lastName;
    }


}
