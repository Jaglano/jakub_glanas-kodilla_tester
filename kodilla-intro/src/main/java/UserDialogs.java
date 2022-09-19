import java.util.Scanner;

public class UserDialogs {
    public static String getUsername(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of color:");
            String letter = scanner.nextLine().trim();
            if (letter.length() == 1) {
                return letter;
            }
            System.out.println("It's not first letter.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select letter (W-white, B-black, G-grey, O-orange, Y-yellow, P-pink):");
            String firstLetter = scanner.nextLine().trim().toUpperCase();

            switch (firstLetter) {
                case "W":
                    return "white";
                case "B":
                    return "black";
                case "G":
                    return "gray";
                case "O":
                    return "orange";
                case "Y":
                    return "yellow";
                case "P":
                    return "pink";
                default:
                    System.out.println("Please select a letter from list.");
            }
        }

    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }
    public static void main(String[] args) {
        UserDialogs userDialogs = new UserDialogs();
        String letter = userDialogs.getUserSelection();
        System.out.println("Your color is: " +  letter);
    }

}

