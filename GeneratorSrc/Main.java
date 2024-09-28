package com.github.mythdorm;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int stage = 0;
        SectionFiles.main(args);
        while (stage >= 0) {
            String line = "---------------------------------";
            String regex = "[,\s]";
            System.out.println(line);
            System.out.println(" ");
            System.out.println("Do you want to add more to the possible prompt pool? ");
            Scanner response = new Scanner(System.in);
            String firstResponse = response.nextLine();
            String editingFile;
            String[] verbArray = new String[0];
            String[] nounArray = new String[0];
            String[] adjectiveArray = new String[0];
            String verbSample = "jumping, sleeping, fighting, staring, singing, reading, falling, dying, smiling, ";
            String nounSample = "woman, man, bear, dog, cat, insect, child, cube, spider, tank, machine, god, plant, tree";
            String adjectiveSample = "confused, hot, cold, wet, stylish, colorful, red, blue, evil, holy, spiky, unknowable";
            

            if (firstResponse.equalsIgnoreCase("y") || firstResponse.equalsIgnoreCase("yes")) {
                stage = 1;
            } else if (firstResponse.equalsIgnoreCase("n") || firstResponse.equalsIgnoreCase("no")) {
                stage = 2;
            } else if (firstResponse.equalsIgnoreCase("view")) {
                stage = 3;
            } else if (firstResponse.equalsIgnoreCase("exit")) {
                stage = -1;
            } else {
                stage = 4;
            }
            

            switch (stage) {
                case 1:
                    System.out.println("Whch pool do you want to add to? (adjective, noun, verb)");
                    editingFile = response.nextLine();
                    if (editingFile.equalsIgnoreCase("verb")) {
                        System.out.println(line);
                        System.out.println(" ");
                        System.out.println("Enter what you want to be added.");
                        String addedVerbs = response.nextLine();
                        if (addedVerbs.equalsIgnoreCase("sample")){
                            try {
                                FileWriter verbWriter = new FileWriter("VerbList.txt");
                                verbWriter.write(verbSample);
                            } catch (IOException e) {
                                System.out.println("An error has occured.");
                                e.printStackTrace();
                            }
                        } else if (addedVerbs.equalsIgnoreCase("back")) {
                            stage = 1;
                        } else if (addedVerbs.equalsIgnoreCase("exit")) {
                            stage = -1;
                        } else { 
                            try {
                                FileWriter verbWriter = new FileWriter("VerbList.txt");
                                ReadFiles.verbList();
                                String verbInfo = ReadFiles.verbInfo();
                                verbArray = verbInfo.split(regex);
                                System.out.println(Arrays.toString(verbArray));
                                verbWriter.write(verbInfo + " " + addedVerbs);
                                verbWriter.close();
                                System.out.println(" ");
                                System.out.println(line);
                                stage = 1;
                            } catch (IOException e) {
                                System.out.println("An error has occured.");
                                e.printStackTrace();
                                System.out.println(" ");
                                System.out.println(line);
                            }
                        }
                        
                    } else if (editingFile.equalsIgnoreCase("noun")) {
                        System.out.println(line);
                        System.out.println(" ");
                        System.out.println("Enter what you want to be added.");
                        String addedNouns = response.nextLine();
                        if (addedNouns.equalsIgnoreCase("sample")) {
                            try {
                                FileWriter nounWriter = new FileWriter("NounList.txt");
                                nounWriter.write(nounSample);
                            } catch (IOException e) {
                                System.out.println("An error has occured.");
                                e.printStackTrace();
                            }
                        } else if (addedNouns.equalsIgnoreCase("exit")) {
                            stage = -1;
                        } else if (addedNouns.equalsIgnoreCase("back")) {
                            stage = 1;
                        } else {
                            try {
                                ReadFiles.nounList();
                                String nounInfo = ReadFiles.nounInfo();
                                nounArray = nounInfo.split(regex);
                                System.out.println(Arrays.toString(nounArray));
                                FileWriter nounWriter = new FileWriter("NounList.txt");
                                nounWriter.write(nounInfo + " " + addedNouns);
                                nounWriter.close();
                                System.out.println(" ");
                                System.out.println(line);
                                stage = 1;
                            } catch (IOException e) {
                                System.out.println("An error has occured.");
                                e.printStackTrace();
                                System.out.println(" ");
                                System.out.println(line);
                            }
                        }
                        
                    } else if (editingFile.equalsIgnoreCase("adjective")){
                        System.out.println(line);
                        System.out.println(" ");
                        System.out.println("Enter what you want to be added.");
                        String addedAdjectives = response.nextLine();
                        if (addedAdjectives.equalsIgnoreCase("sample")) {
                            try {
                                FileWriter adjectiveWriter = new FileWriter("AdjectiveList.txt");
                                adjectiveWriter.write(adjectiveSample);
                            } catch (IOException e) {
                                System.out.println("An error has occured.");
                                e.printStackTrace();
                            }
                        } else if (addedAdjectives.equalsIgnoreCase("back")) {
                            stage = 1;
                        } else if (addedAdjectives.equalsIgnoreCase("exit")) {
                            stage = -1;
                        } else{
                            try {
                                ReadFiles.adjectiveList();
                                String adjectiveInfo = ReadFiles.adjectiveInfo();
                                adjectiveArray = adjectiveInfo.split(regex);
                                System.out.println(Arrays.toString(adjectiveArray));
                                FileWriter adjectiveWriter = new FileWriter("AdjectiveList.txt");
                                adjectiveWriter.write(adjectiveInfo + " " + addedAdjectives);
                                adjectiveWriter.close();
                                System.out.println(" ");
                                System.out.println(line);
                                
                            } catch (IOException e) {
                                System.out.println("An error has occured.");
                                e.printStackTrace();
                                System.out.println(" ");
                                System.out.println(line);
                            }
                        }
                    } else if (editingFile.equalsIgnoreCase("exit")) {
                        stage = -1;
                    } else if (editingFile.equalsIgnoreCase("back")) {
                        stage = 0;
                    } else {
                        System.out.println("Not a valid response.");
                        System.out.println(" ");
                        System.out.println(line);
                        stage = 1;
                    }   break;
                case 3:
                    System.out.println("What pool do you want to view?");
                    String viewPool = response.nextLine();
                    if (viewPool.equalsIgnoreCase("noun")) {
                        ReadFiles.nounList();
                        String viewingFile = ReadFiles.nounInfo();
                        System.out.println(viewingFile);
                    } else if (viewPool.equalsIgnoreCase("verb")) {
                        ReadFiles.verbList();
                        String viewingFile = ReadFiles.verbInfo();
                        System.out.println(viewingFile);
                    } else if (viewPool.equalsIgnoreCase("adjective")) {
                        ReadFiles.adjectiveList();
                        String viewingFile = ReadFiles.adjectiveInfo();
                        System.out.println(viewingFile);
                    } else if (viewPool.equalsIgnoreCase("all")) {
                        ReadFiles.verbList();
                        String viewingFile = ReadFiles.verbInfo();
                        System.out.println("Verbs: " + viewingFile);
                        ReadFiles.nounList();
                        viewingFile = ReadFiles.nounInfo();
                        System.out.println("Nouns: " + viewingFile);
                        ReadFiles.adjectiveList();
                        viewingFile = ReadFiles.adjectiveInfo();
                        System.out.println("Adjectives: " + viewingFile);
                    } else if (viewPool.equalsIgnoreCase("back")) {
                        stage = 1;
                    } else if (viewPool.equalsIgnoreCase("exit")) {
                        stage = -1;
                    } else {
                        stage = 4;
                    } break;
                case 2:
                    
                    ReadFiles.adjectiveList();
                    ReadFiles.nounList();
                    ReadFiles.verbList();
                    
                    int missingFileCounter = 0;
                    String chosenAdjective = "";
                    String chosenVerb = "";
                    String chosenNoun = "";

                    String verbInfo = ReadFiles.verbInfo();
                    verbArray = verbInfo.split(regex);
                    Random verbGenerator = new Random();

                    if (verbArray.length > 0) {
                        int givenVerb = verbGenerator.nextInt(verbArray.length);
                        chosenVerb = verbArray[givenVerb];
                        System.out.println(chosenVerb);
                    } else {
                        System.out.println("Missing verb pool.");
                        missingFileCounter++;
                    }   ReadFiles.verbList();

                    String nounInfo = ReadFiles.nounInfo();
                    nounArray = nounInfo.split(regex);
                    Random nounGenerator = new Random();

                    if (nounArray.length > 0){
                        int givenNoun = nounGenerator.nextInt(nounArray.length);
                        chosenNoun = nounArray[givenNoun];
                        System.out.println(chosenNoun);
                    } else {
                        System.out.println("Missing noun pool.");
                        missingFileCounter++;
                    }   
                    
                    String adjectiveInfo = ReadFiles.adjectiveInfo();
                    adjectiveArray = adjectiveInfo.split(regex);
                    Random adjectiveGenerator = new Random();

                    if (adjectiveArray.length > 0) {
                        int givenAdjective = adjectiveGenerator.nextInt(adjectiveArray.length);
                        chosenAdjective = adjectiveArray[givenAdjective];
                        System.out.println(chosenAdjective);
                    } else {
                        System.out.println("Missing adjective pool.");
                        missingFileCounter++;
                    }   
                    
                    if (missingFileCounter > 0) {
                        System.out.println("Could not generate prompt because of missing pools.");
                    } else {
                        String prompt = "Create a " + chosenAdjective + chosenNoun + chosenVerb + ".";
                        System.out.println(line);
                        System.out.println(" ");
                        System.out.println(prompt);
                        System.out.println("To generate a new prompt, run the program again.");
                        System.out.println(" ");
                        System.out.println(line);
                    }   
                    
                    System.out.println("Do you want a different prompt?");
                    firstResponse = response.nextLine();
                    if (firstResponse.equalsIgnoreCase("yes") || firstResponse.equalsIgnoreCase("y")) {
                        stage = 2;
                    } else if (firstResponse.equalsIgnoreCase("n") || firstResponse.equalsIgnoreCase("no")) {
                        System.out.println("Do you want to make changes to the prompt pool?");
                        firstResponse = response.nextLine();
                        if (firstResponse.equalsIgnoreCase("yes") || firstResponse.equalsIgnoreCase("y")){
                            stage = 1;
                        } else {
                            stage = -1;
                        }
                    } else if (firstResponse.equalsIgnoreCase("exit")) {
                        stage = -1;
                    } else if (firstResponse.equalsIgnoreCase("back")) {
                        stage = 1;
                    } else {
                        stage = -1;
                    }  break;
                case 4:
                    System.out.println("That is not a valid response.");
                    System.out.println("Press 'Enter' to confirm.");
                    firstResponse = response.nextLine();
                    if (firstResponse.equalsIgnoreCase("exit")){
                        stage = -1;
                    } else if (firstResponse.equalsIgnoreCase("back")) {
                        stage = 0;
                    } else{
                        System.out.println(firstResponse);
                        stage = 0;
                    }   break;
                default:
                    break;
            }

        }
        System.exit(0);
    }
    
}
