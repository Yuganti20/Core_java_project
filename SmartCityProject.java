package Mini_java_project;

import java.util.Scanner;

public class SmartCityProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Smart City App of Mumbai!");

        // Display the main menu
        boolean firstTime = true;
        int choice = 0;
        while (true) {
            if (firstTime) {
                System.out.println("Please select following options to get more information of it");
                firstTime = false;
            } else {
                System.out.println("Main Menu:");
            }
            System.out.println("1. Hotels");
            System.out.println("2. Transportation");
            System.out.println("3. Air Ticket Booking");
            System.out.println("4. Shopping Details");
            System.out.println("5. City News");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayHotels();
                    break;
                case 2:
                    displayTransportation();
                    break;
                case 3:
                    bookAirTicket();
                    break;
                case 4:
                    displayShoppingDetails();
                    break;
                case 5:
                    displayCityNews();
                    break;
                case 6:
                    System.out.println("Thank you for using Smart City App!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Display hotels in Mumbai
    public static void displayHotels() {
        System.out.println("List of Hotels in Mumbai: Taj Palace, The Oberoi, Trident, The Leela");
        // Code to fetch and display hotel details
    }

    // Display transportation facilities in Mumbai
    public static void displayTransportation() {
        System.out.println("List of Transportation Facilities in Mumbai: Metro, Bus, Taxi, Local Train");
        // Code to fetch and display transportation details
    }

    // Book air ticket for Mumbai
    public static void bookAirTicket() {
        System.out.println("Enter your travel details for Mumbai: First Class, Business Class, Economy Class");
        // Code to book air ticket for Mumbai
    }

    // Display shopping details in Mumbai
    public static void displayShoppingDetails() {
        System.out.println("List of Shopping Centers in Mumbai: Phoenix Marketcity, High Street Phoenix, Select Citywalk, DLF Mall of India");
        // Code to fetch and display shopping details
    }

    // Display city news in Mumbai
    public static void displayCityNews() {
        System.out.println("Latest News from Mumbai: COVID-19 cases are decreasing, but stay cautious!");
        // Code to fetch and display city news
    }
}
