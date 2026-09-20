package app;

import abstractfactory.GUIFactory;
import abstractfactory.MacOSFactory;
import abstractfactory.WindowsFactory;

import factorymethod.Logistics;
import factorymethod.RoadLogistics;
import factorymethod.SeaLogistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter delivery mode (ROAD or SEA): ");

        if (!scanner.hasNextLine()) {
            System.out.println("Missing delivery mode.");
            return;
        }

        String deliveryMode = scanner.nextLine().trim().toUpperCase();

        if (deliveryMode.isEmpty()) {
            System.out.println("Missing delivery mode.");
            return;
        }

        Logistics logistics;

        switch (deliveryMode) {
            case "ROAD":
                logistics = new RoadLogistics();
                break;

            case "SEA":
                logistics = new SeaLogistics();
                break;

            default:
                System.out.println("Unsupported delivery mode: " + deliveryMode);
                return;
        }

        System.out.print("Enter UI platform (WINDOWS or MACOS): ");

        if (!scanner.hasNextLine()) {
            System.out.println("Missing UI platform.");
            return;
        }

        String platform = scanner.nextLine().trim().toUpperCase();

        if (platform.isEmpty()) {
            System.out.println("Missing UI platform.");
            return;
        }

        GUIFactory guiFactory;

        switch (platform) {
            case "WINDOWS":
                guiFactory = new WindowsFactory();
                break;

            case "MACOS":
                guiFactory = new MacOSFactory();
                break;

            default:
                System.out.println("Unsupported UI platform: " + platform);
                return;
        }

        System.out.println();
        System.out.println("Delivery mode: " + deliveryMode);
        System.out.println("UI platform: " + platform);

        DeliveryApplication application =
                new DeliveryApplication(guiFactory, logistics);

        application.run(
                "laboratory equipment",
                "Aktau warehouse"
        );

        scanner.close();
    }
}