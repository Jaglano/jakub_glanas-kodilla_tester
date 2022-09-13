public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is quite cheap");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }
    }

    public void chceckWeight() {
        if (this.weight > 1500) {
            System.out.println("This device is very heavy");
        } else if (this.weight < 1500 && this.weight > 1000) {
            System.out.println("This device have average weight");
        } else if (this.weight < 1000) {
            System.out.println("This device is very light");
        }
    }

}
