package oop.examples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Engine[] engines = null;
        Transmission[] transmissions = null;
        Chassis[] chassis = null;
        Car[] cars = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("############### CAR STOCK KEEPING UTILITY ###############");
        boolean isRunning = true;
        int option = 0;
        while(isRunning) {
            System.out.println("Choose an option from below menu : ");
            System.out.println("1. Enter Details of a Car");
            System.out.println("2. Get Details of a Car");
            System.out.println("3. Search a car by number");
            System.out.println("4. Quit Program");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter number of cars to store: ");
                    int numCars = scanner.nextInt();
                    engines = new Engine[numCars];
                    transmissions = new Transmission[numCars];
                    chassis = new Chassis[numCars];
                    cars = new Car[numCars];
                    for(int i=0; i<numCars; i++) {
                        scanner.nextLine(); // CONSUMES THE \n FORM FEED CHARACTER!!
                        System.out.println("Enter Engine Type : ");
                        engines[i] = new Engine();
                        String engineType = scanner.nextLine();
                        engines[i].setEngineType(engineType);

                        System.out.println("Enter Engine Capacity : ");
                        double engineCapacity = Double.parseDouble(scanner.nextLine());
                        engines[i].setEngineCapacity(engineCapacity);

                        System.out.println("Enter engine cyliders : ");
                        int cylinderCount = scanner.nextInt();
                        engines[i].setNumCylinders(cylinderCount);
                    }
                    break;
                case 2:
                    System.out.println("Enter Car Number to Search : ");
                    String carNum = scanner.nextLine();
                    for(int i=0; i<cars.length; i++) { // NO EXCEPTIONS CONSIDERED!
                        if(cars[i].getCarNum().equalsIgnoreCase(carNum)) {
                            System.out.println(cars[i]); // DEBUG THIS!!
                        }
                    }
                case 3:
                    System.out.println("bye..");
                    isRunning = false;
                    break;
            }
        }
    }
}

