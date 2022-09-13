public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook(2000, 1200);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook(1200, 600);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();

    }
}