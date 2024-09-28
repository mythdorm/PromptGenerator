package com.github.mythdorm;

import java.io.File;
import java.io.IOException;


public class SectionFiles {
    public static void main(String[] args) {
     
        try {
            File adjectiveFile = new File("AdjectiveList.txt");
            if(adjectiveFile.createNewFile()) {
                System.out.println("File created: " + adjectiveFile.getName());
            } else {
                System.out.println("File " + adjectiveFile.getName() + " already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }

        try {
            File nounFile = new File("NounList.txt");
            if(nounFile.createNewFile()) {
                System.out.println("File created: " + nounFile.getName());
            } else {
                System.out.println("File " + nounFile.getName() + " already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }

        try {
            File verbFile = new File("VerbList.txt");
            if(verbFile.createNewFile()) {
                System.out.println("File created: " + verbFile.getName());
            } else {
                System.out.println("File " + verbFile.getName() + " already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }

        /* 
        try {
            File verbAmmountTracker = new File ("VerbAmmount.txt");
            if (verbAmmountTracker.createNewFile()){
                FileWriter verbCounter = new FileWriter("VerbAmmount.txt");
                verbCounter.write("0");
                verbCounter.close();
                System.out.println("File created: VerbAmmount.txt");
            } else {
                System.out.println("File VerbAmmount.txt already exists");
            }

            /*
            File nounAmmountTracker = new File ("NounAmmount.txt");
            if (nounAmmountTracker.createNewFile()) {
                FileWriter nounCounter = new FileWriter ("NounAmmount.txt");
                nounCounter.write("0");
                nounCounter.close();
                System.out.println("File created: NounAmmount.txt");
            } else {
                System.out.println("File NounAmmount.txt already exists.");
            }
            */

            /*
            File adjectiveAmmountTracker = new File ("AdjectiveAmmount.txt");
            if (adjectiveAmmountTracker.createNewFile()) {
                FileWriter adjectiveCounter = new FileWriter ("AdjectiveAmmount.txt");
                adjectiveCounter.write("0");
                adjectiveCounter.close();
                System.out.println("File created: AdjectiveAmmount.txt");
            } else {
                System.out.println("File NounAmmount.txt already exists.");
            }
            */


        /*
        } catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
         */

//        try {
//            File trackerFile = new File("Tracker.txt");
//            FileWriter trackerWriter= FileWriter("Tracker.txt");
//            int numberOfOpens = 1;
//            if(trackerFile.createNewFile()) {
//                System.out.println("File created: " + trackerFile.getName());
//                trackerWriter.write("1");
//                trackerWriter.close();
//            } else {
//                System.out.println("File " + trackerFile.getName() + " already exists.");
//                trackerWriter.write("2");
//                numberOfOpens = numberOfOpens + 1;
//                trackerWriter.close();
//            }
//        } catch (IOException e) {
//            System.out.println("An error has occured.");
//            e.printStackTrace();
//        }

    }

}
