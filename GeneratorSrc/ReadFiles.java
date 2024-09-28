package com.github.mythdorm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {

    private static String adjectivePool;
    public static void adjectiveList() {
        File adjectiveList = new File("AdjectiveList.txt");
        String adjectiveFileData = " ";
        try {
            if (adjectiveList.exists()) {
                try (Scanner adjectiveReader = new Scanner(adjectiveList)) {
                    while (adjectiveReader.hasNextLine()) {
                        adjectiveFileData = adjectiveReader.nextLine();
                        //System.out.print(adjectiveFileData);
                    }
                }
            } else {
                System.out.println("File 'AdjectiveList.txt' does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
        adjectivePool = adjectiveFileData;
    }

    public static String adjectiveInfo() {
        return adjectivePool;
    }

    private static String nounPool;
    public static void nounList() {
        File nounList = new File("NounList.txt");
        String nounFileData = " ";
        try {
            if (nounList.exists()) {
                try (Scanner nounReader = new Scanner(nounList)) {
                    while (nounReader.hasNextLine()) {
                        nounFileData = nounReader.nextLine();
                        //System.out.print(adjectiveFileData);
                    }
                }
            } else {
                System.out.println("File 'NounList.txt' does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
        nounPool = nounFileData;
    }

    public static String nounInfo() {
        return nounPool;
    }

    private static String verbPool;
    public static void verbList() {
        File verbList = new File("VerbList.txt");
        String verbFileData = " ";
        try {
            if (verbList.exists()) {
                try (Scanner verbReader = new Scanner(verbList)) {
                    while (verbReader.hasNextLine()) {
                        verbFileData = verbReader.nextLine();
                        //System.out.print(adjectiveFileData);
                    }
                }
            } else {
                System.out.println("File 'VerbList.txt' does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
        verbPool = verbFileData;
    }

    public static String verbInfo() {
        return verbPool;
    }

    private static int adjectiveNumber;
    public static void adjectiveAmmount() {
        File adjectiveAmmount = new File("AdjectiveAmmount.txt");
        int adjectiveTotalAmmount = 0;
        try {
            if (adjectiveAmmount.exists()) {
                try (Scanner adjectiveAmmountReader = new Scanner(adjectiveAmmount)) {
                    while (adjectiveAmmountReader.hasNextInt()) {
                        adjectiveTotalAmmount = adjectiveAmmountReader.nextInt();
                        //System.out.print(adjectiveFileData);
                    }
                }
            } else {
                System.out.println("File 'AdjectiveAmmount.txt' does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
        adjectiveNumber = adjectiveTotalAmmount;
    }

    public static int adjectiveTotalAmmount() {
        return adjectiveNumber;
    }

    private static int nounNumber;
    public static void nounAmmount() {
        File nounAmmount = new File("NounAmmount.txt");
        int nounTotalAmmount = 0;
        try {
            if (nounAmmount.exists()) {
                try (Scanner nounAmmountReader = new Scanner(nounAmmount)) {
                    while (nounAmmountReader.hasNextInt()) {
                        nounTotalAmmount = nounAmmountReader.nextInt();
                        //System.out.print(adjectiveFileData);
                    }
                }
            } else {
                System.out.println("File 'NounAmmount.txt' does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
        nounNumber = nounTotalAmmount;
    }

    public static int nounTotalAmmount() {
        return nounNumber;
    }

    private static int verbNumber;
    public static void verbAmmount() {
        File verbAmmount = new File("VerbAmmount.txt");
        int verbTotalAmmount = 0;
        try {
            if (verbAmmount.exists()) {
                try (Scanner verbAmmountReader = new Scanner(verbAmmount)) {
                    while (verbAmmountReader.hasNextInt()) {
                        verbTotalAmmount = verbAmmountReader.nextInt();
                        //System.out.print(adjectiveFileData);
                    }
                }
            } else {
                System.out.println("File 'VerbAmmount.txt' does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
        verbNumber = verbTotalAmmount;
    }

    public static int verbTotalAmmount() {
        return verbNumber;
    }

    public static void main(String[] args) {
        
        String regex = "[,]";
        String nounFileData = null;
        String verbFileData = null;
        

    
    
        
        //String[] adjectiveArray = adjectiveFileData;
        //String[] adjectiveArray = adjectiveFileData.split(regex);
        //System.out.println(Arrays.toString(adjectiveArray));

        //String[] nounArray = nounFileData.split(regex);
        //System.out.println(Arrays.toString(nounArray));

        //String[] verbArray = verbFileData.split(regex);
        //System.out.println(Arrays.toString(verbArray));
        //System.out.println(verbArray[1]);
    }
}
