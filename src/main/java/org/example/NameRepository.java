package org.example;

import java.util.Arrays;


//PART 1
public class NameRepository {

    private static String[] names = new String[0];//declaration of empty array


    public static void main(String[] args) {

        System.out.println("----Method getSize()----");
        System.out.println("initial array size is = " + getSize());

        System.out.println();
        System.out.println("----Method setNames()----");
        String[] names = {"Magnus Sven", "Mila Magnus", "Peter Axelsson", "Erik Strom"};
        System.out.println("String array is : ");
        setNames(names);

        System.out.println(" ");
        System.out.println("---Method FindAll()---");
        String[] myArr = findAll(names);
        System.out.println(Arrays.toString(myArr));

        System.out.println(" ");
        System.out.println("Array after adding elements: ");
        System.out.println("Size of array is : " + getSize());

        System.out.println(" ");
        System.out.println("---Method Find()--- ");
        System.out.println(" Full name is : " + find("Erik Strom"));

        System.out.println(" ");
        System.out.println("---Method add()---");
        System.out.println(" Add new name to existing array ");
        boolean res = add("Shu D");
        if (res) {
            System.out.println("Name added ");
            //System.out.println(" Updated array : "+Arrays.toString(names));
        } else {
            System.out.println("Failed to add name ");
        }

        //GET SIZE METHOD IS NOT WORKING CORRECTLY, ARRAY IS NOT DISPLAYING CORRECTLY
        System.out.println(" ");
        System.out.println("Size of array after adding new element : " + getSize());

        System.out.println(" ");
        System.out.println(" ---Method Find()---");
        System.out.println(" Name found = " + find("Magnus Sven"));

        System.out.println(" ");
        System.out.println("---Method  Update()---");
        update("Magnus Sven", "Lara Kav");

        System.out.println(" ");
        System.out.println("After updating the array with new name : ");
        System.out.println(Arrays.toString(findAll(names)));

        System.out.println(" ");
        String ln = "Magnus";
        String foundName = findByFirstName(ln);
        if (ln != null) {
            System.out.println("Last Name found   : " + ln);
        } else {
            System.out.println("Last Name not found    : " + ln);
        }

        System.out.println(" ");
        String fn = "mila";
        String foundLastName = findByFirstName(fn);
        if (fn != null) {
            System.out.println("First Name found   : " + fn);
        } else {
            System.out.println("First Name not found    : " + fn);
        }
        System.out.println(" ");
        remove("Peter Axelsson");

        System.out.println(" ");
        System.out.println("---METHOD clear()---");
        clear();
        System.out.println("The size of array after emptying it " + getSize());


    }

    public static void update(final String original, final String updatedName) {
        String[] newName = names;
        System.out.println(Arrays.toString(newName));
        for (int n = 0; n < names.length; n++) {
            if (original.equalsIgnoreCase(Arrays.toString(names))) ;
            {
                names[n] = updatedName;
                System.out.println(Arrays.toString(names));
                break;
            }


        }

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
        newNames = names;
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
        names = AddNameArr;
        System.out.println(Arrays.toString(AddNameArr));
        return true;
    }


    public static String findByFirstName(final String firstName) {
        for (String name : names
        ) {
            if (name.equalsIgnoreCase(firstName)) {
                return name;
            }

        }
        return null;
    }

    public static String LastName(final String lastName) {

        for (String key : names
        ) {

            if (key.equalsIgnoreCase((lastName))) {
                return key;
            }

        }
        return null;
    }

    public static void remove(final String fullName) {
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(fullName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {

            String[] newArray = new String[names.length - 1];
            int newIndex = 0;
            for (int i = 0; i < names.length; i++) {
                if (i != index) {
                    newArray[newIndex] = names[i];
                    newIndex++;
                }
            }
            names = newArray;
            System.out.println("Removed " + fullName + " from the array.");
        } else {
            System.out.println(fullName + " not found in the array.");
        }

        System.out.println("Updated array: " + Arrays.toString(names));

    }


}





