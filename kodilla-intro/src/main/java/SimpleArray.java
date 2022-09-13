public class SimpleArray {
    public static void main (String [] args) {
        String [] f1team = new String [5];
                f1team[0] = "RedBull";
                f1team[1] = "Ferrari";
                f1team[2] = "Mercedes";
                f1team[3] = "Alpine";
                f1team[4] = "McLaren";

                System.out.print(f1team[2]);
                int numberOfElements = f1team.length;

                System.out.print("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}
