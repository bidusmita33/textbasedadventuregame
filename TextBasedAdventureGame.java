import java.util.Scanner;
public class TextBasedAdventureGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Text-Based Adventure Game!");
            System.out.println("You are a hero on a quest. Your decisions will shape your destiny.");

            while (true) {
                System.out.println("\nSelect an action:");
                System.out.println("1. Enter the dark cave.");
                System.out.println("2. Cross the old bridge.");
                System.out.println("3. Go through the enchanted forest.");
                System.out.println("4. Quit");

                int choice = getUserChoice(scanner);

                switch (choice) {
                    case 1:
                        exploreCave();
                        break;
                    case 2:
                        crossBridge();
                        break;
                    case 3:
                        enterForest();
                        break;
                    case 4:
                        System.out.println("Thank you for playing!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            }
        }

        private static int getUserChoice(Scanner scanner) {
            int choice = -1;
            while (choice == -1) {
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
            return choice;
        }

        private static void exploreCave() {
            System.out.println("You enter the dark cave and find a treasure chest.");
            System.out.println("What do you want to do?");
            System.out.println("1. Open the chest.");
            System.out.println("2. Leave the cave.");

            Scanner scanner = new Scanner(System.in);
            int choice = getUserChoice(scanner);

            if (choice == 1) {
                System.out.println("Congratulations! You found a magical sword.");
            } else if (choice == 2) {
                System.out.println("You leave the cave and continue your journey.");
            } else {
                System.out.println("Invalid choice. You leave the cave.");
            }
        }

        private static void crossBridge() {
            System.out.println("You approach the old bridge.");
            System.out.println("What do you want to do?");
            System.out.println("1. Cross the bridge.");
            System.out.println("2. Turn back.");

            Scanner scanner = new Scanner(System.in);
            int choice = getUserChoice(scanner);

            if (choice == 1) {
                System.out.println("The bridge collapses, and you fall into the river.");
                System.out.println("Game over!");
                System.exit(0);
            } else if (choice == 2) {
                System.out.println("You turn back and explore other paths.");
            } else {
                System.out.println("Invalid choice. You turn back.");
            }
        }

        private static void enterForest() {
            System.out.println("You enter the enchanted forest.");
            System.out.println("What do you want to do?");
            System.out.println("1. Follow the mysterious lights.");
            System.out.println("2. Take a different path.");

            Scanner scanner = new Scanner(System.in);
            int choice = getUserChoice(scanner);

            if (choice == 1) {
                System.out.println("The lights guide you to a hidden village.");
                System.out.println("You are safe and receive help from the villagers.");
                System.out.println("Congratulations! You completed your quest.");
                System.exit(0);
            } else if (choice == 2) {
                System.out.println("You take a different path but get lost in the forest.");
                System.out.println("Game over!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. You wander aimlessly in the forest.");
            }
        }
    }
