package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapHW {
    public static void hashMapHW(){

        HashMap<String, String[]> Car = new HashMap<String, String[]>();
        Car.put("Honda",new String[] {"Civic","HR-V","CR-V","Pilot","Accord"});
        Car.put("Ford",new String[] {"Edge","Escape","Expedition","Explorer","F-150"});
        Car.put("Kia",new String[] {"Forte","Optima","Sedona","Soul","Sportage"});
        Car.put("Toyota",new String[] {"Avalon","Camry","Prius","Sienna","Corolla"});
        Car.put("Lexus",new String[] {"IS","ES","LS","LS Hybrid","ES Hybrid"});
        Car.put("Mazda",new String[] {"CX-5","BT-50","CX-9","MAZDA2","MAZDA3"});

        Scanner input = new Scanner(System.in);
        System.out.println("What kind of model are you looking for?: ");
        String model = input.nextLine();

        if (Car.get(model) == null){
            System.out.println("Sorry we do not have that in stock.");
        } else {
            System.out.println("We have that model and here are the makes we have in stock.");
            for (String s:Car.get(model))
                System.out.println(s);
            }
        }

    }

