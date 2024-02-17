package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     while (true) {
         var scanner = new Scanner(System.in);
         System.out.println("Enter the speed of the car in km/h?");
         var speed = scanner.nextDouble();
         if (speed==0)
             break;

         System.out.println("Enter travel time in hours?");
         var time = scanner.nextDouble();
         if (time==0)
             break;

         var result = speed * time;
         System.out.println("The car will travel " + result + " in " + time + " hours.");
     }
    }
}