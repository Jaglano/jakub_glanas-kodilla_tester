public class User {
    String name;
    int howOld;

    public User (String name, int howOld) {
        this.name = name;
        this.howOld = howOld;
    }

    public void setHowOld(int howOld) {
        this.howOld = howOld;
        return;
    }
}