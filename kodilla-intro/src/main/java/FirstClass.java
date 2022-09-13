public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2022);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook(2000, 1200, 2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook(1200, 600, 2016);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();



        // Czy instrukcja warunka z pkt 4
        if (notebook.year <= 2020 && notebook.price >= 1000) {
            System.out.println("This laptop is overhyped ");
        } else if (notebook.year > 2015 && notebook.price < 800) {
            System.out.println("You can think");
        } else if (notebook.year > 2015 && notebook.price < 500) {
            System.out.println("Is it working?");
        } else {
            System.out.println("Should be good");
        }
    }
}